package com.mooveit.rubyconftalks;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Date;
import java.util.List;

import static android.graphics.Color.parseColor;

public class TalkListAdapter extends ArrayAdapter<Talk> {
  final Activity context;

  private List<Talk> talks= null;

  public TalkListAdapter(Activity context, int textViewResourceId, List<Talk> talks){
    super(context, textViewResourceId, talks);

    this.talks= talks;
    this.context = context;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent){
    LayoutInflater vi = (LayoutInflater) LayoutInflater.from(context);
	  View view = vi.inflate(R.layout.talk, null, true);

    Talk talk = talks.get(position);



    Date now = new Date(2011,11,11,9,20);

    if(now.after(talk.getStart()) && now.before(talk.getEnd())){
      LinearLayout talkLayout = (LinearLayout) view.findViewById(R.id.talk);
      talkLayout.setBackgroundColor(parseColor("#aaaa00"));
    }

    TextView date = (TextView) view.findViewById(R.id.time);
    String minutes = "";
    if (talk.getStart().getMinutes() < 10){
      minutes = "0" + talk.getStart().getMinutes();
    }
    else{
      minutes = talk.getStart().getMinutes() + "";
    }
    date.setText(talk.getStart().getHours() + ":" + minutes);
    //date.setText(talk.getStart().toLocaleString());


    TextView name = (TextView) view.findViewById(R.id.name);
    name.setText(talk.getName());

    return view;
  }
}

