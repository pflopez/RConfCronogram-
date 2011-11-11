package com.mooveit.rubyconftalks;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Main extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);

      Resources res = getResources();
      TabHost tabHost = getTabHost();
      TabHost.TabSpec spec;
      Intent intent;

      intent = new Intent(this, Friday.class);

      spec = tabHost.newTabSpec("friday").setIndicator(getString(R.string.friday),
        res.getDrawable(R.drawable.ic_tab_friday)).setContent(intent);

      tabHost.addTab(spec);

      intent = new Intent(this, Saturday.class);

      spec = tabHost.newTabSpec("saturday").setIndicator(getString(R.string.saturday),
        res.getDrawable(R.drawable.ic_tab_saturday)).setContent(intent);

      tabHost.addTab(spec);

      intent = new Intent(this, Tweets.class);

      spec = tabHost.newTabSpec("tweets").setIndicator(getString(R.string.tweets),
        res.getDrawable(R.drawable.ic_tab_tweets)).setContent(intent);

      tabHost.addTab(spec);

    }
}