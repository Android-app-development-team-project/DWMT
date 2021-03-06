package com.example.dwmt;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;

import java.util.Random;

public class Metronome {
    SoundPool soundPool;
    int soundID;
    int cnt;
    Random random;

    public Metronome(Context activity){
        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        soundID = soundPool.load(activity, R.raw.beep,0);
        cnt = 0;
        random = new Random();
    }

    public void setRandomCnt(){
        cnt = random.nextInt(100);
        Log.i("cnt", "random cnt: " + cnt);

    }

    public void play(){
        soundPool.play(soundID,1f,1f, 0, 0, 1f);
        cnt--;
    }

    public int getCnt(){ return cnt; }
//    public void resetCnt(){ return cnt; }
}
