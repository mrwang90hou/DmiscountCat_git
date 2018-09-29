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
import com.example.administrator.dmiscountcat.Bean.FlassifyBean;
import com.example.administrator.dmiscountcat.R;
import java.util.List;
public class Flassify_TwoAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<FlassifyBean> list;
    private LayoutInflater inflater;
    private OnItemClickListen listen;

    public Flassify_TwoAdapter(List<FlassifyBean> list, Context context){
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_two_flassify,viewGroup,false);
        return new vHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
            vHolder vh = (vHolder)viewHolder;
            vh.title.setText(list.get(i).getTitle());
            Glide.with(context).load(list.get(i).getImageURL()).into(vh.imageView);
            vh.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (listen != null)listen.ItemClick(v,i);
                }
            });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    private  class  vHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView title;
        public vHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_two_flassify_image);
            title = itemView.findViewById(R.id.item_two_flassify_title);
        }
    }

    public void setListen(OnItemClickListen listen){
        this.listen = listen;
    }


   public   interface OnItemClickListen{
        void ItemClick(View view,int position);
    }
}
