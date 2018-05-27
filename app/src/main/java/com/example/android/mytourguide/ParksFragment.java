package com.example.android.mytourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
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

        double latitudeIor = Double.parseDouble(getString(R.string.latitude_ior));
        double longitudeIor = Double.parseDouble(getString(R.string.longitude_ior));

        double latitudeHerastrau = Double.parseDouble(getString(R.string.latitude_herastrau));
        double longitudeHerastrau = Double.parseDouble(getString(R.string.longitude_herastrau));

        double latitudeSnagov = Double.parseDouble(getString(R.string.latitude_snagov));
        double longitudeSnagov = Double.parseDouble(getString(R.string.longitude_snagov));

        /** Create a list of Attraction object */
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.park_ior,R.string.description_ior, latitudeIor, longitudeIor, R.drawable.ior));
        attractions.add(new Attraction(R.string.park_hearastrau, R.string.description_herastrau, latitudeHerastrau,
                longitudeHerastrau, R.drawable.herastrau));
        attractions.add(new Attraction(R.string.lake_snagov, R.string.description_snagov,latitudeSnagov, longitudeSnagov,
                R.drawable.snagov));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),attractions,R.color.category_parks);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        Log.v("ParksFragment", "Current Attraction: " + attractions);

        return rootView;
    }

}
