package com.example.administrator.getreturnvalue;


import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.administrator.getreturnvalue.broadcast.BroadCastActivity;
import com.example.administrator.getreturnvalue.broadcast.MyBroadCastActivity;
import com.example.administrator.getreturnvalue.broadcast.forceleaveActivity;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;


public class LoginSuccessActivity extends AppCompatActivity {


    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        BottomBar bottomBar=(BottomBar)findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId) {
                    case R.id.tab1:

                        break;
                    case R.id.tab2:
                        //Toast.makeText(LoginSuccessActivity.this,"水果",Toast.LENGTH_SHORT).show();

                        Intent intent=new Intent(LoginSuccessActivity.this,FruitActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.tab3:
                        //Toast.makeText(LoginSuccessActivity.this,"水果3",Toast.LENGTH_SHORT).show();
                        Intent intent2=new Intent(LoginSuccessActivity.this,RecyclerActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.tab4:
                        //Toast.makeText(LoginSuccessActivity.this,"水果",Toast.LENGTH_SHORT).show();
                        Intent intent4=new Intent(LoginSuccessActivity.this,FourActivity.class);
                        startActivity(intent4);
                        break;
                    case R.id.tab5:
                        //Toast.makeText(LoginSuccessActivity.this,"水果",Toast.LENGTH_SHORT).show();
                        Intent intent5=new Intent(LoginSuccessActivity.this,FragmentActivity.class);
                        startActivity(intent5);
                        break;
                    case R.id.tab6:
                        //Toast.makeText(LoginSuccessActivity.this,"水果",Toast.LENGTH_SHORT).show();
                        Intent intent6=new Intent(LoginSuccessActivity.this,NewsActivity.class);
                        startActivity(intent6);
                        break;
                    case R.id.tab7:
                        //Toast.makeText(LoginSuccessActivity.this,"水果",Toast.LENGTH_SHORT).show();
                        Intent intent7=new Intent(LoginSuccessActivity.this,BroadCastActivity.class);
                        startActivity(intent7);
                        break;
                    case R.id.tab8:
                        //Toast.makeText(LoginSuccessActivity.this,"水果",Toast.LENGTH_SHORT).show();
                        Intent intent8=new Intent(LoginSuccessActivity.this,MyBroadCastActivity.class);
                        startActivity(intent8);
                        break;
                    case R.id.tab9:
                        //Toast.makeText(LoginSuccessActivity.this,"水果",Toast.LENGTH_SHORT).show();
                        Intent intent9=new Intent(LoginSuccessActivity.this,forceleaveActivity.class);
                        startActivity(intent9);
                        break;
                }
            }
        });








    }




}
