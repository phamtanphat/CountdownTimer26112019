package com.example.countdowntimer26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    int[] mArrayImages = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3
    };
    ImageView mImgBanner;
    Button mBtnStart;
    int mCount = 0;
    boolean mIsLoading = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStart = findViewById(R.id.buttonStartBanner);
        mImgBanner = findViewById(R.id.imageviewBanner);

        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIsLoading) {
                    return;
                }
                mIsLoading = true;
                CountDownTimer countDownTimer = new CountDownTimer((mArrayImages.length * 1000) + 1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        mImgBanner.setImageResource(mArrayImages[mCount++]);
                    }

                    @Override
                    public void onFinish() {
                        mCount = 0;
                        this.start();
                    }
                };
                countDownTimer.start();
            }
        });

    }
}
