package com.example.yanet.recyclerview2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicUrl extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_url);
        btn=(Button)findViewById(R.id.boton_navegacion);
        btn1=(Button)findViewById(R.id.boton_navegacion1);
        btn2=(Button)findViewById(R.id.boton_navegacion2);
        btn3=(Button)findViewById(R.id.boton_navegacion3);
        btn4=(Button)findViewById(R.id.boton_navegacion4);
        btn5=(Button)findViewById(R.id.boton_navegacion5);
        btn6=(Button)findViewById(R.id.boton_navegacion6);

        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        //El brindamos el dato necesario a Uri
        int fuente;
        fuente = v.getId();
        String pagina_carga = "http://www.google.com";
        switch (fuente){
            case R.id.boton_navegacion:
                pagina_carga="https://www.letraseningles.es/letrascanciones/traduccionesAC/letrasAC.html";
                break;
            case R.id.boton_navegacion1:
                pagina_carga="https://www.letraseningles.es/";
                break;
            case R.id.boton_navegacion2:
                pagina_carga="https://www.musica.com/letras.asp?letra=1281045";
                break;
            case R.id.boton_navegacion3:
                pagina_carga="https://www.songstraducidas.com/";
                break;
            case R.id.boton_navegacion4:
                pagina_carga="http://noticias.universia.es/educacion/noticia/2015/05/12/1124816/aprende-ingles-escuchando-canciones-beatles.html";
                break;
            case R.id.boton_navegacion5:
                pagina_carga="https://elblogdeidiomas.es/10-canciones-para-mejorar-tu-ingles-a1-a2/";
                break;
            case R.id.boton_navegacion6:
                pagina_carga="https://englishlive.ef.com/es-es/blog/ingles-para-el-mundo-real/mejores-canciones-aprender-ingles/";
                break;



        }


        Uri uriUrl = Uri.parse(pagina_carga);
        //Especificamos la accion a realizar con el ACTION_VIEW
        //para que elija lo mas razonable
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);



    }











}


