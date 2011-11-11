package com.mooveit.rubyconftalks;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

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

    Talk issue = talks.get(position);

//    TextView issueKeyTextView = (TextView) view.findViewById(R.id.issue_key);
//    issueKeyTextView.setText(issue.getKey());
//
//    TextView issueSummaryTextView = (TextView) view.findViewById(R.id.issue_summary);
//    issueSummaryTextView.setText(issue.getSummary());

    return view;
  }
}

