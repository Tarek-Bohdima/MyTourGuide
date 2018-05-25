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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        /** Create a list of Attraction object */
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.park_ior, R.drawable.ior));
        attractions.add(new Attraction(R.string.park_hearastrau, R.drawable.herastrau));
        attractions.add(new Attraction(R.string.lake_snagov, R.drawable.snagov));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),attractions,R.color.category_parks);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
