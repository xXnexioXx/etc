package com.xxnexioxx.musicsearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent("com.google.android.googlequicksearchbox.MUSIC_SEARCH")
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        finish();
    }
}
