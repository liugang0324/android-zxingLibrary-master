package com.uuch.android_zxinglibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @ Description:
 * @ Date:2017/6/16
 * @ Author:刘刚
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

}
