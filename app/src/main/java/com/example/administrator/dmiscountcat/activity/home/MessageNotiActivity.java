package com.example.administrator.dmiscountcat.activity.home;

import android.annotation.SuppressLint;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.Fragment.SmsFragment;
import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;

import java.util.ArrayList;

/**
 * Created by 洛忆 on 2018/10/16.
 */

public class MessageNotiActivity extends BaseActivity {
//    private ArrayList<Fragment> mFragments = new ArrayList<>();
//    private MyPagerAdapter mAdapter;
//    private final String[] mTitles = {"现金抵用券明细", "佣金明细"};
//    //当标签数目小于等于4个时，标签栏不可滑动
//    public static final int MOVABLE_COUNT = 2;
//    private int tabCount = 2;
//    TabLayout tl;

    private TextView titleText;
    private ImageButton ib_back;
    private ImageView ivTitleLine;
    private RelativeLayout rlSrcTitel;
    private ImageView ivSetting;
    SmsFragment smsFragment;
    SmsFragment phoneFragment;

    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_message_notification;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_message_notification);
        init();
    }

    @Override
    public void initActivity() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    private void init(){
        rlSrcTitel = findViewById(R.id.sec_title_layout);
        titleText = findViewById(R.id.title_text);
        titleText.setVisibility(View.VISIBLE);
        ib_back =  this.findViewById(R.id.title_sec_left);
        ib_back.setImageDrawable(getResources().getDrawable(R.drawable.home_icon_righttop_return02));
        ivTitleLine =  this.findViewById(R.id.ivTitleLine);
        ivSetting = findViewById(R.id.iv_settings);
        ivSetting.setImageDrawable(getResources().getDrawable(R.drawable.home_icon_right_top_account));
        ivTitleLine.setVisibility(View.GONE);
        rlSrcTitel.setBackgroundColor(getResources().getColor(R.color.navigation_bg_color));
        ib_back.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        smsFragment  =new SmsFragment();
        phoneFragment =new SmsFragment();
//        mFragments.add(smsFragment);
//        mFragments.add(phoneFragment);
        initViewPagerAndSlidingTabBar();
    }

    private void initViewPagerAndSlidingTabBar() {

        final ViewPager vp = (ViewPager) findViewById(R.id.vp);
//        mAdapter = new MyPagerAdapter(getSupportFragmentManager());
//        vp.setAdapter(mAdapter);
//        tl =  findViewById(R.id.tl);
//        initTabLayout();
//        tl.setupWithViewPager(vp);
//
//        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//              vp.setCurrentItem(tab.getPosition(),false);
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });


    }

//    private class MyPagerAdapter extends FragmentPagerAdapter {
//        public MyPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragments.size();
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mTitles[position];
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragments.get(position);
//        }
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



    /**
     * 初始化头部导航菜单
     */
//    private void initTabLayout() {
//        //MODE_FIXED标签栏不可滑动，各个标签会平分屏幕的宽度
//        tl.setTabMode(tabCount <= MOVABLE_COUNT ? TabLayout.MODE_FIXED : TabLayout.MODE_SCROLLABLE);
//        //指示条的颜色c
//        tl.setSelectedTabIndicatorColor(getResources().getColor(android.R.color.white));
//        tl.setSelectedTabIndicatorHeight((int) getResources().getDimension(R.dimen.indicatorHeight));
//        for (int i = 0; i < tabCount; i++) {
//            tl.addTab(tl.newTab().setText(i==0?mTitles[0]:mTitles[1]));
//        }
//        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                Log.e("hxl","tab postion===="+tab.getPosition());
////                toast.setText(tab.getPosition() + ":" + tab.getText());
////                toast.show();
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }
}