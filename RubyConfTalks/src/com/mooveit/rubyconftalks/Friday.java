package com.mooveit.rubyconftalks;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Friday extends Activity {
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.talk_list);

    List<Talk> talks = new ArrayList<Talk>();

    talks.add(new Talk(new Date(111,10,11,9,0),  new Date(111,10,11,9,45),"Acreditaciones"));
    talks.add(new Talk(new Date(111,10,11,9,45), new Date(111,10,11,10,00),"Bienvenida"));
    talks.add(new Talk(new Date(111,10,11,10,0), new Date(111,10,11,10,30),"¿Que Es Tan 	Especial de Ruby on Rails? - Stephen Anderson"));
    talks.add(new Talk(new Date(111,10,11,10,30),new Date(111,10,11,11,30),"Ruby on Rails - Santiago Pastorino y Jorge Bejar"));
    talks.add(new Talk(new Date(111,10,11,11,30),new Date(111,10,11,11,45),"Coffee Break"));
    talks.add(new Talk(new Date(111,10,11,11,45),new Date(111,10,11,12,15),"A Tale of Three Trees - Scott Chacon"));
    talks.add(new Talk(new Date(111,10,11,12,15),new Date(111,10,11,12,45),"HTML & CSS - Best Practices - Verónica Rebagliatte"));
    talks.add(new Talk(new Date(111,10,11,12,45),new Date(111,10,11,13,15),"JRuby: Introduciendo Ruby en un mundo enterprise - Jano González"));
    talks.add(new Talk(new Date(111,10,11,13,15),new Date(111,10,11,14,30),"Almuerzo"));
    talks.add(new Talk(new Date(111,10,11,14,30),new Date(111,10,11,15,00),"CRUD Is Not REST - Hypermedia For Y'All! - Nick Sutterer"));
    talks.add(new Talk(new Date(111,10,11,15,0), new Date(111,10,11,15,30),"Resources, For Real This Time (with Webmachine) - Sean Cribbs"));
    talks.add(new Talk(new Date(111,10,11,15,30),new Date(111,10,11,16,00),"Real Time Rack - Konstantin Haase"));
    talks.add(new Talk(new Date(111,10,11,16,0), new Date(111,10,11,16,15),"Coffee Break"));
    talks.add(new Talk(new Date(111,10,11,16,15),new Date(111,10,11,16,45),"What every programmer should know about distributed systems - lessons learned at Heroku - Pedro Belo"));
    talks.add(new Talk(new Date(111,10,11,16,45),new Date(111,10,11,17,15),"On Distributed Failures - Blake Mizerany"));
    talks.add(new Talk(new Date(111,10,11,17,15),new Date(111,10,11,17,45),"Faster than your IDE: vim for rubyists - Ben Orenstein"));
    talks.add(new Talk(new Date(111,10,11,17,45),new Date(111,10,11,18,00),"Coffee Break"));
    talks.add(new Talk(new Date(111,10,11,18,0), new Date(111,10,11,18,30),"Who makes the best asado? - Aaron Patterson"));
    talks.add(new Talk(new Date(111,10,11,18,30),new Date(111,10,11,19,00),"Ruby's past, present, and future - Yutaka Hara"));
    talks.add(new Talk(new Date(111,10,11,22,30),new Date(111,10,11,9,45),"Heroku nos invita a tomar unos tragos!"));

    ListView talks_list = (ListView) findViewById(R.id.talks);
    talks_list.setAdapter(new TalkListAdapter(this, R.layout.talk, talks));




  }
}
