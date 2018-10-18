package com.example.administrator.dmiscountcat.activity.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.dmiscountcat.R;

public class Setting extends AppCompatActivity  implements View.OnClickListener {
    private ImageView push,seek,cache;
    private boolean is_push=false,is_seek=false,is_cache=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_setting);

        initdata();

    }

    private void initdata(){
        push = findViewById(R.id.setting_push);
        seek = findViewById(R.id.setting_seek);
        cache = findViewById(R.id.setting_cache);
        push.setOnClickListener(this);
        seek.setOnClickListener(this);
        cache.setOnClickListener(this);
        push.setSelected(!is_push);
        is_push = !is_push;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.setting_push: push.setSelected(!is_push); is_push = !is_push;  break;
            case R.id.setting_seek:  seek.setSelected(!is_seek);is_seek = !is_seek ;break;
            case R.id.setting_cache:  cache.setSelected(!is_cache); is_cache = !is_cache ;break;
        }
    }
}
