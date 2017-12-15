package com.example.administrator.getreturnvalue;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/12/14.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context,AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);

        Button titleBack=(Button)findViewById(R.id.back);
        Button titleEdit=(Button)findViewById(R.id.edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();
            }
        });

        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Edit Edit",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
