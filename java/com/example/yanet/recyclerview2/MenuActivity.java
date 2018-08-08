package com.example.yanet.recyclerview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    private ImageButton  Wr;
    private ImageButton LvEnglish;
    private ImageButton Gra;
    private ImageButton Ta;
    private ImageButton Voc;
    private ImageButton Or;
    private ImageButton Ad;
    private ImageButton Ob;
    private ImageButton Con;
    private ImageButton Fra;
    private ImageButton Pres;
    private ImageButton Cond;
    private ImageButton Exp;
    private ImageButton Ur;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Wr = (ImageButton) findViewById(R.id.wr);
        Wr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), WritingReports.class);
                startActivityForResult(intent, 0);
            }
        });

        LvEnglish = (ImageButton) findViewById(R.id.lvEnglish);
        LvEnglish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ListDisplay.class);
                startActivityForResult(intent, 0);
            }
        });

        Gra = (ImageButton) findViewById(R.id.gra);
        Gra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), GramarActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Ta= (ImageButton) findViewById(R.id.ta);
        Ta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ListAdjectives.class);
                startActivityForResult(intent, 0);
            }
        });

        Voc= (ImageButton) findViewById(R.id.voc);
        Voc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),GameDragwords.class);
                startActivityForResult(intent, 0);
            }
        });


        Or= (ImageButton) findViewById(R.id.or);
        Or.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), GameComplementation.class);
                startActivityForResult(intent, 0);
            }
        });

        Ad= (ImageButton) findViewById(R.id.ad);
        Ad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MemoActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        Ob= (ImageButton) findViewById(R.id.ob);
        Ob.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Entry.class);
                startActivityForResult(intent, 0);
            }
        });

      /* esta linea tiene error*/
        Con = (ImageButton) findViewById(R.id.con);
        Con.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ProcesoConecActivity.class);
                startActivityForResult(intent, 0);
            }
        });



        Fra= (ImageButton) findViewById(R.id.fra);
        Fra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), VerbPhrases.class);
                startActivityForResult(intent, 0);
            }
        });


        Pres= (ImageButton) findViewById(R.id.pres);
        Pres.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Condicionals.class);
                startActivityForResult(intent, 0);
            }
        });


        Cond= (ImageButton) findViewById(R.id.cond);
        Cond.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Tips.class);
                startActivityForResult(intent, 0);
            }
        });


        Exp= (ImageButton) findViewById(R.id.exp);
        Exp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), BusinessEnglish.class);
                startActivityForResult(intent, 0);
            }
        });


        Ur= (ImageButton) findViewById(R.id.ur);
        Ur.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MusicUrl.class);
                startActivityForResult(intent, 0);
            }
        });


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





























