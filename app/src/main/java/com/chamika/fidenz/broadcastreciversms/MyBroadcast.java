package com.chamika.fidenz.broadcastreciversms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by fidenz on 2/16/18.
 */

public class MyBroadcast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"SMS Received",Toast.LENGTH_LONG).show();

    }
}
