package com.example.nasa.sneakynotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{
    LinearLayout l,l1,l2;
    Animation uptodown,downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);

        l=(LinearLayout) findViewById(R.id.welcome);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Sneaky.class);
                startActivity(i);
            }
        });
    }
}
