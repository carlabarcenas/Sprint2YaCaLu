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

public class Keys extends AppCompatActivity implements View.OnClickListener{
    private ImageButton ibKey;
    private Button btNext;
    private Button btReturn;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int keys;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keys);

        ibKey = (ImageButton) findViewById(R.id.iv_llaves);
        btNext = (Button) findViewById(R.id.bt_lla);
        btReturn = (Button) findViewById(R.id.bt_llav);


        ibKey.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        keys = soundPool.load(this, R.raw.lla,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_llaves:
                soundPool.play(keys, 1, 1,0,0,1);
                break;
            case R.id.bt_lla:
                Intent i = new Intent(this, Lantern.class);
                startActivity(i);
                finish();
                break;
            case R.id.bt_llav:
                Intent in = new Intent(this, Glasses.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }


    }


}
