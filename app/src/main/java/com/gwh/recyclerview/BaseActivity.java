package com.gwh.recyclerview;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * Created by Guo Wenhui
 * 2020/9/11
 **/
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutInflate());
        loadData();
        initViews();
        registerListener();
    }

   public abstract int layoutInflate();

    public  abstract  void initViews();

    public  abstract void registerListener();
    public  abstract void loadData();
}
