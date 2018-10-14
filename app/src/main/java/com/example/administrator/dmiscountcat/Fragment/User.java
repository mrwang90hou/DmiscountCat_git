package com.example.administrator.dmiscountcat.Fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.activity.AllRecordsActivity;
import com.example.administrator.dmiscountcat.activity.HelpActivity;
import com.example.administrator.dmiscountcat.activity.IncomeStatementActivity;
import com.example.administrator.dmiscountcat.base.BaseActivity;
import com.example.administrator.dmiscountcat.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class User extends BaseFragment {
    Activity activity ;
    LinearLayout llIncomeStatement;
    LinearLayout llAccountDetails;
    LinearLayout llHelp;

    public User() {
    }


    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        activity = getActivity();
        llIncomeStatement =  getViewById(R.id.ll_income_statement);
        llAccountDetails =  getViewById(R.id.ll_account_details);
        llHelp =  getViewById(R.id.ll_help);
        llIncomeStatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity, IncomeStatementActivity.class));
            }
        });
        llAccountDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity, AllRecordsActivity.class));
            }
        });
        llHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity, HelpActivity.class));
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }


}
