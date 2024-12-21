package com.example.boxflip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MainActivity extends AppCompatActivity {

    private View box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box = findViewById(R.id.box);

        findViewById(R.id.btn_up).setOnClickListener(v -> animateBox(R.anim.flip_up));
        findViewById(R.id.btn_down).setOnClickListener(v -> animateBox(R.anim.flip_down));
        findViewById(R.id.btn_left).setOnClickListener(v -> animateBox(R.anim.flip_left));
        findViewById(R.id.btn_right).setOnClickListener(v -> animateBox(R.anim.flip_right));
    }

    private void animateBox(int animationResource) {
        Animation animation = AnimationUtils.loadAnimation(this, animationResource);
        box.startAnimation(animation);
    }
}
