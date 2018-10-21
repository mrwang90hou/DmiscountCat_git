package com.example.administrator.dmiscountcat.activity.my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.Gadget.IntentUtil;
import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;

public class PartnerCenter extends BaseActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_partner_center);
//    }

    public void partenrCentre_Click(View view){
        switch (view.getId()){
            case R.id.partner_generalize:
                IntentUtil.startActivity(this,Generalize.class); break;
            case R.id.ll_common_problems:  IntentUtil.startActivity(this,CommonProblems.class);   break;
        }
    }

    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;

    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_partner_center;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_partner_center);
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
        titleText.setText(getResources(R.string.title_partner_center));
        titleText.setTextColor(getResources().getColor(R.color.white));
    }

    @Override
    public void initData() {

    }
}
