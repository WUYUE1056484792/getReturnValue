package com.example.administrator.getreturnvalue;

import android.content.DialogInterface;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;
import com.example.administrator.getreturnvalue.util.HttpUtil;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {
    private EditText editText1;
    private EditText editText2;
    private   List<String> a=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt=(Button) findViewById(R.id.button);
        Button butt1=(Button) findViewById(R.id.button1);
        TextView et1 = (TextView)findViewById(R.id.eT1);
        TextView et2 = (TextView)findViewById(R.id.eT2);
        editText1=(EditText) findViewById(R.id.editText1);
        editText2=(EditText) findViewById(R.id.editText2);
        butt.setOnClickListener(this);
        butt1.setOnClickListener(this);
        //butt.setOnLongClickListener(this);
        //butt1.setOnLongClickListener(this);

    }

    public void b1(View v){
        Toast.makeText(MainActivity.this,"点击了登录",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {

            //case R.id.button:Toast.makeText(MainActivity.this,"点击了登录",Toast.LENGTH_SHORT).show();
            case R.id.button1:Toast.makeText(MainActivity.this,"点击了登录1",Toast.LENGTH_SHORT).show();

        }
        Log.e("editText1",editText1.getText().toString());
        Log.e("editText2",editText2.getText().toString());

        HttpUtil.sendOkHttpRequest("http://weixin.yanxukj.com/TEASHOP/login/login?USERNAME="+editText1.getText().toString()+"&PASSWORD="+editText2.getText().toString(),new okhttp3.Callback(){
            @Override
               public void onResponse(Call call, Response response)throws IOException{
                //得到服务器返回的具体内容
                String responseData=response.body().string();
                Log.e("返回内容",responseData);
                Log.e("返回内容是否正确",responseData.toString());
                final JSONObject object=JSON.parseObject(responseData);
                final String data=object.getString("data");
                String msg=object.getString("msg");
                String userid=object.getString("userid");

                Log.e("data的内容222",object.toString());
                Log.e("data的内容",data.toString());
                a.add(data);
                a.add(msg);
                a.add(userid);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if(data.toString()=="true") {
                                ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,a);
                                ListView listView=(ListView)findViewById(R.id.list_view);
                                listView.setAdapter(adapter);
                                Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();

                               Intent intent=new Intent(MainActivity.this,LoginSuccessActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
                            }
                        }



                    });


            }


            @Override
               public void onFailure(Call call,IOException e){
                //Log.e("aaaaa","aaaaaa");
                //异常处理
            }
        });
    }



    @Override
    public boolean onLongClick(View v) {
        switch (v.getId()) {

            case R.id.button:
                Toast.makeText(MainActivity.this, "点--登录", Toast.LENGTH_SHORT).show();
            case R.id.button1:
                Toast.makeText(MainActivity.this, "点--登录1", Toast.LENGTH_SHORT).show();

        }
        return false;
    }
}
