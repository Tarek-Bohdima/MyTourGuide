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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        double latitudeAfi = Double.parseDouble(getString(R.string.latitude_afi));
        double longitudeAfi = Double.parseDouble(getString(R.string.longitude_afi));

        double latitudePromenada = Double.parseDouble(getString(R.string.latitude_promenada));
        double longitudePromenada = Double.parseDouble(getString(R.string.longitude_promenada));

        double latitudeParklake = Double.parseDouble(getString(R.string.latitude_parklake));
        double longitudeParklake = Double.parseDouble(getString(R.string.longitude_parklake));

        /** Create a list of Attraction object */
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.afi, R.string.description_afi, R.string.website_afi,
                R.string.phone_afi, R.string.business_hours_afi, latitudeAfi, longitudeAfi, R.drawable.afi));
        attractions.add(new Attraction(R.string.promenada, R.string.description_promenada, R.string.website_promenada,
                R.string.phone_promenada, R.string.business_hours_promenada, latitudePromenada, longitudePromenada,
                R.drawable.promenada));
        attractions.add(new Attraction(R.string.parklake, R.string.description_parklake, R.string.website_parklake,
                R.string.phone_parklake, R.string.business_hours_parklake, latitudeParklake, longitudeParklake,
                R.drawable.parklake));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_shopping);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        Log.v("ShoppingFragment", "Current Attraction: " + attractions);

        return rootView;
    }

}
