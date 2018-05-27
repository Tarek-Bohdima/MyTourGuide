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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // to convert from String(in string.xml under res) to double
        // (https://stackoverflow.com/questions/5769669/convert-string-to-double-in-java)
        double latitudeAntipa = Double.parseDouble(getString(R.string.latitude_antipa));
        double longitudeAntipa = Double.parseDouble(getString(R.string.longitude_antipa));

        double latitudeVillage = Double.parseDouble(getString(R.string.latitude_village));
        double longitudeVillage = Double.parseDouble(getString(R.string.longitude_village));

        double latitudeOldTown = Double.parseDouble(getString(R.string.latitude_old_town));
        double longitudeOldTown = Double.parseDouble(getString(R.string.longitude_old_town));

        /** Create a list of Attraction object */
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.museum_antipa, R.string.description_antipa, R.string.website_antipa,
                R.string.phone_antipa, R.string.business_hours_antipa, latitudeAntipa, longitudeAntipa, R.drawable.antipa));
        attractions.add(new Attraction(R.string.museum_village, R.string.description_village, R.string.website_village,
                R.string.phone_village, R.string.business_hours_village, latitudeVillage, longitudeVillage, R.drawable.village_museum));
        attractions.add(new Attraction(R.string.old_town, R.string.description_old_town, R.string.website_old_town,
                R.string.phone_old_town, R.string.business_hours_old_town, latitudeOldTown, longitudeOldTown, R.drawable.old_town));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        Log.v("MuseumFragment", "Current Attraction: " + attractions);

        return rootView;
    }

}
