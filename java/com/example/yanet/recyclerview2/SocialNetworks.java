package com.example.yanet.recyclerview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class
SocialNetworks extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social_networks);

        Button btn = (Button) findViewById(R.id.btnFb);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), FacebookActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        Button btn1 = (Button) findViewById(R.id.btnyoutube);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Youtube.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}