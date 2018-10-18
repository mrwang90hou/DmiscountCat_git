package com.example.administrator.dmiscountcat.activity.my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.dmiscountcat.R;

public class Recharge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recharge_center);
    }

    public void recharge_click(View view){
        switch (view.getId()){

//            case R.id.recharge_back:finish();break;
            case R.id.recharge_cash_send:Toast.makeText(Recharge.this,"现金充值功能暂时未开放",Toast.LENGTH_SHORT).show();break;
            case R.id.recharge_cash_brokerage:Toast.makeText(Recharge.this,"充值卡充值功能暂时未开放",Toast.LENGTH_SHORT).show();break;
        }
    }

}

