package com.example.administrator.getreturnvalue.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.getreturnvalue.R;

public class forceleaveActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forceleave);

        Button forceOffline=(Button)findViewById(R.id.force_offlice);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.example.administrator.getreturnvalue.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }
}
