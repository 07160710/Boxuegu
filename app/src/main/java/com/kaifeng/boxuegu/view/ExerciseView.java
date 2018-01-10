package com.kaifeng.boxuegu.view;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.kaifeng.boxuegu.R;
import com.kaifeng.boxuegu.adapter.ExercisesAdapter;
import com.kaifeng.boxuegu.bean.ExercisesBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */

public class ExerciseView {
    private ListView lv_list;
    private ExercisesAdapter adapter;
    private List<ExercisesBean> ebl;
    private Activity mContext;
    private LayoutInflater mInflater;
    private View mCurrentView;
    public ExerciseView(Activity context){
        this.mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }
    private void createView(){
        initView();
    }
    private void initView(){
        mCurrentView = mInflater.inflate(R.layout.main_view_exercises,null);
        lv_list = (ListView) mCurrentView.findViewById(R.id.lv_list);
        adapter = new ExercisesAdapter(mContext);
        initData();
        adapter.setData(ebl);
        lv_list.setAdapter(adapter);
    }
    private void initData(){
        ebl = new ArrayList<ExercisesBean>();
        for(int i = 0;i < 10; i++){
            ExercisesBean bean = new ExercisesBean();
            bean.id = (i+1);
            switch (i){
                case 0:
                    bean.title = "第1章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_1);
                    break;
                case 1:
                    bean.title = "第2章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_2);
                    break;
                case 2:
                    bean.title = "第3章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_3);
                    break;
                case 3:
                    bean.title = "第4章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_4);
                    break;
                case 4:
                    bean.title = "第5章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_1);
                    break;
                case 5:
                    bean.title = "第6章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_2);
                    break;
                case 6:
                    bean.title = "第7章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_3);
                    break;
                case 7:
                    bean.title = "第8章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_4);
                    break;
                case 8:
                    bean.title = "第9章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_1);
                    break;
                case 9:
                    bean.title = "第10章 Android基础入门";
                    bean.content = "共计5题";
                    bean.background = (R.drawable.exercises_bg_2);
                    break;
                default:
                    break;
            }
            ebl.add(bean);
        }
    }
    public View getView(){
        if(mCurrentView == null){
            createView();
        }
        return mCurrentView;
    }
    public void showView(){
        if(mCurrentView == null){
            createView();
        }
        mCurrentView.setVisibility(View.VISIBLE);
    }
}
