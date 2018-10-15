package com.example.administrator.dmiscountcat.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.administrator.dmiscountcat.R;

import java.util.List;

/**
 * Created by silver on 2018/7/3.
 */

public class AllRecordsAdapter extends RecyclerView.Adapter<AllRecordsAdapter.MyViewHolder> {
    private List<String> list;
    private LayoutInflater mInflater;
    private Activity contxt;


    public AllRecordsAdapter(Activity context, List<String> list) {
        this.list = list;
        mInflater = LayoutInflater.from(context);
        this.contxt = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        MyViewHolder viewHolder;
        view = mInflater.inflate(R.layout.item_account_details, parent, false);
        viewHolder = new MyViewHolder(view);
        viewHolder.setIsRecyclable(false);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return  5;
//                list.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {



    }

    public  class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvPhone;
        TextView tvDate;
        TextView tvContent;
        TextView tvAddress;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}

