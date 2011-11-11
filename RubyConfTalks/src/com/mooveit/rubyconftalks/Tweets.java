package com.mooveit.rubyconftalks;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tweets extends ListActivity {
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    String[] tweets = getTweets("http://search.twitter.com/search.json?q=rubyconfuy");

    setListAdapter(new ArrayAdapter<String>(this,R.layout.tweet , tweets));
  }

  public static String[] getTweets(String searchUrl){
		String[] tweetsArray = null ;
		HttpURLConnection con = null;

		try{
			URL url = new URL(searchUrl);

			con = (HttpURLConnection) url.openConnection();
	        con.setReadTimeout(10000);
	        con.setConnectTimeout(15000);
	        con.setRequestMethod("GET");

	        con.connect();

	        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String payload = reader.readLine();
	        reader.close();

	        JSONObject jsonObject = new JSONObject(payload);
	        JSONArray tweetsJSON=jsonObject.getJSONArray("results");

	        tweetsArray = new String[tweetsJSON.length()];

	        for (int i = 0; i < tweetsJSON.length(); i++) {
	            JSONObject rec = tweetsJSON.getJSONObject(i);
	            tweetsArray[i] = rec.getString("text");
	        }
    	    } catch (JSONException e) {
    		    Log.e("", "JSONException",e);
		      } catch (UnsupportedEncodingException e) {
			      Log.e("", "UnsupportedEncodingException",e);
		      } catch (IOException e) {
			      Log.e("", "IOException", e);
		      } finally {
    		  if (con != null) {
    			  con.disconnect();
    		  }
    	}


		return tweetsArray;
	}
}