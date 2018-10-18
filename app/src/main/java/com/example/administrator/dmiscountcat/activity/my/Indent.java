package com.example.administrator.dmiscountcat.activity.my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.dmiscountcat.R;

public class Indent extends AppCompatActivity implements View.OnClickListener {
    private TextView all,payment,no_payment,cancel;
    private TextView  myIdent,shareIdent;
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_personal_ordering);
        initdata();
    }

    private void initdata(){
        all = findViewById(R.id.indent_all);
        payment = findViewById(R.id.indent_payment);
        no_payment = findViewById(R.id.indent_no_payment);
        cancel = findViewById(R.id.indent_cancel);
        myIdent = findViewById(R.id.indent_myIndent);
        shareIdent = findViewById(R.id.indent_shareIndent);
//        back = findViewById(R.id.indent_back);

        all.setOnClickListener(this);
        payment.setOnClickListener(this);
        no_payment.setOnClickListener(this);
        cancel.setOnClickListener(this);
        myIdent.setOnClickListener(this);
        shareIdent.setOnClickListener(this);
        back.setOnClickListener(this);

        myIdent.setSelected(true);
        shareIdent.setSelected(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.indent_myIndent:   myIdent.setSelected(true);shareIdent.setSelected(false);   break;
            case R.id.indent_shareIndent:    myIdent.setSelected(false);shareIdent.setSelected(true);    break;
            case R.id.indent_all:     initColor(); all.setSelected(true);      break;
            case R.id.indent_payment:   initColor();  payment.setSelected(true);  break;
            case R.id.indent_no_payment:  initColor();no_payment.setSelected(true);  break;
            case R.id.indent_cancel:    initColor();cancel.setSelected(true);    break;
//            case R.id.indent_back:finish();

        }
    }

    private void initColor(){
        all.setSelected(false);
        payment.setSelected(false);
        no_payment.setSelected(false);
        cancel.setSelected(false);

    }
}
