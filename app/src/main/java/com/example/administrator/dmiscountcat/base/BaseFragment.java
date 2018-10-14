package com.example.administrator.dmiscountcat.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {
 
    protected BaseActivity mActivity;
    private View view;
 
    protected abstract void initView(View view, Bundle savedInstanceState);
 
    //获取布局文件ID
    protected abstract int getLayoutId();
 
    //获取宿主Activity
    protected BaseActivity getHoldingActivity() {
        return mActivity;
    }
 
      @Override
     public void onAttach(Context context) {//Modified 2016-06-01</span>
    super.onAttach(context);
//     this.mActivity = (BaseActivity) context;
     }
 
    //添加fragment
    protected void addFragment(BaseFragment fragment) {
        if (null != fragment) {
            getHoldingActivity().addFragment(fragment);
        }
    }
 
    //移除fragment
    protected void removeFragment() {
        getHoldingActivity().removeFragment();
    }




    /**
     * 获取资源id
     *
     * @param ：资源id
     * @return String  resources  资源
     */
    @SuppressWarnings("unchecked")
    protected  String getResources(int resources) {
        return getResources().getString(resources);
    }



    /**
     * 查找组件
     *
     * @param viewId：View的ID
     * @return View
     */
    @SuppressWarnings("unchecked")
    protected <view extends View> view getViewById(int viewId) {
        return (view) view.findViewById(viewId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(getLayoutId(), container, false);
        initView(view, savedInstanceState);
        return view;
    }
}
