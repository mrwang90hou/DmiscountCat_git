package com.example.administrator.dmiscountcat.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.dmiscountcat.Bean.HomeBean;
import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.Adapter.CollectionAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyPartnerFrangment extends Fragment {
    private RecyclerView recy;
    private LinearLayoutManager manager;
    private CollectionAdapter adapter;
    private HomeBean bean;
    private List<HomeBean> list;

    public MyPartnerFrangment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_my_partner, container, false);
        initdata(view);
        return view;
    }
    private void initdata(View view){
//        recy = view.findViewById(R.id.collection_recy);
//        setList();
//        manager = new LinearLayoutManager(getContext());
//        manager.setOrientation(LinearLayoutManager.VERTICAL);
//        recy.setLayoutManager(manager);
//        adapter = new CollectionAdapter(list,getContext());
//        recy.setAdapter(adapter);

    }

    public  void setList(){
        list = new ArrayList<>();
        bean = new HomeBean();
        bean.setBrokerage(10);
        bean.setCoupon(80);
        bean.setCurrent(100);
        bean.setPrice(80);
        bean.setTitle("金三角JSJHDMI线2.0版机顶盒电视电脑PS3/4HDMi线高清");
        bean.setVolume(9999);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
    }
}
