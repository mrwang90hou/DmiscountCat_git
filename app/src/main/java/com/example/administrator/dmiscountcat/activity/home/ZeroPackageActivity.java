package com.example.administrator.dmiscountcat.activity.home;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.Adapter.BrowseRecordsAdapter;
import com.example.administrator.dmiscountcat.Bean.BrowseRecordsBean;
import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;
import com.vondear.rxui.view.dialog.RxDialogSure;

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
    private Button detailed_tutorial_btn;

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
        final RxDialogSure rxDialogSure = new RxDialogSure(this);
        detailed_tutorial_btn = getViewById(R.id.detailed_tutorial_btn);
        detailed_tutorial_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rxDialogSure.setTitle("--活动规则--");
//                rxDialogSure.getLogoView(R.drawable.logo);
//                rxDialogSure.setLogo(R.drawable.logo);
                rxDialogSure.setContent("1、本次秒杀活动为中国电信天翼用户专享。\n2、活动期间使用任何舞弊行为的用户一经发现，即刻取消秒杀活动资格。\n" +
                        "3、每日秒杀的礼品数量有限，秒完即止。秒杀礼品库存数量在秒杀过程中实时变化，秒杀成功与否以实际结果为准。\n" +
                        "4、每名用户每天可成功参与一次秒杀，活动期间每名用户最高可成功秒杀5次。\n" +
                        "5、在成功秒杀后，用户需提供真实信息。如因用户资料不全导致活动奖品无法正确发放的情况，主办方不对由此产生的任何后果负责。\n" +
                        "6、所有礼品将在活动结束后的15个工作日内免费寄出。\n" +
                        "7、本活动最终解释权归中国电信天翼爱游戏所有。");
                rxDialogSure.setSureListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        rxDialogSure.cancel();
                    }
                });
                rxDialogSure.show();
            }
        });
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
