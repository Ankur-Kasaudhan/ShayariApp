package com.example.shayari;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        preferences = this.getSharedPreferences("Splash",MODE_PRIVATE);
        editor=preferences.edit();
        ImageView imageView = findViewById(R.id.spalsh_img);
        Glide.with(this).asGif().load(R.raw.tenor).into(imageView);  //Adding Gif using Glide

        //This is for SplashScreen:-
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                //Here I am checking that user Enter first time in the app or not:-
                if (preferences.getBoolean("isMain",false))
                {
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }else {
                    editor.putBoolean("isMain",true);
                    editor.apply();

                    TaskStackBuilder.create(SplashScreen.this)
                            .addNextIntentWithParentStack(new Intent(SplashScreen.this,MainActivity.class))
                            .addNextIntent(new Intent(SplashScreen.this,IntroActivity.class))
                            .startActivities();
                }
            }
        },3000);  //Time for splashScreen:
    }
}