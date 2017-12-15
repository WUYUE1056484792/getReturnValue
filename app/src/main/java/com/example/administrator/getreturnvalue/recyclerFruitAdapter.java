package com.example.administrator.getreturnvalue;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/12/13.
 */

public class recyclerFruitAdapter extends RecyclerView.Adapter<recyclerFruitAdapter.ViewHolder> {

    private List<Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolder(View view){
            super(view);
            fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
            fruitName=(TextView)view.findViewById(R.id.fruit_name);
        }
    }

    public recyclerFruitAdapter(List<Fruit> fruitList){
        mFruitList=fruitList;
    }

    @Override
    public recyclerFruitAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {//创建ViewHolder实例
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(recyclerFruitAdapter.ViewHolder holder, int position) {//赋值
        Fruit fruit=mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
