package com.example.administrator.dmiscountcat.adapter;

import android.app.Activity;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.dmiscountcat.Bean.BrowseRecordsBean;
import com.example.administrator.dmiscountcat.R;

import java.util.List;


public class BrowseRecordsAdapter extends BaseMultiItemQuickAdapter<BrowseRecordsBean, BaseViewHolder> {
    Activity activity;
    public BrowseRecordsAdapter(List data, Activity activity) {
        super(data);
        this.activity =   activity;
        addItemType(BrowseRecordsBean.TYPE_TIME, R.layout.item_browse_records_time);
        addItemType(BrowseRecordsBean.TYPE_DATA, R.layout.item_browse_records_data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BrowseRecordsBean item) {
        switch (helper.getItemViewType()) {
            case BrowseRecordsBean.TYPE_TIME:
                break;
            case BrowseRecordsBean.TYPE_DATA:
                break;
        }

    }

}
