package com.example.administrator.dmiscountcat.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.bumptech.glide.Glide;
import com.example.administrator.dmiscountcat.Adapter.HomeAdapter;
import com.example.administrator.dmiscountcat.Bean.HomeBean;
import com.example.administrator.dmiscountcat.R;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {
    private Banner banner;
    private String TAG="001";
    private GridLayoutManager manager;
    private RecyclerView recyclerView;
    private HomeAdapter adapter;
    private HomeBean bean;
    private List<HomeBean> list;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =   inflater.inflate(R.layout.fragment_home, container, false);
        initdata(view);
        return view;
    }

    /**
     * 初始化
     */
    private void initdata(View view){
    banner = view.findViewById(R.id.home_banner);
        //设置图片加载器
    banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
    banner.setImages(setimage());
        //设置点击事件
    banner.setDelayTime(1500);
    banner.setOnBannerListener(new OnBannerListener() {
        @Override
        public void OnBannerClick(int position) {

        }
    });
    banner.start();

    //设置recy
    recyclerView = view.findViewById(R.id.home_recy);
    list = new ArrayList<>();
    bean = new HomeBean();
    list.add(bean);
    list.add(bean);
    list.add(bean);
    list.add(bean);
    list.add(bean);
    list.add(bean);
    list.add(bean);
    list.add(bean);
    list.add(bean);
    list.add(bean);
    adapter = new HomeAdapter(list,getContext());
    manager = new GridLayoutManager(getContext(),2);

    recyclerView.setLayoutManager(manager);

    recyclerView.setAdapter(adapter);

    }


    //重写图片加载器
    public class GlideImageLoader extends ImageLoader{
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            /**
             1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
             2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
             传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
             切记不要胡乱强转！
             */
            Glide.with(context).load(path).into(imageView);
        }
    }




    /**
     * 轮播图地址
     */
    private List<String> setimage(){
        List<String> image = new ArrayList<>();
        image.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1537872006336&di=7251b39892685ee08e8af83e6ad72d8e&imgtype=0&src=http%3A%2F%2Fimg.redocn.com%2Fsheji%2F20151220%2Fmaijiusongtaobaolunbohaibaosheji_5623824.jpg");
        image.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1537873612128&di=b1be21409d071223c74fb741cce1dc54&imgtype=0&src=http%3A%2F%2Fpic.qiantucdn.com%2F58pic%2F18%2F05%2F28%2F31N58PICg4Z_1024.jpg");
        image.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1537873612128&di=151cd20b046361d1e6b935c0b39ade63&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F16%2F73%2F95%2F63E58PICQh7_1024.jpg");
        return image;
    }
}
