package com.example.yanet.recyclerview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Entry  extends AppCompatActivity implements View.OnClickListener{
private Button btNext;
private ImageView ivObjets;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        btNext = (Button)findViewById(R.id.bt_objets);
        ivObjets = (ImageView)findViewById(R.id.iv_objets);
             btNext.setOnClickListener(this);

        }


@Override
public void onClick(View v) {
        Intent i = new Intent(this, Bed.class );
        startActivity(i);

        }

        }


