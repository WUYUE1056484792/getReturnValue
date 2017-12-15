package com.example.administrator.getreturnvalue.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.getreturnvalue.MainActivity;

/**
 * Created by Administrator on 2017/12/15.
 */

public class BaseActivity extends AppCompatActivity{

    private ForceOfflineReceiver receiver;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onResume(){
        super.onResume();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction("com.example.administrator.getreturnvalue.FORCE_OFFLINE");
        receiver=new ForceOfflineReceiver();
        registerReceiver(receiver,intentFilter);
    }

    @Override
    protected void onPause(){
        super.onPause();
        if(receiver!=null){
            unregisterReceiver(receiver);
            receiver=null;
        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

    class ForceOfflineReceiver extends BroadcastReceiver{
        @Override
        public void onReceive(final Context context, Intent intent){
            AlertDialog.Builder bulider=new AlertDialog.Builder(context);
            bulider.setTitle("警告");
            bulider.setMessage("你被迫下线，请重新登录");
            //bulider.setCancelable(false);//用户不可取消
            bulider.setPositiveButton("好的", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    ActivityCollector.finishAll();//关闭所有活动
                    Intent intent1=new Intent(context, MainActivity.class);
                    context.startActivity(intent1);//重启登录
                }
            });
              bulider.show();
        }
    }


}
