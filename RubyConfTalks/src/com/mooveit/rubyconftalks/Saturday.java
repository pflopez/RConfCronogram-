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

talks.add(new Talk(new Date(111,11,12,9,0),new Date(111,11,12,9,45),"Acreditaciones"));


talks.add(new Talk(new Date(111,11,12,9,45),new Date(111,11,12,10,00),"Charla de sponsor - Cubox"));

talks.add(new Talk(new Date(111,11,12,10,0),new Date(111,11,12,10,30),"Por que pasé de c# a ruby - Pablo Rozanski"));


talks.add(new Talk(new Date(111,11,12,10,30),new Date(111,11,12,11,00),"Javascript tooling in rails 3.1 and how you should be doing it - Duda Dornelles"));


talks.add(new Talk(new Date(111,11,12,11,0),new Date(111,11,12,11,30),"Anatomía de una aplicación: Introducción a Backbone.js - Álvaro Mouriño"));

talks.add(new Talk(new Date(111,11,12,11,30),new Date(111,11,12,11,45),"Coffee Break"));

talks.add(new Talk(new Date(111,11,12,11,45),new Date(111,11,12,12,15),"Metodología, Código y Actitud - Álvaro Gil"));

talks.add(new Talk(new Date(111,11,12,12,15),new Date(111,11,12,12,45),"Lean Startups for the Ruby Hacker - Evan Henshaw-Plath"));

talks.add(new Talk(new Date(111,11,12,12,45),new Date(111,11,12,13,15),"Documentation: You're Doing It Wrong - Danish Khan"));

talks.add(new Talk(new Date(111,11,12,13,15),new Date(111,11,12,14,30),"Almuerzo"));

talks.add(new Talk(new Date(111,11,12,14,30),new Date(111,11,12,15,0),"Why, How and What should I test? - Thais Camilo"));

talks.add(new Talk(new Date(111,11,12,15,0),new Date(111,11,12,15,30),"Practices for maintainable test suites - Harold Giménez"));

talks.add(new Talk(new Date(111,11,12,15,30),new Date(111,11,12,16,0),"Winning strategies in the battle against code smells - Nigel Fernandes"));

talks.add(new Talk(new Date(111,11,12,16,0),new Date(111,11,12,16,15),"Coffee Break"));

talks.add(new Talk(new Date(111,11,12,16,15),new Date(111,11,12,17,15),"Lightning Talks"));

talks.add(new Talk(new Date(111,11,12,17,15),new Date(111,11,12,17,45),"GitHub Flavored Ruby - Tom Preston-Werner"));

talks.add(new Talk(new Date(111,11,12,17,45),new Date(111,11,12,18,00),"Coffee Break"));

talks.add(new Talk(new Date(111,11,12,18,0),new Date(111,11,12,19,0),"Keynote: Agile Development, Lean UX - Ian McFarland"));

talks.add(new Talk(new Date(111,11,12,19,0),new Date(111,11,12,20,0),"Despedida y Sorteos"));

talks.add(new Talk(new Date(111,11,12,22,30),new Date(111,11,12,23,55),"GitHub nos invita a tomar unos tragos!"));



    ListView talks_list = (ListView) findViewById(R.id.talks);
    talks_list.setAdapter(new TalkListAdapter(this, R.layout.talk, talks));
  }
}
