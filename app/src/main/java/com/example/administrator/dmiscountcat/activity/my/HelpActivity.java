package com.example.administrator.dmiscountcat.activity.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;

public class HelpActivity extends BaseActivity {
    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;

    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_help;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_help);
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
        titleText.setText(getResources(R.string.title_help));
        titleText.setTextColor(getResources().getColor(R.color.white));
    }

    @Override
    public void initData() {

    }
}
