package com.kaifeng.boxuegu.activity;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kaifeng.boxuegu.R;

public class SettingActivity extends AppCompatActivity {
    private TextView tv_main_title,tv_back;
    private RelativeLayout rl_title_bar;
    private RelativeLayout rl_modify_psw,rl_security_setting,rl_exit_login;
    public static SettingActivity instance = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        instance = this;
        init();
    }
    private void init(){

    }
}
