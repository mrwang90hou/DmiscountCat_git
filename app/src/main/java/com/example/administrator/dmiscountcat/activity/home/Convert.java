package com.example.administrator.dmiscountcat.activity.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.dmiscountcat.R;

public class Convert extends AppCompatActivity {
    private ImageView brokerage, cash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_exchange_center);
        brokerage = findViewById(R.id.convert_brokerage);
        cash = findViewById(R.id.convert_cash);
        cash.setSelected(true);
        brokerage.setSelected(false);

    }

    //点击事件
    public void convert_click(View view){
        switch (view.getId()){
            case R.id.convert_brokerage:  brokerage.setSelected(false);cash.setSelected(true);  break;
            case R.id.convert_cash:  brokerage.setSelected(true);cash.setSelected(false);  break;
//            case R.id.convert_back:finish();
            case R.id.convert_send:Toast.makeText(Convert.this,"兑换功能暂时未开放",Toast.LENGTH_SHORT).show();break;
        }
    }
}
