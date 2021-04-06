package com.example.groupe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class splashActivity extends AppCompatActivity {
ImageView logo;
TextView tvsplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //        Hilangkan ActionBar
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 4000L);
        // Animation
        logo = (ImageView) findViewById(R.id.logo);
        tvsplash = (TextView)findViewById(R.id.tvsplash);
//        Import animasi
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.one);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.two );
//        Eksekusi animasi
        logo.startAnimation(animation);
        tvsplash.startAnimation(animation1);


    }
}
