package com.example.administrator.dmiscountcat.Bean.goodsDetail;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.administrator.dmiscountcat.view.goodsDetail.ChildAutoHeightViewPager;

/**
 * View的Bundle
 * Created by 洛忆 on 2018/10/15.
 */
public class ViewBundle implements Parcelable {
    ChildAutoHeightViewPager viewPager;

    public ViewBundle() {
        super();
    }

    public ViewBundle(ChildAutoHeightViewPager viewPager) {
        this.viewPager = viewPager;
    }

    protected ViewBundle(Parcel in) {
    }

    public static final Creator<ViewBundle> CREATOR = new Creator<ViewBundle>() {
        @Override
        public ViewBundle createFromParcel(Parcel in) {
            return new ViewBundle(in);
        }

        @Override
        public ViewBundle[] newArray(int size) {
            return new ViewBundle[size];
        }
    };

    public ChildAutoHeightViewPager getViewPager() {
        return viewPager;
    }

    public void setViewPager(ChildAutoHeightViewPager viewPager) {
        this.viewPager = viewPager;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
