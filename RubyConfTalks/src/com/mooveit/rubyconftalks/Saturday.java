package com.mooveit.rubyconftalks;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Saturday extends Activity {
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.talk_list);

    List<Talk> talks = new ArrayList<Talk>();

    talks.add(new Talk(new Date(2011,11,11,9,0),new Date(2011,11,11,9,45),"sabado lala1"));
    talks.add(new Talk(new Date(2011,11,11,9,45),new Date(2011,11,11,10,45),"sabado lala 2"));

    ListView talks_list = (ListView) findViewById(R.id.talks);
    talks_list.setAdapter(new TalkListAdapter(this, R.layout.talk, talks));
  }
}