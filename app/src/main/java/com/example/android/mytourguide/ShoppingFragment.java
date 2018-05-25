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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        /** Create a list of Attraction object */
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.afi, R.drawable.afi));
        attractions.add(new Attraction(R.string.promenada, R.drawable.promenada));
        attractions.add(new Attraction(R.string.parklake, R.drawable.parklake));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_shopping);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
