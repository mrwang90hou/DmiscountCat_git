package com.example.administrator.dmiscountcat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.R;

import java.util.List;

public class Flassify_OneAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<String> list;
    private LayoutInflater inflater;
    private  OnItemClickListen listen;
    private  View view;  //对第一个item view的引用
    private boolean first = true;  //当点击list的item时，把第一个item的背景颜色改成false
    public Flassify_OneAdapter(List<String> list,Context context){
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_one_flassify,viewGroup,false);
        return new vHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        vHolder vh = (vHolder) viewHolder;
        vh.title.setText(list.get(i));
        vh.color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listen != null) listen.itemClick(v,i);
                if (first){view.setSelected(false);first=false;}
            }
        });
        if (i ==0){
            vh.color.setSelected(true);
            view = vh.color;
            Log.d("001", "onBindViewHolder: ");
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    private class vHolder extends  RecyclerView.ViewHolder{
        private TextView title;
        private LinearLayout color;
        public vHolder(@NonNull View itemView) {
            super(itemView);
            title= itemView.findViewById(R.id.item_one_flassify_title);
            color = itemView.findViewById(R.id.item_one_flassify_color);
        }
    }

    public void  setOnItemClick(OnItemClickListen listen){
        this.listen = listen;
    }
    //接口 设置点击事件
   public interface  OnItemClickListen{
        void itemClick(View view,int position);
    }
}
