package com.example.administrator.getreturnvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        initFruits();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerFruitAdapter adapter=new recyclerFruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for(int i=0;i<1;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit li=new Fruit("li",R.drawable.li);
            fruitList.add(li);
            Fruit boluo=new Fruit("boluo",R.drawable.boluo);
            fruitList.add(boluo);
            Fruit orange=new Fruit("orange",R.drawable.orange);
            fruitList.add(orange);
        }
    }
}
