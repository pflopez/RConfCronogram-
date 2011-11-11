package com.mooveit.rubyconftalks;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Friday extends Activity {
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    List<Talk> talks = new ArrayList<Talk>();

    talks.add(new Talk(new Date(2011,11,11,9,0),new Date(2011,11,11,9,45),"lala"));
    talks.add(new Talk(new Date(2011,11,11,9,45),new Date(2011,11,11,10,45),"lala2"));



  }
}