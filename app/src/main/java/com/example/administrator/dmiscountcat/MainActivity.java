package com.example.administrator.dmiscountcat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.Fragment.Collection;
import com.example.administrator.dmiscountcat.Fragment.Flassify;
import com.example.administrator.dmiscountcat.Fragment.Home;
import com.example.administrator.dmiscountcat.Fragment.Purchase;
import com.example.administrator.dmiscountcat.Fragment.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  String TAG = "001";
    private ViewPager viewPager;   //碎片容器
    private List<Fragment> fragmentList;
    private LinearLayout home,flassify,collection,purchase,user;
    private TextView homeText,flassifyText,collectionText,purchaseText,usertext;
    private ImageView homeImage,flassifyImage,collectionImage,purchaseImage,userImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
    }


    private void initdata(){

        home = findViewById(R.id.main_home1);
        homeText = findViewById(R.id.main_home1_2);
        homeImage = findViewById(R.id.main_home1_1);
        flassify = findViewById(R.id.main_home2);
        flassifyImage = findViewById(R.id.main_home2_1);
        flassifyText = findViewById(R.id.main_home2_2);
        purchase = findViewById(R.id.main_home3);
        purchaseImage = findViewById(R.id.main_home3_1);
        purchaseText = findViewById(R.id.main_home3_2);
        collection = findViewById(R.id.main_home4);
        collectionImage = findViewById(R.id.main_home4_1);
        collectionText = findViewById(R.id.main_home4_2);
        user = findViewById(R.id.main_home5);
        userImage = findViewById(R.id.main_home5_1);
        usertext = findViewById(R.id.main_home5_2);

        home.setOnClickListener(this);
        flassify.setOnClickListener(this);
        collection.setOnClickListener(this);
        purchase.setOnClickListener(this);
        user.setOnClickListener(this);

        homeText.setSelected(true);
        homeImage.setSelected(true);

        //把碎片放进 viewpager
        viewPager = findViewById(R.id.viewPage);
        fragmentList = new ArrayList<>();

        Fragment home = new Home();
        Fragment flassify = new Flassify();
        Fragment purchase = new Purchase();
        Fragment collection = new Collection();
        Fragment user = new User();

        fragmentList.add(home);
        fragmentList.add(flassify);
        fragmentList.add(purchase);
        fragmentList.add(collection);
        fragmentList.add(user);

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

                setpage();
                Log.d(TAG, "onPageScrolled: "+i);
                switch (i){
                    case 0: homeImage.setSelected(true);homeText.setSelected(true);break;
                    case 1: flassifyImage.setSelected(true);flassifyText.setSelected(true); break;
                    case 2: purchaseImage.setSelected(true);purchaseText.setSelected(true);  break;
                    case 3: collectionText.setSelected(true);collectionImage.setSelected(true); break;
                    case 4: userImage.setSelected(true);usertext.setSelected(true); break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });



    }


    //初始化底部导航栏
    private void setpage(){
        Log.d(TAG, "setpage: 执行");
    homeImage.setSelected(false);
    homeText.setSelected(false);
    flassifyText.setSelected(false);
    flassifyImage.setSelected(false);
    usertext.setSelected(false);
    userImage.setSelected(false);
    collectionImage.setSelected(false);
    collectionText.setSelected(false);
    purchaseText.setSelected(false);
    purchaseImage.setSelected(false);

    }

    @Override
    public void onClick(View v) {
        setpage();
        Log.d(TAG, "onClick: "+R.id.main_home3);
        switch (v.getId()){
            case R.id.main_home1: homeImage.setSelected(true);homeText.setSelected(true);viewPager.setCurrentItem(0);break;
            case R.id.main_home2: flassifyImage.setSelected(true);flassifyText.setSelected(true); viewPager.setCurrentItem(1); break;
            case R.id.main_home4: collectionText.setSelected(true);collectionImage.setSelected(true);  viewPager.setCurrentItem(3);break;
            case R.id.main_home5: userImage.setSelected(true);usertext.setSelected(true);viewPager.setCurrentItem(4); break;
            case R.id.main_home3: purchaseImage.setSelected(true);purchaseText.setSelected(true);viewPager.setCurrentItem(2);break;
            default:Log.d(TAG, "最后: "+v.getId());
        }
    }
}
