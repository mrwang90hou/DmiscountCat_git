package com.example.administrator.dmiscountcat.activity.home;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.Adapter.BrowseRecordsAdapter;
import com.example.administrator.dmiscountcat.Bean.BrowseRecordsBean;
import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class ZeroPackageActivity extends BaseActivity {


    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;


    private List<BrowseRecordsBean> list = new ArrayList<>();
    private BrowseRecordsAdapter adapter;
    private RecyclerView rvBrowseRecords;
    private ImageView ivSettings;


//
//    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_home_page06_view;
    }
//
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_home_page06_view);
    }

    @Override
    public void initActivity() {

    }

    @Override
    public void initView() {
        titleLeft = getViewById(R.id.title_sec_left);
        titleText = getViewById(R.id.title_text);
        titleLeft.setImageDrawable(getResources().getDrawable(R.drawable.home_icon_righttop_return02));
        rlSecTitleLayout = getViewById(R.id.sec_title_layout);
        rlSecTitleLayout.setBackgroundColor(getResources().getColor(R.color.navigation_bg_color));
        titleLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        titleText.setText(getResources(R.string.home_icon6));
        titleText.setTextColor(getResources().getColor(R.color.white));
        /**/
        rvBrowseRecords = getViewById(R.id.rc_zero_package);
        ivSettings = getViewById(R.id.iv_settings);
        ivSettings.setVisibility(View.GONE);
        titleText.setTextColor(getResources().getColor(R.color.white));
        for(int i=0;i<5;i++){
                list.add(new BrowseRecordsBean(BrowseRecordsBean.TYPE_DATA));
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvBrowseRecords.setLayoutManager(layoutManager);
        adapter = new BrowseRecordsAdapter(list,this);
        rvBrowseRecords.setAdapter(adapter);
    }
    @Override
    public void initData() {

    }
}
