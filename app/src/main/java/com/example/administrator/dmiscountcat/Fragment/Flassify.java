package com.example.administrator.dmiscountcat.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.dmiscountcat.Adapter.Flassify_OneAdapter;
import com.example.administrator.dmiscountcat.Adapter.Flassify_TwoAdapter;
import com.example.administrator.dmiscountcat.Bean.FlassifyBean;
import com.example.administrator.dmiscountcat.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Flassify extends Fragment implements Flassify_OneAdapter.OnItemClickListen,Flassify_TwoAdapter.OnItemClickListen {
    private RecyclerView one_recy,two_recy;
    private LinearLayoutManager manager;
    private GridLayoutManager manager2;
    private Flassify_OneAdapter oneAdapter;
    private Flassify_TwoAdapter twoAdapter;
    private List<String> list_one;
    private List<FlassifyBean> list_two,list_two1,list_two2,list_two3;
    private FlassifyBean bean,bean1,bean2,bean3;
    private View previous;  //one_rexy 列表点击的前一个vie对象

    public Flassify() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_flassify, container, false);
         setList();
         initdata(view);
        return view;
    }

  //初始化
    public  void initdata(View view){
        one_recy = view.findViewById(R.id.flassify_one_recy);
        two_recy = view.findViewById(R.id.flassify_two_recy);

        manager = new LinearLayoutManager(getContext());
        manager2 = new GridLayoutManager(getContext(),3);
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        one_recy.setLayoutManager(manager);
        two_recy.setLayoutManager(manager2);

        oneAdapter = new Flassify_OneAdapter(list_one,getContext());
        oneAdapter.setOnItemClick(this);
        one_recy.setAdapter(oneAdapter);

        twoAdapter = new Flassify_TwoAdapter(list_two,getContext());
        twoAdapter.setListen(this);
        two_recy.setAdapter(twoAdapter);
    }

 // oneadpter 列表的点击事件
    @Override
    public void itemClick(View view, int position) {

        view.setSelected(true);
        if (previous != null) previous.setSelected(false);
        previous = view;
        twoAdapter = null;
        switch (position%3){
            case 0: twoAdapter = new Flassify_TwoAdapter(list_two,getContext());break;
            case 1: twoAdapter = new Flassify_TwoAdapter(list_two1,getContext());break;
            case 2: twoAdapter = new Flassify_TwoAdapter(list_two2,getContext());break;
            default:twoAdapter = new Flassify_TwoAdapter(list_two1,getContext());
        }
        two_recy.setAdapter(twoAdapter);

    }
// twoAdapter 列表的点击事件
    @Override
    public void ItemClick(View view, int position) {

    }

    //设置list
    public void setList(){
        list_one = new ArrayList<>();
        list_two = new ArrayList<>();
        list_two1 = new ArrayList<>();
        list_two2 = new ArrayList<>();
        list_two3 = new ArrayList<>();
        list_one.add("男装");
        list_one.add("女装");
        list_one.add("帽子");
        list_one.add("衣服");
        list_one.add("乃风");
        list_one.add("裤子");
        list_one.add("鞋子");
        list_one.add("被子");

        bean = new FlassifyBean();
        bean.setImageURL("https://img.alicdn.com/imgextra/i4/669427407/TB2EaofaMHqK1RjSZFkXXX.WFXa_!!669427407-0-beehive-scenes.jpg_180x180xzq90.jpg_.webp");
        bean.setTitle("超酷耳机");
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);
        list_two.add(bean);

        bean1 = new FlassifyBean();
        bean1.setImageURL("https://g-search3.alicdn.com/img/bao/uploaded/i4/i2/266969832/TB2JBe6r67nBKNjSZLeXXbxCFXa_!!266969832.jpg_250x250.jpg_.webp");
        bean1.setTitle("酷炫女装");
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);
        list_two1.add(bean1);

        bean2 = new FlassifyBean();
        bean2.setTitle("童装");
        bean2.setImageURL("https://g-search1.alicdn.com/img/bao/uploaded/i4/i1/2576008180/O1CN012AIUHGs6bdF78Lk_!!2576008180.jpg_250x250.jpg_.webp");
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
        list_two2.add(bean2);
    }
}
