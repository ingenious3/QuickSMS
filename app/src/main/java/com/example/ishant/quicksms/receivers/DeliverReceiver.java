package com.example.ishant.quicksms.receivers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.ishant.quicksms.R;

public class DeliverReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent arg1) {
        switch (getResultCode()) {
            case Activity.RESULT_OK:
                Toast.makeText(context, R.string.sms_delivered,
                        Toast.LENGTH_SHORT).show();
                break;
            case Activity.RESULT_CANCELED:
                Toast.makeText(context, R.string.sms_not_delivered,
                        Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
