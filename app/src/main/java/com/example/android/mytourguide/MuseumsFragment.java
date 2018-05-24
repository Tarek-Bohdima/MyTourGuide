package com.example.android.mytourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        /** Create a list of Attraction object */
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.museum_antipa, R.drawable.antipa));
        attractions.add(new Attraction(R.string.museum_village, R.drawable.village_museum));
        attractions.add(new Attraction(R.string.old_town, R.drawable.old_town));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),attractions,R.color.category_museums);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
