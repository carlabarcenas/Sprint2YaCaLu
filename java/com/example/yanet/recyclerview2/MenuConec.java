package com.example.yanet.recyclerview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuConec extends AppCompatActivity {
    private Button CCbutton;
    private Button C2button;
    private Button ACbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_conec);


        CCbutton = (Button) findViewById(R.id.type1);
        CCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ConclusiveConnectorsActivity.class);
                startActivityForResult(intent, 0);

            }

        });
        C2button = (Button) findViewById(R.id.type2);
        C2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ContinuativesConnectorsActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        ACbutton = (Button) findViewById(R.id.type3);
        ACbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AdversativesConnectorsActivity.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}