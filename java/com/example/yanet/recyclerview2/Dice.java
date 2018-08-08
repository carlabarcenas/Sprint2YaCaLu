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

public class Dice extends AppCompatActivity implements View.OnClickListener{
    private ImageButton ibtDi;
    private Button btNext;
    private Button btReturn;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int dice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);


        ibtDi = (ImageButton) findViewById(R.id.iv_dice);
        btNext = (Button) findViewById(R.id.bt_dice);
        btReturn = (Button) findViewById(R.id.bt_dice1);


        ibtDi.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        dice = soundPool.load(this, R.raw.dad,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_dice:
                soundPool.play(dice, 1, 1,0,0,1);
                break;
            case R.id.bt_dice:
                Intent i = new Intent(this, Glasses.class);
                startActivity(i);
                finish();
                break;
            case R.id.bt_dice1:
                Intent in = new Intent(this, Chair.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }


    }
}
