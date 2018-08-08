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

public class Bucket extends AppCompatActivity implements View.OnClickListener{
    private ImageButton ivBuc;
    private Button btnNex;
    private Button btnRetur;

    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private  int  bucket;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket);

        ivBuc = (ImageButton) findViewById(R.id.iv_bucket);
        btnNex = (Button) findViewById(R.id.bt_bucket);
        btnRetur = (Button) findViewById(R.id.bt_bucket1);

        ivBuc.setOnClickListener(this);
        btnNex.setOnClickListener(this);
        btnRetur.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        bucket = soundPool.load(this, R.raw.cub, 1);
        mediaPlayer = new MediaPlayer();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_bucket:
                soundPool.play(bucket, 1, 1, 0, 0, 1);
                break;

            case R.id.bt_bucket:
                Intent i = new Intent(this, Pencil.class);
                startActivity(i);
                finish();
                break;
            case R.id.bt_bucket1:
                Intent in = new Intent(this, Celphone.class);
                startActivity(in);
                finish();
                break;
            default:
                break;

        }

    }
}
