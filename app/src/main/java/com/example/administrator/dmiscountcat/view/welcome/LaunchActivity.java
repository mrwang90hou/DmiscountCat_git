package com.example.administrator.dmiscountcat.view.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.dmiscountcat.MainActivity;
import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.base.BaseActivity;


public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载启动图片
        setContentView(R.layout.activity_welcome);
        //后台处理耗时任务
        new Thread(new Runnable() {
            @Override
            public void run() {
                //耗时任务，比如加载网络数据
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //跳转至 MainActivity
                        Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
                        startActivity(intent);
                        //结束当前的 Activity
                        LaunchActivity.this.finish();
                    }
                });
            }
        }).start();
    }
/*加载广告页推荐*/
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //加载启动界面
//        setContentView(R.layout.activity_launch);
//        Integer time = 2000;    //设置等待时间，单位为毫秒
//        Handler handler = new Handler();
//        //当计时结束时，跳转至主界面
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(LaunchActivity.this, MainActivity.class));
//                LaunchActivity.this.finish();
//            }
//        }, time);
//    }
}