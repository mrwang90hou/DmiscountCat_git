package com.example.administrator.dmiscountcat.Fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.activity.my.AllRecordsActivity;
import com.example.administrator.dmiscountcat.Adapter.AllRecordsAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by silver on 2018/7/3.
 */

public class SmsFragment extends Fragment {
    AllRecordsAdapter adapter;
    List<String> list = new ArrayList<>();
    ImageView ivNoDataDefaultbg;
    SwipeRefreshLayout swipeLayout;
    AllRecordsActivity allRecordsActivity;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        allRecordsActivity = (AllRecordsActivity) getActivity();
        View view = inflater.inflate(R.layout.fragment_all_records, null);
        initView(view);
        return view;
    }

    private void initView(View view){

        swipeLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipeLayout_fragment_all_recods);
        RecyclerView rvFragmentDefrauding = (RecyclerView)view.findViewById(R.id.rv_fragment_all_recods);
        swipeLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        rvFragmentDefrauding.setLayoutManager(new GridLayoutManager(getActivity(),1));
        adapter= new AllRecordsAdapter(getActivity(),list);
        rvFragmentDefrauding.setAdapter(adapter);

    }

    //更新数据
    public void updata(List<String> lists){
        list.clear();
        list.addAll(lists);
        adapter.notifyDataSetChanged();
        ivNoDataDefaultbg.setVisibility(list.size()>0?View.GONE:View.VISIBLE);
    }



    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
