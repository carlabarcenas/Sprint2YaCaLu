package com.example.yanet.recyclerview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.view.DragEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;




public class ListAdjectives extends AppCompatActivity implements View.OnClickListener {
    LinearLayout target1, target2, target3, target4;
    Button test1, test2, test3, test4, btn1, btn2, btn3, btn4, btnPregunta;

    int[] preg ={R.id.target1,R.id.target2, R.id.target3, R.id.target4};
    int [] resp={R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4};
    int y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.list_adjectives);




        target1 = (LinearLayout) findViewById(R.id.target1);
        target2 = (LinearLayout) findViewById(R.id.target2);
        target3 = (LinearLayout) findViewById(R.id.target3);
        target4 = (LinearLayout) findViewById(R.id.target4);

        test1 = (Button) findViewById(R.id.test1);
        test2 = (Button) findViewById(R.id.test2);
        test3 = (Button) findViewById(R.id.test3);
        test4 = (Button) findViewById(R.id.test4);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btnPregunta = (Button) findViewById(R.id.nuevo);

        target1.setOnDragListener(dragListenre);
        target2.setOnDragListener(dragListenre);
        target3.setOnDragListener(dragListenre);
        target4.setOnDragListener(dragListenre);

        btn1.setOnLongClickListener(longClickListener);
        btn2.setOnLongClickListener(longClickListener);
        btn3.setOnLongClickListener(longClickListener);
        btn4.setOnLongClickListener(longClickListener);
        btnPregunta.setOnClickListener((View.OnClickListener) this);



    }


    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder myShadwoBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadwoBuilder, v, 0);
            return true;
        }
    };

    View.OnDragListener dragListenre = new View.OnDragListener() {

        @Override
        public boolean onDrag(View v, DragEvent event) {

            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();

            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    if (view.getId() == R.id.btn1){
                        test1.setText("The Car is new");
                    }else
                    if (view.getId() == R.id.btn2){
                        test2.setText("What you wrote her is dreadful");
                    }
                    else
                    if (view.getId() == R.id.btn3){
                        test3.setText("The Earth is round");
                    }
                    else
                    if (view.getId() == R.id.btn4){
                        test4.setText("The meeting was interesting.");
                    }
                    break;

                case DragEvent.ACTION_DRAG_EXITED:

                    break;
                case DragEvent.ACTION_DROP:
                    if(view.getId() == R.id.btn1){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);

                    }else
                    if(view.getId() == R.id.btn2 && v.getId() == R.id.target2){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);


                    }else
                    if(view.getId() == R.id.btn3 && v.getId() == R.id.target3) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                    }
                    if(view.getId() == R.id.btn4 && v.getId() == R.id.target4){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);

                    }

                    break;

            }
            return true;
        }

    };


    public void onClick(View view) {
        Random rn = new Random();
        //for(int i =0; i < 5; i++)
        //{
        switch (y){
            case 0:
                test1.setVisibility(View.INVISIBLE);
                break;
            case 1:
                test2.setVisibility(View.INVISIBLE);
                break;
            case 2:
                test3.setVisibility(View.INVISIBLE);
                break;
            case 3:
                test4.setVisibility(View.INVISIBLE);


        }
        y = rn.nextInt(preg.length);

        ;
        //System.out.println(preg[x]);
        //}
        switch (y){
            case 0:
                test1.setVisibility(View.VISIBLE);
                break;
            case 1:
                test2.setVisibility(View.VISIBLE);
                break;
            case 2:
                test3.setVisibility(View.VISIBLE);
                break;
            case 3:
                test4.setVisibility(View.VISIBLE);


        }


    }
}

