package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        VideoView dance = findViewById(R.id.dance);
        dance.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demo);
        MediaController mediaController = new MediaController(this);
        dance.setMediaController(mediaController);
        mediaController.setAnchorView(dance);
        dance.start();
    }
}