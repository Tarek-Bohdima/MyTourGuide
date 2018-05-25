package com.example.android.mytourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    /** Resource ID for the background color for this list of attractions */
    private int mColorResourceId;


    public AttractionAdapter(@NonNull Context context, @NonNull ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if ( listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_name.
        TextView attractionName = (TextView)listItemView.findViewById(R.id.attraction_name);

        // Get the Attraction name from the currentAttraction object and set this text on
        // the attraction_name TextView
        attractionName.setText(currentAttraction.getmAttractionNameId());

        // Find the ImageView in the list_item.xml layout with the ID image1.
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image1);

        // Get the Attraction image from the currentAttraction object and set this text on
        // the image1 TextView
        imageView.setImageResource(currentAttraction.getmImageResourceId());

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        attractionName.setBackgroundColor(color);

        // Return the whole list item layout  so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
