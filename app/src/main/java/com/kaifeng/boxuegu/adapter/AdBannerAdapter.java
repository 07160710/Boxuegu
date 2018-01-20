package com.kaifeng.boxuegu.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.MotionEvent;
import android.view.View;

import com.kaifeng.boxuegu.bean.CourseBean;
import com.kaifeng.boxuegu.fragment.AdBannerFragment;
import com.kaifeng.boxuegu.view.CourseView;

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
        Bundle args = new Bundle();
        if(cadl.size() > 0){
            args.putString("ad",cadl.get(index % cadl.size()).icon);
        }
        return AdBannerFragment.newInstance(args);
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    public int getSize(){
        return cadl == null ? 0 : cadl.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mHandler.removeMessages(CourseView.MSG_AD_SLID);
        return false;
    }
}
