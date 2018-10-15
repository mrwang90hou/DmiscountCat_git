//package com.example.administrator.dmiscountcat.view.welcome;
//
//import android.content.Intent;
//import android.support.v4.view.PagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import com.apkfuns.logutils.LogUtils;
//import com.holyn.guofang.R;
//import com.holyn.guofang.view.BaseActivity;
//import com.holyn.guofang.view.Login.LoginActivity;
//import com.rd.PageIndicatorView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//import butterknife.OnClick;
//
///**
// * Created by Holyn on 2017/10/7.
// */
//
//public class IntroduceActivity extends BaseActivity {
//    @BindView(R.id.view_pager)
//    ViewPager viewPager;
//    MyPagerAdapter pagerAdapter;
//    @BindView(R.id.pageIndicatorView)
//    PageIndicatorView pageIndicatorView;
//    @BindView(R.id.iv_go_login)
//    ImageView ivGoLogin;
//
//    List<View> viewList = new ArrayList<>();//view数组
//    View view0, view1, view2, view3;
//
//    @Override
//    protected int getLayoutResID() {
//        return R.layout.activity_introduce;
//    }
//
//    @Override
//    protected void onMyCreate() {
//        ButterKnife.bind(this);
//
//        view0 = LayoutInflater.from(this).inflate(R.layout.imageview_custom, null);
//        ImageView iv0 = (ImageView)view0.findViewById(R.id.iv_custom);
//        iv0.setImageResource(R.drawable.ic_introduce_0);
//        view1 = LayoutInflater.from(this).inflate(R.layout.imageview_custom, null);
//        ImageView iv1 = (ImageView)view1.findViewById(R.id.iv_custom);
//        iv1.setImageResource(R.drawable.ic_introduce_1);
//        view2 = LayoutInflater.from(this).inflate(R.layout.imageview_custom, null);
//        ImageView iv2 = (ImageView)view2.findViewById(R.id.iv_custom);
//        iv2.setImageResource(R.drawable.ic_introduce_2);
//        view3 = LayoutInflater.from(this).inflate(R.layout.imageview_custom, null);
//        ImageView iv3 = (ImageView)view3.findViewById(R.id.iv_custom);
//        iv3.setImageResource(R.drawable.ic_introduce_3);
//
//        viewList.add(view0);
//        viewList.add(view1);
//        viewList.add(view2);
//        viewList.add(view3);
//
//        pagerAdapter = new MyPagerAdapter(viewList);
//        viewPager.setAdapter(pagerAdapter);
//
//        pageIndicatorView.setViewPager(viewPager);
//
//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                LogUtils.d(position);
//                if (position == 3){
//                    ivGoLogin.setVisibility(View.VISIBLE);
//                } else {
//                    ivGoLogin.setVisibility(View.GONE);
//                }
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//
//    }
//
//    @OnClick(R.id.iv_go_login)
//    public void onViewClicked() {
//        Intent intent = new Intent(IntroduceActivity.this,LoginActivity.class);
//        startActivity(intent);
//        finish();
//    }
//
//    private class MyPagerAdapter extends PagerAdapter {
//        private List<View> viewList;//view数组
//
//        public MyPagerAdapter(List<View> viewList) {
//            this.viewList = viewList;
//        }
//
//        @Override
//        public int getCount() {
//            return viewList.size();
//        }
//
//        @Override
//        public boolean isViewFromObject(View view, Object object) {
//            return view == object;
//        }
//
//        @Override
//        public void destroyItem(ViewGroup container, int position,
//                                Object object) {
//            container.removeView(viewList.get(position));
//        }
//
//        @Override
//        public Object instantiateItem(ViewGroup container, int position) {
//            container.addView(viewList.get(position));
//            return viewList.get(position);
//        }
//    }
//}
