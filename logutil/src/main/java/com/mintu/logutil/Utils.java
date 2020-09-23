package com.mintu.logutil;

import android.content.Context;
import android.widget.Toast;

/**
 * Created By Mintu Giri on 9/23/2020.
 */
public class Utils {

    public static void toast(Context context, String msg)
    {
        Toast.makeText(context, msg , Toast.LENGTH_SHORT).show();
    }
}
