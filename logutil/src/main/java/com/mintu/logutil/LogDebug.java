package com.mintu.logutil;

import android.util.Log;

/**
 * Created By Mintu Giri on 9/23/2020.
 */
public class LogDebug {

    public static final String TAG = "LogDebug";

    public static void logMsg(String msg)
    {
        Log.d(TAG,msg);
    }

}
