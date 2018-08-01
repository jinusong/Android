package com.example.dsm2018.videoplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayerActivity extends AppCompatActivity {

    String TAG = "VideoPlayer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        final VideoView videoView =
                (VideoView) findViewById(R.id.videoView1);

        videoView.setVideoPath(
                "http://ebbokfrenzy.com/android_book/movie.mp4");

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setOnPreparedListener(new
                MediaPlayer.OnPreparedListener() {
                @Override
                    public void onPrepared(MediaPlayer mp) {
                    Log.i(TAG, "Duratiom = " +
                    videoView.getDuration());
                }
        });
        videoView.start();
    }
}