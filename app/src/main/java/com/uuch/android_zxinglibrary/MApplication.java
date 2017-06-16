package com.uuch.android_zxinglibrary;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;


/**
 * @ Description:
 * @ Date:2017/6/16
 * @ Author:刘刚
 */

public class MApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }
}
