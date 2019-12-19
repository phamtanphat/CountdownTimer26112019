package com.example.countdowntimer26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    int[] mArrayImages = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
