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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       int int1;
       View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        /** Create a list of Attraction object */
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.restaurant_lacrimi, R.drawable.lacrimi));
        attractions.add(new Attraction(R.string.restaurant_karamna, R.drawable.karamna));
        attractions.add(new Attraction(R.string.restaurant_trattoria, R.drawable.trattoria));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions,R.color.category_restaurants);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
