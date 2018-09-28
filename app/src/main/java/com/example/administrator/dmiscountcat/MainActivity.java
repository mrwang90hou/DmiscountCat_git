package com.example.administrator.dmiscountcat;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bottom.NavigationController;
import com.bottom.PageNavigationView;
import com.bottom.item.BaseTabItem;
import com.bottom.item.NormalItemView;
import com.bottom.listener.OnTabItemSelectedListener;
import com.example.administrator.dmiscountcat.Fragment.Flassify;
import com.example.administrator.dmiscountcat.Fragment.Home;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private PageNavigationView page;//底部导航栏
    private  String TAG = "001";
    private ViewPager viewPager;   //碎片容器
    private List<Fragment> fragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
    }

    /**
     * 初始化
     */
    private void initdata(){
        //把碎片放进 viewpager
        viewPager = findViewById(R.id.viewPage);
        fragmentList = new ArrayList<>();

        Fragment home = new Home();
        Fragment flassify = new Flassify();

        fragmentList.add(home);
        fragmentList.add(flassify);

        FragmentManager fm = getSupportFragmentManager();
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int i) {
                return fragmentList.get(i);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }
        };
        viewPager.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        //显示底部导航栏
        page = findViewById(R.id.page);
        showPage();

    }

    /**
     * 构造底部导航栏
     */
   private void showPage(){
        PageNavigationView.CustomBuilder custom = page.custom();
        NavigationController build = custom
               .addItem(newItem(R.mipmap.home_page_icon01,R.mipmap.tab_home_s,"首页"))
               .addItem(newItem(R.mipmap.home_page_icon02,R.mipmap.home_page_icon_1,"分类"))
               .addItem(newItem(R.mipmap.tab_video_n,R.mipmap.video_play,"搜索"))
               .addItem(newItem(R.mipmap.tab_home_n,R.mipmap.tab_home_s,"动态"))
               .addItem(newItem(R.mipmap.tab_mine_n,R.mipmap.tab_mine_n,"我的"))
                .build();
        build.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int i, int i1) {
                //选中时触发
                Log.d(TAG, ""+i);
                switch (i){
                    case 0:viewPager.setCurrentItem(0);break;
                    case 1:viewPager.setCurrentItem(1);break;
                }
            }

            @Override
            public void onRepeat(int i) {
                //重复选中时触发
            }
        });
    }

    //自定义tab
    private BaseTabItem newItem(int drawable, int checkedDrawable, String text)
    {
        NormalItemView normalItemView = new NormalItemView(this);
        normalItemView.initialize(drawable,checkedDrawable,text);
        normalItemView.setTextDefaultColor(Color.GRAY);
        normalItemView.setTextCheckedColor(getResources().getColor(R.color.orangge));
        return normalItemView;
    }
}
