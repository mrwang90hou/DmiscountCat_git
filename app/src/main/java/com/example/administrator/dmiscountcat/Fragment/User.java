package com.example.administrator.dmiscountcat.Fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.LinearLayout;

import com.example.administrator.dmiscountcat.R;
import com.example.administrator.dmiscountcat.activity.my.IncomeStatementActivity;


import com.example.administrator.dmiscountcat.activity.my.BrowseRecordsActivity;
import com.example.administrator.dmiscountcat.activity.my.AllRecordsActivity;
import com.example.administrator.dmiscountcat.activity.my.Invite;
import com.example.administrator.dmiscountcat.activity.my.Indent;
import com.example.administrator.dmiscountcat.activity.my.Convert;
import com.example.administrator.dmiscountcat.activity.my.Recharge;
import com.example.administrator.dmiscountcat.activity.my.HelpActivity;
import com.example.administrator.dmiscountcat.activity.my.Setting;

import com.example.administrator.dmiscountcat.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class User extends BaseFragment implements View.OnClickListener{
    Activity activity;
    LinearLayout llIncomeStatement;
    LinearLayout llIncomeStatement2;


//    <string name="user1">浏览足迹</string>
//    <string name="user2">账户明细</string>
//    <string name="user3">邀请好友</string>
//    <string name="user4">我的订单</string>
//    <string name="user5">兑换中心</string>
//    <string name="user6">充值中心</string>
//    <string name="user7">帮助中心</string>
//    <string name="user8">设置</string>

    LinearLayout llBrowseRecords;
    LinearLayout llAccountDetails;
    LinearLayout llInviteFriends;
    LinearLayout llMyOrdering;
    LinearLayout llExchangeCenter;
    LinearLayout llRechargeCenter;
    LinearLayout llHelp;
    LinearLayout llSetting;


    public User() {

    }


    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        activity = getActivity();
        llIncomeStatement =  getViewById(R.id.ll_income_statement);
        llIncomeStatement2 =  getViewById(R.id.ll_income_statement2);



        llBrowseRecords =  getViewById(R.id.ll_browse_records);
        llAccountDetails =  getViewById(R.id.ll_account_details);
        llInviteFriends = getViewById(R.id.ll_invite_friends);
        llMyOrdering = getViewById(R.id.ll_my_ordering);
        llExchangeCenter = getViewById(R.id.ll_exchange_center);
        llRechargeCenter = getViewById(R.id.ll_recharge_center);
        llHelp =  getViewById(R.id.ll_help);
        llSetting = getViewById(R.id.ll_my_setting);


        llIncomeStatement.setOnClickListener(this);
        llIncomeStatement2.setOnClickListener(this);
        llBrowseRecords.setOnClickListener(this);
        llAccountDetails.setOnClickListener(this);
        llInviteFriends.setOnClickListener(this);
        llMyOrdering.setOnClickListener(this);
        llExchangeCenter.setOnClickListener(this);
        llRechargeCenter.setOnClickListener(this);
        llHelp.setOnClickListener(this);
        llSetting.setOnClickListener(this);

//        llIncomeStatement.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(activity, IncomeStatementActivity.class));
//            }
//        });
//        llAccountDetails.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(activity, AllRecordsActivity.class));
//            }
//        });
//        llHelp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(activity, HelpActivity.class));
//            }
//        });
//        llBrowseRecords.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(activity, BrowseRecordsActivity.class));
//            }
//        });
//
//        llSetting.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(activity, Setting.class));
//            }
//        });
//        Toast.makeText(this,"ww",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_income_statement:
                startActivity(new Intent(activity, IncomeStatementActivity.class));
                break;
            case R.id.ll_income_statement2:
                startActivity(new Intent(activity, IncomeStatementActivity.class));
                break;
//            case R.id.setting_logout:
//                Toast.makeText(this,"注销账户！",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.ll_income_statement:
//                startActivity(new Intent(activity, IncomeStatementActivity.class));
//                break;
            
            case R.id.ll_browse_records:
                startActivity(new Intent(activity, BrowseRecordsActivity.class));
                break;

            case R.id.ll_account_details:
                startActivity(new Intent(activity, AllRecordsActivity.class));
                break;

            case R.id.ll_invite_friends:
                startActivity(new Intent(activity, Invite.class));
                break;

            case R.id.ll_my_ordering:
                startActivity(new Intent(activity, Indent.class));
                break;

            case R.id.ll_exchange_center:
                startActivity(new Intent(activity, Convert.class));
                break;

            case R.id.ll_recharge_center:
                startActivity(new Intent(activity, Recharge.class));
                break;

            case R.id.ll_help:
                startActivity(new Intent(activity, HelpActivity.class));
                break;

            case R.id.ll_my_setting:
                startActivity(new Intent(activity, Setting.class));
                break;

        }
    }
}
