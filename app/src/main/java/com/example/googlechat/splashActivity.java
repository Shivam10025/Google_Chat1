package com.example.googlechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class splashActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        imageView = (ImageView)findViewById(R.id.logop);
        Animation myanim = AnimationUtils.loadAnimation(this , R.anim.myanim);
        imageView.startAnimation(myanim);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    sleep(2500);
                    Intent i = new Intent(splashActivity.this , MainActivity.class);
                    startActivity(i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}