package com.example.nasa.sneakynotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sneaky extends AppCompatActivity
{
    Button e,d;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneaky);

        e=(Button)findViewById(R.id.encrypt);
        d=(Button)findViewById(R.id.decrypt);

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sneaky.this,Encrpyt.class);
                startActivity(i);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sneaky.this,Decrypt.class);
                startActivity(i);
            }
        });
    }
}
