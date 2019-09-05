package com.example.umix.basicphrases;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    //aray of audio files
    int[] files = {
      R.raw.doyouspeakenglish,
            R.raw.goodevening,
            R.raw.hello,
            R.raw.howareyou,
            R.raw.ilivein,
            R.raw.mynameis,
            R.raw.please,
            R.raw.welcome
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void play(View view){
        Button clickedBtn = (Button) view;
        Log.i("Clicked button is ", clickedBtn.getTag().toString());
        MediaPlayer mp = MediaPlayer.create(this,
                getResources().getIdentifier(clickedBtn.getTag().toString(), "raw", getPackageName()));
        mp.start();
    }
}
