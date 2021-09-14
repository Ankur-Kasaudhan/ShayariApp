package com.example.shayari;

//OnBoarding screen setup
import android.os.Bundle;

import androidx.annotation.Nullable;

import io.github.dreierf.materialintroscreen.MaterialIntroActivity;
import io.github.dreierf.materialintroscreen.SlideFragmentBuilder;

public class IntroActivity extends MaterialIntroActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SlideFragmentBuilder()
                .title("Welcome to the App")
                .image(R.drawable.a)
                .buttonsColor(R.color.red)
                .backgroundColor(R.color.red1)
                .build());

        addSlide(new SlideFragmentBuilder()
                .title("Here is the best Collection for Your Partner")
                .image(R.drawable.bb)
                .buttonsColor(R.color.red)
                .backgroundColor(R.color.red1)
                .build());

        addSlide(new SlideFragmentBuilder()
                .title("Thank You for Downloading")
                .image(R.drawable.cc)
                .buttonsColor(R.color.red)
                .backgroundColor(R.color.red1)
                .build());
    }
}
