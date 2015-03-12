package com.example.ina.videoplayer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView group4VideoView = (VideoView) findViewById(R.id.group4VideoView);
        group4VideoView.setVideoPath("http://techslides.com/demos/sample-videos/small.mp4");

        //Player controls (play, pause, stop, etc...)
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(group4VideoView);
        group4VideoView.setMediaController(mediaController);

        group4VideoView.start();
    }
}
