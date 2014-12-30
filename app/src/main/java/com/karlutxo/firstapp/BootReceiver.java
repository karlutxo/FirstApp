package com.karlutxo.firstapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by carlos on 20/08/14.
 */
public class BootReceiver extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {

        // Your code to execute when Boot Completd
//        Intent serviceIntent = new Intent("eu.bonny.cultivos.BootReceiver");
        Intent serviceIntent = new Intent("eu.bonny.cultivos.CultivosActivity");
        serviceIntent.putExtra("interval", 1000*60*1000L); // 1000mins
        context.startService(serviceIntent);

        Toast.makeText(context, "Booting Completed", Toast.LENGTH_LONG).show();
    }
}