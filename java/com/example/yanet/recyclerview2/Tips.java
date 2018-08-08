package com.example.yanet.recyclerview2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

public class Tips extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips);
        VideoView videoView = findViewById(R.id.videoView_tips);
        Uri path = Uri.parse("android.resource://com.example.yanet.recyclerview2/"+R.raw.ingles);
        //
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(path);
        videoView.start();

    }
}



