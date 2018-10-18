package com.example.administrator.dmiscountcat.activity.my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;

public class Recharge extends BaseActivity {
    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;

    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_my_recharge_center;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_my_recharge_center);
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
        titleText.setText(getResources(R.string.user6));
        titleText.setTextColor(getResources().getColor(R.color.white));
    }

    @Override
    public void initData() {

    }

    public void recharge_click(View view){
        switch (view.getId()){
            case R.id.recharge_cash_send:Toast.makeText(Recharge.this,"现金充值功能暂时未开放",Toast.LENGTH_SHORT).show();break;
            case R.id.recharge_cash_brokerage:Toast.makeText(Recharge.this,"充值卡充值功能暂时未开放",Toast.LENGTH_SHORT).show();break;
        }
    }
}

