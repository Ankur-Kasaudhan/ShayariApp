package com.example.shayari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.card1).setOnClickListener(this);
        findViewById(R.id.card2).setOnClickListener(this);
        findViewById(R.id.card3).setOnClickListener(this);
        findViewById(R.id.card4).setOnClickListener(this);
        findViewById(R.id.card5).setOnClickListener(this);
        findViewById(R.id.card6).setOnClickListener(this);
        findViewById(R.id.card7).setOnClickListener(this);
        findViewById(R.id.card8).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.item1:
                Intent intent1 = new Intent(MainActivity.this, Terms_Conditions.class);
                startActivity(intent1);

            case R.id.item2:
                return true;
            case R.id.item3:

                Intent intent = new Intent(MainActivity.this,Developer.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,ShayariActivity.class);
        switch (v.getId())
        {
            case R.id.card1:
                intent.putExtra("cat",1);
                startActivity(intent);
                break;
            case R.id.card2:
                intent.putExtra("cat",2);
                startActivity(intent);
                break;
            case R.id.card3:
                intent.putExtra("cat",3);
                startActivity(intent);
                break;
            case R.id.card4:
                intent.putExtra("cat",4);
                startActivity(intent);
                break;
            case R.id.card5:
                intent.putExtra("cat",5);
                startActivity(intent);
                break;
            case R.id.card6:
                intent.putExtra("cat",6);
                startActivity(intent);
                break;
            case R.id.card7:
                intent.putExtra("cat",7);
                startActivity(intent);
                break;
            case R.id.card8:
                intent.putExtra("cat",8);
                startActivity(intent);
                break;

        }
    }
}