
package com.polatic.polaticvideoplayer.local;

import com.polatic.polaticvideoplayer.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class LocalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_video_layout);

        VideoView video = (VideoView) findViewById(R.id.video);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(video);
        video.setMediaController(mediaController);
        video.setKeepScreenOn(true);
        video.setVideoPath(getString(R.string.video_path));
        video.start();
        video.requestFocus();

    }
}
