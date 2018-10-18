package com.example.administrator.dmiscountcat.activity.my;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;

public class Convert extends BaseActivity {
    private ImageView brokerage, cash;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_exchange_center);
//        brokerage = findViewById(R.id.convert_brokerage);
//        cash = findViewById(R.id.convert_cash);
//        cash.setSelected(true);
//        brokerage.setSelected(false);
//
//    }

    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;
    //
//    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_my_exchange_center;
    }
    //
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_my_exchange_center);
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
        titleText.setText(getResources(R.string.user5));
        titleText.setTextColor(getResources().getColor(R.color.white));
        brokerage = findViewById(R.id.convert_brokerage);
        cash = findViewById(R.id.convert_cash);
        cash.setSelected(true);
        brokerage.setSelected(false);
    }

    @Override
    public void initData() {

    }
    //点击事件
    public void convert_click(View view){
        switch (view.getId()){
            case R.id.convert_brokerage:  brokerage.setSelected(false);cash.setSelected(true);  break;
            case R.id.convert_cash: brokerage.setSelected(true);cash.setSelected(false);  break;
//            case R.id.convert_back:finish();
            case R.id.convert_send:Toast.makeText(Convert.this,"兑换功能暂时未开放",Toast.LENGTH_SHORT).show();break;
        }
    }

}
