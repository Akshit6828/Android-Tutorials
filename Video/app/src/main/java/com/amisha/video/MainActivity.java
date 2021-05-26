package com.amisha.video;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.videoView);
         //to set the video in Videoviewer directly from the drawable
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.earth));
        //to set the controller for the controls of video.
        videoView.setMediaController(new MediaController(this));
        videoView.start();
        // implement on completion listener on video view
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this, "Thank You for watching", Toast.LENGTH_SHORT).show();
            }
        });
    }
}