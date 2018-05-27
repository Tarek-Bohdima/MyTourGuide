/*
 *
 * PROJECT LICENSE
 *
 * This project was submitted by Tarek Bohdima as part of the Nanodegree At Udacity.
 *
 * As part of Udacity Honor code, your submissions must be your own work, hence
 * submitting this project as yours will cause you to break the Udacity Honor Code
 * and the suspension of your account.
 *
 * Me, the author of the project, allow you to check the code as a reference, but if
 * you submit it, it's your own responsibility if you get expelled.
 *
 * Copyright (c) 2018  Tarek Bohdima
 *
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

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
