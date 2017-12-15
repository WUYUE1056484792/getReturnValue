package com.example.administrator.getreturnvalue.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/12/15.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"接收广播",Toast.LENGTH_SHORT).show();
        abortBroadcast();//将这条广播截断，后面的广播接收器将无法接收这条广播
    }
}
