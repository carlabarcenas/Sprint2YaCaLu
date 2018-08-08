package com.example.yanet.recyclerview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class MemoActivity extends AppCompatActivity implements View.OnClickListener  {
    boolean banOk= false;
    Button btnIniciar;
    EditText txtPuntos;
    EditText txtTiros;
    ImageButton[] tablero=new ImageButton[20];
    int[] tarjetas=new int[20];
    int[] datos= new int[20];
    int click=0;
    int puntos=0;
    int pos1;//posición del primer click
    int pos2;//posición del segundo click
    boolean[] bloqueadas = new boolean[20];
    int tiros=0;

    int[]imagenes={R.drawable.attend, R.drawable.buy, R.drawable.call, R.drawable.care, R.drawable.celebrate, R.drawable.chatch, R.drawable.cook, R.drawable.drive, R.drawable.eat, R.drawable.listen, R.drawable.love, R.drawable.pay, R.drawable.save, R.drawable.share, R.drawable.sleep, R.drawable.talk, R.drawable.win };
    int[]verb={R.drawable.respattend, R.drawable.respbuy, R.drawable.respcall, R.drawable.respcare, R.drawable.respcelebrate, R.drawable.respcatch, R.drawable.respcook, R.drawable.respdrive, R.drawable.respeat, R.drawable.resplisten, R.drawable.resplove, R.drawable.resppay, R.drawable.respsave, R.drawable.respshare, R.drawable.respsleep, R.drawable.resptalk, R.drawable.respwin};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        InicializarTablero();txtPuntos=(EditText)findViewById(R.id.txt_puntos);
        txtTiros=(EditText)findViewById(R.id.txt_tiros);
        btnIniciar=(Button)findViewById(R.id.btn_new);
        btnIniciar.setOnClickListener(this);
    }
    public void InicializarTablero(){
        tablero[0]= (ImageButton)findViewById(R.id.button1);
        tablero[1]= (ImageButton)findViewById(R.id.button2);
        tablero[2]= (ImageButton)findViewById(R.id.button3);
        tablero[3]= (ImageButton)findViewById(R.id.button4);
        tablero[4]= (ImageButton)findViewById(R.id.button5);
        tablero[5]= (ImageButton)findViewById(R.id.button6);
        tablero[6]= (ImageButton)findViewById(R.id.button7);
        tablero[7]= (ImageButton)findViewById(R.id.button8);
        tablero[8]= (ImageButton)findViewById(R.id.button9);
        tablero[9]= (ImageButton)findViewById(R.id.button10);
        tablero[10]= (ImageButton)findViewById(R.id.button11);
        tablero[11]= (ImageButton)findViewById(R.id.button12);
        tablero[12]= (ImageButton)findViewById(R.id.button13);
        tablero[13]= (ImageButton)findViewById(R.id.button14);
        tablero[14]= (ImageButton)findViewById(R.id.button15);
        tablero[15]= (ImageButton)findViewById(R.id.button16);
        tablero[16]= (ImageButton)findViewById(R.id.button17);
        tablero[17]= (ImageButton)findViewById(R.id.button18);
        tablero[18]= (ImageButton)findViewById(R.id.button19);
        tablero[19]= (ImageButton)findViewById(R.id.button20);
        for(int i= 0; i<20;i++){
            tablero[i].setOnClickListener(this);
        }

    }

    public void mezclar() {
        boolean[]seleccionadas = new boolean[15];
        Random aleatoria=new Random();
        int x;
        int n=0;
        while(n<10){
            x= aleatoria.nextInt(seleccionadas.length);
            if(!seleccionadas[x]){
                tarjetas[n]= imagenes[x];
                tarjetas[n+10]=verb[x];
                datos[n]=n;
                datos[n+10]=n;
                n++;
                seleccionadas[x]=true;

            }
        }
        int tempo;
        int y;
        for(int i=1;i<=100;i++){
            x=aleatoria.nextInt(20);
            y=aleatoria.nextInt(20);
            tempo= tarjetas[x];
            tarjetas[x]=tarjetas[y];
            tarjetas[y]=tempo;
            tempo= datos[x];
            datos[x]=datos[y];
            datos[y]=tempo;
        }
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_new) {
            mezclar();
            for (int i = 0; i < 20; i++) {
                tablero[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.fondo1));
                bloqueadas[i]=false;
                tiros=0;
                click=0;
                puntos=0;
                txtTiros.setText(""+tiros);
                txtPuntos.setText(""+puntos);
            }
            banOk=true;
        }
        else if(banOk){
            switch (view.getId()) {

                case R.id.button1:
                    seleccionar(0);
                    break;
                case R.id.button2:
                    seleccionar(1);
                    break;
                case R.id.button3:
                    seleccionar(2);
                    break;
                case R.id.button4:
                    seleccionar(3);
                    break;
                case R.id.button5:
                    seleccionar(4);
                    break;
                case R.id.button6:
                    seleccionar(5);
                    break;
                case R.id.button7:
                    seleccionar(6);
                    break;
                case R.id.button8:
                    seleccionar(7);
                    break;
                case R.id.button9:
                    seleccionar(8);
                    break;
                case R.id.button10:
                    seleccionar(9);
                    break;
                case R.id.button11:
                    seleccionar(10);
                    break;
                case R.id.button12:
                    seleccionar(11);
                    break;
                case R.id.button13:
                    seleccionar(12);
                    break;
                case R.id.button14:
                    seleccionar(13);
                    break;
                case R.id.button15:
                    seleccionar(14);
                    break;
                case R.id.button16:
                    seleccionar(15);
                    break;
                case R.id.button17:
                    seleccionar(16);
                    break;
                case R.id.button18:
                    seleccionar(17);
                    break;
                case R.id.button19:
                    seleccionar(18);
                    break;
                case R.id.button20:
                    seleccionar(19);
                    break;
            }
            Handler handler=new Handler();
            if(click==2&&datos[pos1]==datos[pos2]){
                Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                puntos++;
                txtPuntos.setText(""+puntos);
                if (puntos ==10){
                    Toast.makeText(getApplication(),"Ya ganaste!!, en "+tiros+" tiros.",Toast.LENGTH_SHORT).show();
                }
            }else if(click==2&&datos[pos1]!=datos[pos2]){
                Toast.makeText(getApplication(),"Incorrecto!!",Toast.LENGTH_SHORT).show();
                bloqueadas[pos1]=false;
                bloqueadas[pos2]=false;
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tablero[pos1].setBackgroundDrawable(
                                getResources().getDrawable(R.drawable.fondo1));
                        tablero[pos2].setBackgroundDrawable(
                                getResources().getDrawable(R.drawable.fondo1));
                    }
                },300);


            }
            if(click==3){
                click=1;
            }
        }
    }

    public void seleccionar(int pos){
        if (bloqueadas[pos]==false) {
            tablero[pos].setBackgroundDrawable(getResources().getDrawable(tarjetas[pos]));
            if (click == 1) {
                pos1 = pos;
            } else {
                pos2 = pos;
            }
            bloqueadas[pos] = true;
            click++;
            tiros++;
            txtTiros.setText(""+tiros);
        }
    }
}
