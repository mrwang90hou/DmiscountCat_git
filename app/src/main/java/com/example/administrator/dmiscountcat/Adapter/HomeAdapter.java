package com.example.administrator.dmiscountcat.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.dmiscountcat.Bean.HomeBean;
import com.example.administrator.dmiscountcat.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter {
    private List<HomeBean> list;
    private Context context;
    private LayoutInflater inflater;

    public HomeAdapter(List<HomeBean> list,Context context){
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_home,viewGroup,false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        VHolder vh = (VHolder) viewHolder;
        Glide.with(context).load(list.get(i).getImageURL()).into(vh.Image);
        vh.brokerage.setText(list.get(i).getBrokerage()+"");
        vh.current.setText(list.get(i).getCurrent()+"");
        vh.volume.setText(list.get(i).getVolume()+"");
        vh.price.setText(list.get(i).getTitle()+"");
        vh.title.setText(list.get(i).getTitle()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class VHolder extends RecyclerView.ViewHolder{
        private ImageView Image ;  //展示图片
        private TextView brokerage;   //佣金
        private  TextView title;  //标题
        private TextView current;  //原价
        private TextView volume;  //销量
        private TextView price;   //券后价
        private TextView coupon;   //优惠价格
   public VHolder(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.item_hom_image);
            brokerage = itemView.findViewById(R.id.item_home_brokerage);
            title = itemView.findViewById(R.id.item_home_title);
            current = itemView.findViewById(R.id.item_home__current);
            volume = itemView.findViewById(R.id.item_home_volume);
            price = itemView.findViewById(R.id.item_home_price);
            coupon = itemView.findViewById(R.id.item_home_coupon);

        }
    }
}
