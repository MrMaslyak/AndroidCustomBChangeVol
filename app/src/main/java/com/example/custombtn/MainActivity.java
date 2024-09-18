package com.example.custombtn;

import android.media.AudioManager;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        CustomBtn customBtn = findViewById(R.id.customBtn);


        customBtn.setOnClickListener(view -> {

            int currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

            int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);


            if (currentVolume < maxVolume) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, currentVolume + 1, AudioManager.FLAG_SHOW_UI);
                Toast.makeText(this, "Громкость увеличена", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Громкость уже на максимуме", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
