package com.ryansteckler.nlpunbounce;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.ryansteckler.nlpunbounce.models.UnbounceStatsCollection;

public class ActivityReceiver extends BroadcastReceiver {

    public static final String STATS_REFRESHED_ACTION = "com.ryansteckler.nlpunbounce.STATS_REFRESHED_ACTION";
    public static final String CREATE_FILES_ACTION = "com.ryansteckler.nlpunbounce.CREATE_FILES_ACTION";
    public static final String RESET_FILES_ACTION = "com.ryansteckler.nlpunbounce.RESET_FILES_ACTION";

    public ActivityReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(CREATE_FILES_ACTION)) {
            UnbounceStatsCollection.getInstance().createFiles(context);
        } else if (action.equals(RESET_FILES_ACTION)) {
            UnbounceStatsCollection.getInstance().recreateFiles(context);
        }

    }
}
