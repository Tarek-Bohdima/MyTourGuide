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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       int int1;
       View rootView = inflater.inflate(R.layout.attraction_list,container,false);

       double latitudeLacrimi = Double.parseDouble(getString(R.string.latitude_lacrimi));
       double longitudeLacrimi = Double.parseDouble(getString(R.string.longitude_lacrimi));

       double latitudeKaramna = Double.parseDouble(getString(R.string.latitude_karamna));
       double longitudeKaramna = Double.parseDouble(getString(R.string.longitude_karamna));

       double latitudeTrattoria = Double.parseDouble(getString(R.string.latitude_trattoria));
       double longitudeTrattoria = Double.parseDouble(getString(R.string.longitude_trattoria));

        /** Create a list of Attraction object */
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.restaurant_lacrimi, R.string.description_lacrimi,
                R.string.website_lacrimi, R.string.phone_lacrimi, R.string.business_hours_lacrimi,
                latitudeLacrimi, longitudeLacrimi, R.drawable.lacrimi));
        attractions.add(new Attraction(R.string.restaurant_karamna, R.string.description_karamna, R.string.website_karamna,
                R.string.phone_karamna, R.string.business_hours_karamna, latitudeKaramna,longitudeKaramna,
                R.drawable.karamna));
        attractions.add(new Attraction(R.string.restaurant_trattoria, R.string.description_trattoria,
                R.string.website_trattoria, R.string.phone_trattoria, R.string.business_hours_trattoria,
                latitudeTrattoria,longitudeTrattoria, R.drawable.trattoria));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions,R.color.category_restaurants);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        Log.v("RestaurantsFragment", "Current Attraction: " + attractions);

        return rootView;
    }

}
