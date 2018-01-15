package com.kaifeng.boxuegu.adapter;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.MotionEvent;
import android.view.View;

import com.kaifeng.boxuegu.bean.CourseBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/15.
 */

public class AdBannerAdapter extends FragmentStatePagerAdapter implements View.OnTouchListener {
    private Handler mHandler;
    private List<CourseBean> cadl;
    public AdBannerAdapter(FragmentManager fm) {
        super(fm);
        cadl = new ArrayList<CourseBean>();
    }
    public AdBannerAdapter(FragmentManager fm, Handler handler){
        super(fm);
        mHandler = handler;
        cadl = new ArrayList<CourseBean>();
    }
    public void setDatas(List<CourseBean> cadl){
        this.cadl = cadl;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int index) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
