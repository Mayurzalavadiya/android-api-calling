package com.apicalldemo.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class NetworkChangeReceiver extends BroadcastReceiver {

    checkInterNetConn ml;

    // constructor
    NetworkChangeReceiver(checkInterNetConn ml) {
        //Setting the listener
        this.ml = ml;
    }


    @Override
    public void onReceive(final Context context, final Intent intent) {
        try
        {
            if (isOnline(context)) {

                Toast.makeText(context, "Network Available Do operations", Toast.LENGTH_LONG).show();

                ml.callbackInternet();

            } else {

                Toast.makeText(context, "Network Not available", Toast.LENGTH_LONG).show();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    private boolean isOnline(Context context) {
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getActiveNetworkInfo();
            //should check null because in airplane mode it will be null
            return (netInfo != null && netInfo.isConnected());
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
}