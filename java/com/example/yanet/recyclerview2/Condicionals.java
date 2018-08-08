package com.example.yanet.recyclerview2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class Condicionals extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.condicionals);
        VideoView videoView = findViewById(R.id.videoView_conditi);
        Uri path = Uri.parse("android.resource://com.example.yanet.recyclerview2/"+R.raw.conditionals);
        //
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(path);
        videoView.start();

    }
}





