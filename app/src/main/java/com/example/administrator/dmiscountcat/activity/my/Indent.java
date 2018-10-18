package com.example.administrator.dmiscountcat.activity.my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;

public class Indent extends BaseActivity implements View.OnClickListener {

    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;

    private TextView all,payment,no_payment,cancel;
    private TextView  myIdent,shareIdent;
//    private ImageView back;
    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_my_personal_ordering;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_my_personal_ordering);
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
        titleText.setText(getResources(R.string.user4));
        titleText.setTextColor(getResources().getColor(R.color.white));
    }

    @Override
    public void initData() {
        all = findViewById(R.id.indent_all);
        payment = findViewById(R.id.indent_payment);
        no_payment = findViewById(R.id.indent_no_payment);
        cancel = findViewById(R.id.indent_cancel);
        myIdent = findViewById(R.id.indent_myIndent);
        shareIdent = findViewById(R.id.indent_shareIndent);
//        back = findViewById(R.id.indent_back);

        all.setOnClickListener(this);
        payment.setOnClickListener(this);
        no_payment.setOnClickListener(this);
        cancel.setOnClickListener(this);
        myIdent.setOnClickListener(this);
        shareIdent.setOnClickListener(this);
//        back.setOnClickListener(this);

        myIdent.setSelected(true);
        shareIdent.setSelected(false);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.indent_myIndent:   myIdent.setSelected(true);shareIdent.setSelected(false);   break;
            case R.id.indent_shareIndent:    myIdent.setSelected(false);shareIdent.setSelected(true);    break;
            case R.id.indent_all:     initColor(); all.setSelected(true);      break;
            case R.id.indent_payment:   initColor();  payment.setSelected(true);  break;
            case R.id.indent_no_payment:  initColor();no_payment.setSelected(true);  break;
            case R.id.indent_cancel:    initColor();cancel.setSelected(true);    break;
//            case R.id.indent_back:finish();

        }
    }

    private void initColor(){
        all.setSelected(false);
        payment.setSelected(false);
        no_payment.setSelected(false);
        cancel.setSelected(false);

    }
}
