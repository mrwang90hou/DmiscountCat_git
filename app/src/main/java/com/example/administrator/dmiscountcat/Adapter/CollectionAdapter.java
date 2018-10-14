package com.example.administrator.dmiscountcat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.Bean.HomeBean;
import com.example.administrator.dmiscountcat.R;

import java.util.List;

public class CollectionAdapter extends RecyclerView.Adapter {

    private Context context;
    private LayoutInflater inflater;
    private List<HomeBean> list;

    public CollectionAdapter( List<HomeBean> list,Context context){
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_collection,viewGroup,false);

        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
         VHolder vh = (VHolder) viewHolder;
         vh.title.setText(list.get(i).getTitle()+"");
         vh.current.setText(list.get(i).getCurrent()+"");
         vh.volume.setText(list.get(i).getVolume()+"");
         vh.price.setText(list.get(i).getPrice()+"");
         vh.coupon.setText(list.get(i).getCoupon()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class VHolder extends RecyclerView.ViewHolder{
        private ImageView Image ;  //展示图片

        private  TextView title;  //标题
        private TextView current;  //原价
        private TextView volume;  //销量
        private TextView price;   //券后价
        private TextView coupon;   //优惠价格
        public VHolder(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.item_collection_image);

            title = itemView.findViewById(R.id.item_collection_title);
            current = itemView.findViewById(R.id.item_collection_price);
            volume = itemView.findViewById(R.id.item_collection_count);
            price = itemView.findViewById(R.id.item_collection_discount);
            coupon = itemView.findViewById(R.id.item_collection_ticket);

        }
    }
}
