package com.example.yanet.recyclerview2;

import android.app.Activity;
        import android.net.Uri;
        import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class WritingReports extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writing_reports);
        VideoView videoView = findViewById(R.id.videoView_video);
        Uri path = Uri.parse("android.resource://com.example.yanet.recyclerview2/"+ R.raw.writing_reports);
        //+ R.raw.writing_reports 2131427328
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(path);
        videoView.start();

    }
}



