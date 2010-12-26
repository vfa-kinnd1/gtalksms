package com.googlecode.gtalksms.panels;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferences extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPreferenceManager().setSharedPreferencesName("GTalkSMS");
        Intent intent = getIntent();
        int prefs_id = intent.getIntExtra("panel", 0);
        addPreferencesFromResource(prefs_id);
    }
}
