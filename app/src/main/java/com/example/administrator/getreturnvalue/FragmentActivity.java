package com.example.administrator.getreturnvalue;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        replaceFragment(new RightFragment());


        /*getFragmentManager().beginTransaction().add(R.id.left_fragment,new LeftFragment()).commit();
        getFragmentManager().beginTransaction().add(R.id.right_fragment,new RightFragment()).commit();*/

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                replaceFragment(new AnotherRightFragment());
                break;
            default:
                break;
        }
    }

   private void replaceFragment(Fragment fragment){
       FragmentManager fragmentManager=getSupportFragmentManager();
       FragmentTransaction transaction=fragmentManager.beginTransaction();
       transaction.replace(R.id.right_layout,fragment);

       //碎片返回
       transaction.addToBackStack(null);
       transaction.commit();

   }
}
