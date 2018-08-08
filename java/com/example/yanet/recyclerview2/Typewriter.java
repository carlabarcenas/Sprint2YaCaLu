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

public class Typewriter extends AppCompatActivity implements View.OnClickListener {
    private ImageButton ibType;
    private Button btNext;
    private Button btReturn;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typewriter);


        ibType = (ImageButton) findViewById(R.id.iv_maquina);
        btNext = (Button) findViewById(R.id.bt_maqu);
        btReturn = (Button) findViewById(R.id.bt_maquin);


        ibType.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        type = soundPool.load(this, R.raw.maqui,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_maquina:
                soundPool.play(type, 1, 1,0,0,1);
                break;
            case R.id.bt_maqu:
                Intent i = new Intent(this, MenuActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.bt_maquin:
                Intent in = new Intent(this, Camera.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }


    }
}

