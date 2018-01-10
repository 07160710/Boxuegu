package com.kaifeng.boxuegu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kaifeng.boxuegu.R;
import com.kaifeng.boxuegu.bean.ExercisesBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/9.
 */

public class ExercisesDetailAdapter extends BaseAdapter {
    private Context mContext;
    private List<ExercisesBean> ebl;
    private OnSelectListener onSelectListener;
    public ExercisesDetailAdapter(Context context,OnSelectListener onSelectListener){
        this.mContext = context;
        this.onSelectListener = onSelectListener;
    }
    public void setData(List<ExercisesBean> ebl){
        this.ebl = ebl;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return ebl == null ? 0 : ebl.size();
    }

    @Override
    public ExercisesBean getItem(int position) {
        return ebl == null ? null : ebl.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    private ArrayList<String> selectedPosition = new ArrayList<String>();
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if(convertView == null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.exercises_detail_list_item,null);
        }
        return convertView;
    }
    class ViewHolder{
        public TextView subject,tv_a,tv_b,tv_c,tv_d;
        public ImageView iv_a,iv_b,iv_c,iv_d;
    }

    public interface OnSelectListener{

    }
}
