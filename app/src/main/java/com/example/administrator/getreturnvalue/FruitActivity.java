package com.example.administrator.getreturnvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FruitActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        initFruits();//初始化水果数据
        final FruitAdapter adapter=new FruitAdapter(FruitActivity.this,R.layout.item_flist,fruitList);
        ListView listView=(ListView) findViewById(R.id.list_view2);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);

                Toast.makeText(FruitActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
                fruitList.remove(position);

                adapter.notifyDataSetChanged();

            }
        });
    }

    private void initFruits() {
        for(int i=0;i<4;i++){
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
