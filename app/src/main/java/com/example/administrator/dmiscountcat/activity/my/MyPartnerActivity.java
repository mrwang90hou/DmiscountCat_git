package com.example.administrator.dmiscountcat.activity.my;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.Fragment.MyPartnerFrangment;
import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MyPartnerActivity extends BaseActivity implements View.OnClickListener{
    private List<Fragment> listViews;
    private ImageView cursorIv;
    private TextView tab01, tab02, tab03;
    private TextView[] titles;
    private ViewPager viewPager;
    private ImageView titleLeft;
    private TextView titleText;
    private RelativeLayout rlSecTitleLayout;
    private ImageView ivSettings;
    /**
     * 偏移量（手机屏幕宽度 / 选项卡总数 - 选项卡长度） / 2
     */
    private int offset = 0;

    /**
     * 下划线图片宽度
     */
    private int lineWidth;

    /**
     * 当前选项卡的位置
     */
    private int current_index = 0;

    /**
     * 选项卡总数
     */
    private static final int TAB_COUNT = 2;

    private static final int TAB_0 = 0;

    private static final int TAB_1 = 1;


    @Override
    protected int getFragmentContentId() {
        return R.layout.activity_my_partner;
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_my_partner);

        initUI();
        initImageView();
        initVPager();


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



    /**
     * 初始化布局和监听
     */
    private void initUI() {
        viewPager = (ViewPager) findViewById(R.id.vPager);
        cursorIv = (ImageView) findViewById(R.id.iv_tab_bottom_img);
        tab01 = (TextView) findViewById(R.id.tv01);
        tab02 = (TextView) findViewById(R.id.tv02);

        titleLeft = getViewById(R.id.title_sec_left);
        titleText = getViewById(R.id.title_text);
        titleLeft.setImageDrawable(getResources().getDrawable(R.drawable.left_back_gray));
        rlSecTitleLayout = getViewById(R.id.sec_title_layout);
        rlSecTitleLayout.setBackgroundColor(getResources().getColor(R.color.white));
        titleLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        titleText.setText(getResources(R.string.title_my_partner));
        titleText.setTextColor(getResources().getColor(R.color.dimgray));
        ivSettings = getViewById(R.id.iv_settings);
        ivSettings.setVisibility(View.GONE);

        tab01.setOnClickListener(this);
        tab02.setOnClickListener(this);

    }

    /**
     * 初始化底部下划线
     */
    private void initImageView() {
        // 获取图片宽度
        lineWidth = BitmapFactory.decodeResource(getResources(), R.drawable.my_partner_line).getWidth();
        // Android提供的DisplayMetrics可以很方便的获取屏幕分辨率
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenW = dm.widthPixels; // 获取分辨率宽度
        offset = (screenW / TAB_COUNT - lineWidth) / 2;  // 计算偏移值
        Matrix matrix = new Matrix();
        matrix.postTranslate(offset, 0);
        // 设置下划线初始位置
        cursorIv.setImageMatrix(matrix);
    }

    /**
     * 初始化ViewPager并添加监听事件
     */
    private void initVPager() {
        listViews = new ArrayList<>();
        LayoutInflater mInflater = getLayoutInflater();
        listViews.add(new MyPartnerFrangment());
        listViews.add(new MyPartnerFrangment());
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(0);
        titles = new TextView[]{tab01, tab02};
        viewPager.setOffscreenPageLimit(titles.length);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            int one = offset * 2 + lineWidth;

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                // 下划线开始移动前的位置
                float fromX = one * current_index;
                // 下划线移动完毕后的位置
                float toX = one * position;
                Animation animation = new TranslateAnimation(fromX, toX, 0, 0);
                animation.setFillAfter(true);
                animation.setDuration(500);
                // 给图片添加动画
                cursorIv.startAnimation(animation);
                // 当前Tab的字体变成红色
                titles[position].setTextColor(getResources().getColor(R.color.orangge));
                titles[current_index].setTextColor(getResources().getColor(R.color.a5));
                current_index = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    /**
     * ViewPager适配器
     */
    public class MyPagerAdapter extends FragmentPagerAdapter {

        public List<Fragment> mListViews;

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
            this.mListViews = mListViews;
        }


        @Override
        public Fragment getItem(int position) {
            return listViews.get(position);
        }

        @Override
        public int getCount() {
            return listViews.size();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv01:
                // 避免重复加载
                if (viewPager.getCurrentItem() != TAB_0) {
                    viewPager.setCurrentItem(TAB_0);
                }
                break;

            case R.id.tv02:
                if (viewPager.getCurrentItem() != TAB_1) {
                    viewPager.setCurrentItem(TAB_1);
                }
                break;
        }
    }



}
