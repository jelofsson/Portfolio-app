package com.example.portfolioapp;

import java.util.ArrayList;

import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FieldAdapter extends ArrayAdapter<Person>{
	
	ArrayList<Person> persons = new ArrayList<Person>();

    private Activity activity;
 
    public FieldAdapter(Activity a, int textViewResourceId, ArrayList<Person> entries) {
        super(a, textViewResourceId, entries);
        this.persons = entries;
        this.activity = a;
    }
 
    public static class ViewHolder {
        public TextView item1;
        public ImageView item2;
    }
 
    @Override
    /* getView gets ONE view in the LIST! */
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ViewHolder holder;
        if (v == null) {
            LayoutInflater vi =
                (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //Set the custom view
            v = vi.inflate(R.layout.field_input, null);
	    // Fetch our item:s in this view so that we can modify them:
            holder = new ViewHolder();
            holder.item1 = (TextView) v.findViewById(R.id.textView);
            holder.item2 = (ImageView) v.findViewById(R.id.imageView);
            v.setTag(holder);
        }
        else
            holder=(ViewHolder)v.getTag();
        
        // Load our data into this view..
        final Person person = persons.get(position);
        
        v.setOnClickListener(new View.OnClickListener() {
        	public final String NAME = person.name;
            public void onClick(View v) {
            	Intent intent = new Intent(v.getContext() , ProjectActivity.class); // What activity we want to go to!
            	intent.putExtra("name", NAME); // Setting Extra value to send to the activity
            	getContext().startActivity(intent); // Go to the activity:
            }
        });
        
        //final Project project = person.getProjectById(1); // Get the first project of this person.
        final int p = position;
        holder.item1.setText(person.name);
        if(person.pictures.size()>0)
        {
        	int imageResource = getContext().getResources().getIdentifier(person.pictures.get(0) , null, v.getContext().getPackageName());
    		Picasso.with(v.getContext()).load(imageResource).resize(128, 128).centerCrop().into(holder.item2);
        }   
        
        return v;
    }
 
}
