package com.example.administrator.dmiscountcat.activity.my;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;
import com.vondear.rxui.view.dialog.RxDialog;
import com.vondear.rxui.view.dialog.RxDialogSure;
import com.vondear.rxui.view.dialog.RxDialogTool;

public class Setting extends BaseActivity implements View.OnClickListener {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_setting);
//        initdata();
//    }
//
//    private void initdata(){
//        push = findViewById(R.id.setting_push);
//        seek = findViewById(R.id.setting_seek);
//        cache = findViewById(R.id.setting_cache);
//        push.setOnClickListener(this);
//        seek.setOnClickListener(this);
//        cache.setOnClickListener(this);
//        push.setSelected(!is_push);
//        is_push = !is_push;
//    }

    Activity activity;
    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;
    private ImageView push,seek;
    private LinearLayout llcache;
    private LinearLayout llHelpCenter;

    private boolean is_push=false,is_seek=false,is_cache=false;

    private TextView updateBtn;
    private TextView settingLogout;
//    final RxDialogSure rxDialogSure = new RxDialogSure(this);
//    final RxDialog rxDialog = new RxDialog(this);
//    final RxDialogTool rxDialogTool;

//    ToastDialog logoutDialog = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_my_setting;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_my_setting);
    }

    @Override
    public void initActivity() {


    }

    @Override
    public void initView() {

//        activity = getActivity();

        titleLeft = getViewById(R.id.title_sec_left);
        titleText = getViewById(R.id.title_text);
        titleLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        titleLeft = getViewById(R.id.title_sec_left);
        titleLeft.setImageDrawable(getResources().getDrawable(R.drawable.home_icon_righttop_return02));
        rlSecTitleLayout = getViewById(R.id.sec_title_layout);
        rlSecTitleLayout.setBackgroundColor(getResources().getColor(R.color.navigation_bg_color));



        titleText.setText(getResources(R.string.user8));

        push = findViewById(R.id.setting_push);
        seek = findViewById(R.id.setting_seek);
        llcache = findViewById(R.id.setting_cache);
        llHelpCenter = findViewById(R.id.ll_help_center);


        updateBtn = findViewById(R.id.setting_update);
        settingLogout = findViewById(R.id.setting_logout);
        push.setSelected(!is_push);
        is_push = !is_push;
//        push.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                push.setSelected(!is_push);
//                is_push = !is_push;
//            }
//        });
//        seek.setOnClickListener(this);
//        cache.setOnClickListener(this);
    }
    @Override
    public void initData() {
//        push = findViewById(R.id.setting_push);
//        seek = findViewById(R.id.setting_seek);
//        cache = findViewById(R.id.setting_cache);
        push.setOnClickListener(this);
        seek.setOnClickListener(this);
        llcache.setOnClickListener(this);
        updateBtn.setOnClickListener(this);
//        push.setSelected(!is_push);
//        is_push = !is_push;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setting_push: push.setSelected(!is_push); is_push = !is_push;  break;
            case R.id.setting_seek: seek.setSelected(!is_seek);is_seek = !is_seek ;break;
            case R.id.setting_cache:
                showLogoutDialog();
                break;
            case R.id.ll_help_center:
                startActivity(new Intent(new Activity(), HelpActivity.class));
                break;
            case R.id.setting_update:
                Toast.makeText(this,"版本升级！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting_logout:
                Toast.makeText(this,"注销账户！",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private void showLogoutDialog(){
        Toast.makeText(this,"清除缓存！",Toast.LENGTH_SHORT).show();
//        rxDialogSure.setTitle("--提示--");
////                rxDialogSure.getLogoView(R.drawable.logo);
////                rxDialogSure.setLogo(R.drawable.logo);
//        rxDialogSure.setContent("是否确认清除缓存？");
//        rxDialogSure.setSure("确认");
//        rxDialogSure.setSureListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                rxDialogSure.cancel();
//            }
//        });
//        rxDialogSure.show();

//        rxDialog.setTitle("--提示--");
//        //rxDialog.setContentView();
    }
}
