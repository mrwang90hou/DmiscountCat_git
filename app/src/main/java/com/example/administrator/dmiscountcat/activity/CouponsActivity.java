package com.example.administrator.dmiscountcat.activity;

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
//优惠券
public class CouponsActivity extends BaseActivity {
    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;
    private List<BrowseRecordsBean> list = new ArrayList<>();
    private BrowseRecordsAdapter adapter;
    private RecyclerView rvBrowseRecords;
    private ImageView ivSettings;
    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_coupons;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_coupons);
    }

    @Override
    public void initActivity() {
        titleLeft = getViewById(R.id.title_sec_left);
        titleText = getViewById(R.id.title_text);
        titleLeft.setImageDrawable(getResources().getDrawable(R.drawable.home_icon_righttop_return02));
        rlSecTitleLayout = getViewById(R.id.sec_title_layout);
        rlSecTitleLayout.setBackgroundColor(getResources().getColor(R.color.main_title_bg));
        titleLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        titleText.setText(getResources(R.string.title_coupons));
        rvBrowseRecords = getViewById(R.id.rv_browse_records);
        ivSettings = getViewById(R.id.iv_settings);
        ivSettings.setVisibility(View.GONE);
        titleText.setTextColor(getResources().getColor(R.color.white));
        for(int i=0;i<5;i++){
            if(i == 0){
                list.add(new BrowseRecordsBean(BrowseRecordsBean.TYPE_TIME));
            }else{
                list.add(new BrowseRecordsBean(BrowseRecordsBean.TYPE_DATA));
            }
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvBrowseRecords.setLayoutManager(layoutManager);
        adapter = new BrowseRecordsAdapter(list,this);
        rvBrowseRecords.setAdapter(adapter);
    }

    @Override
    public void initView() {


    }

    @Override
    public void initData() {

    }
}
