package com.example.yanet.recyclerview2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Celphone extends AppCompatActivity implements View.OnClickListener{
    private ImageButton ivCel;
    private Button btnNext;
    private Button btnReturn;

    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private  int celphone;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celphone);

        ivCel= (ImageButton)findViewById(R.id.iv_celu0);
        btnNext=(Button)findViewById(R.id.bt_cel);
        btnReturn=(Button)findViewById(R.id.bt_celu);

        ivCel.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        celphone= soundPool.load(this, R.raw.cel,1);
        mediaPlayer = new MediaPlayer();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_celu0:
                soundPool.play(celphone, 1, 1, 0, 0, 1);
                break;

            case R.id.bt_cel:
                Intent i = new Intent(this, Bucket.class);
                startActivity(i);
                finish();
                break;
            case R.id.bt_celu:
                Intent in = new Intent(this, Computer.class);
                startActivity(in);
                finish();
                break;
            default:
                break;

        }



    }


}