package com.example.administrator.dmiscountcat.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.dmiscountcat.adapter.HomeAdapter;
import com.example.administrator.dmiscountcat.Bean.HomeBean;
import com.example.administrator.dmiscountcat.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Purchase extends Fragment {

    private RecyclerView recy;
    private GridLayoutManager manager;
    private HomeAdapter adapter;
    private HomeBean bean;
    private List<HomeBean> list;
    public Purchase() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_purchase, container, false);
        initdata(view);
        return  view;
    }


    private void initdata(View view){
        recy = view.findViewById(R.id.purchase_recy);
        setList();
        manager = new GridLayoutManager(getContext(),2);

        recy.setLayoutManager(manager);
        adapter = new HomeAdapter(list,getContext());
        recy.setAdapter(adapter);


    }
    private void setList(){
        list = new ArrayList<>();
        bean = new HomeBean();
        bean.setBrokerage(10);
        bean.setCoupon(80);
        bean.setCurrent(100);
        bean.setPrice(80);
        bean.setTitle("标题");
        bean.setVolume(9999);

        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
        list.add(bean);
    }
}
