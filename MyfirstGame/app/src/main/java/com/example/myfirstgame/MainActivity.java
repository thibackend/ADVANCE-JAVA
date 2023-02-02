package com.example.myfirstgame;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int i = 10;
    SeekBar sbBird1;
    SeekBar sbBird2;
    SeekBar sbBird3;
    TextView tvDem;

    Random rd = new Random();

    long  tgBird1 =0 , tgBird2=0,tgBird3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        CountDownTimer myCount = new CountDownTimer(5000,500) {
            @Override
            public void onTick(long l) {
                tvDem.setText(l +"");
                if(sbBird1.getProgress()>= sbBird2.getMax()){
                    tgBird1 = 5000-l;
                }
                else{
                    sbBird1.setProgress(sbBird1.getProgress() + rd.nextInt(5));
                }
                if (sbBird2.getProgress() >= sbBird1.getMax()) {
                    tgBird2 = 5000 - l;
                }else{
                    sbBird2.setProgress(sbBird2.getProgress() + rd.nextInt(5));
                }
                if(sbBird3.getProgress()>=sbBird2.getMax()){
                    tgBird3 = 5000-l;
                }else{
                    sbBird3.setProgress(sbBird3.getProgress()+rd.nextInt(5));
                }
            }

            @Override
            public void onFinish() {
                tvDem.setText("Time's up!!!");
                tvDem.setText("TG Bird1: "+tgBird1 + "TG Bird2: "+ tgBird2 + "Tg Bird3 : " +tgBird3 );
            }
        }.start();




//    phần này là phần ánh xạ từ xml sang phần jav
    }
    public void AnhXa(){
        sbBird1 = findViewById(R.id.seekBar1);
        sbBird2 = findViewById(R.id.seekBar2);
        sbBird3 = findViewById(R.id.seekBar3);
        tvDem =findViewById(R.id.textViewDem);

    }
}