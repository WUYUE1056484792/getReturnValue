package com.example.administrator.getreturnvalue.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.getreturnvalue.R;

public class MyBroadCastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_broad_cast);

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.example.administrator.getreturnvalue.broadcast.MY_BROADCAST");
                //sendBroadcast(intent);//标准广播
                sendOrderedBroadcast(intent,null);//有序广播
            }
        });
    }
}
