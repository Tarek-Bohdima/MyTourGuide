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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OverViewFragment extends Fragment {

    public OverViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_overview, container, false);


        Bundle bundle1 = getActivity().getIntent().getExtras();

        int nameId = bundle1.getInt("NAME");
        int descriptionId = bundle1.getInt("DESCRIPTION");
        int websiteId = bundle1.getInt("WEBSITE");
        int phoneId = bundle1.getInt("PHONE");
        int businessHoursId = bundle1.getInt("BUSINESS");
        int imageResourceId = bundle1.getInt("IMAGE");

        TextView attractionName;
        TextView description;
        TextView website;
        TextView phone;
        TextView businessHours;
        ImageView imageView;

        attractionName = rootView.findViewById(R.id.attraction_name2);
        description = rootView.findViewById(R.id.description);
        website = rootView.findViewById(R.id.website);
        phone = rootView.findViewById(R.id.phone);
        businessHours = rootView.findViewById(R.id.business_hours);
        imageView = rootView.findViewById(R.id.image2);

        attractionName.setText(nameId);

        description.setText(descriptionId);

        if (websiteId == 0) {
            website.setVisibility(View.GONE);
        } else {
            website.setText(websiteId);
            website.setVisibility(View.VISIBLE);
        }
        if (phoneId == 0) {
            phone.setVisibility(View.GONE);
        } else {
            phone.setText(phoneId);
            phone.setVisibility(View.VISIBLE);
        }
        if (businessHoursId == 0) {
            businessHours.setVisibility(View.GONE);
        } else {
            businessHours.setText(businessHoursId);
            businessHours.setVisibility(View.VISIBLE);
        }

        imageView.setImageResource(imageResourceId);


        return rootView;
    }

}
