package com.example.mehmetmetin436.proje;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by metin on 2.01.2018.
 */

public class RebootReciever extends BroadcastReceiver {

    long ON_DAKIKA=600*1000;

    @Override
    public void onReceive(Context context, Intent intent) {
        AlarmManager alarm =(AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent myIntent = new Intent(context,MainActivity.class);
        PendingIntent p = PendingIntent.getActivity(context, 1,myIntent,0);
        alarm.setRepeating(AlarmManager.ELAPSED_REALTIME,ON_DAKIKA,ON_DAKIKA,p);
    }

}
