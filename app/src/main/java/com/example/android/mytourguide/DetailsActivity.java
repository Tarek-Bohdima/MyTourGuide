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

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class DetailsActivity extends AppCompatActivity {

    private int nameId;
    private int descriptionId;
    private int websiteId;
    private int phoneId;
    private int businessHoursId;
    private double longitude;
    private double latitude;
    private int imageResourceId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            nameId = bundle.getInt("NAME");
            descriptionId = bundle.getInt("DESCRIPTION");
            websiteId = bundle.getInt("WEBSITE");
            phoneId = bundle.getInt("PHONE");
            businessHoursId = bundle.getInt("BUSINESS");
            longitude = bundle.getDouble("LONGITUDE");
            latitude = bundle.getDouble("LATITUDE");
            imageResourceId = bundle.getInt("IMAGE");

        }

        Intent overView = new Intent(DetailsActivity.this, OverViewFragment.class);
        Intent mapIntent = new Intent(DetailsActivity.this, MapFragment.class);

        Bundle bundle1 = new Bundle();

        bundle.putInt("NAME", nameId);
        bundle.putInt("DESCRIPTION", descriptionId);
        bundle.putInt("WEBSITE", websiteId);
        bundle.putInt("PHONE", phoneId);
        bundle.putInt("BUSINESS", businessHoursId);
        bundle.putDouble("LONGITUDE", longitude);
        bundle.putDouble("LATITUDE", latitude);
        bundle.putInt("IMAGE", imageResourceId);

        overView.putExtras(bundle1);
        mapIntent.putExtras(bundle1);

        ViewPager viewPager1 = findViewById(R.id.viewpager1);
        DetailsFragmentPageAdapter adapter = new DetailsFragmentPageAdapter(this, getSupportFragmentManager());
        viewPager1.setAdapter(adapter);

        TabLayout tablayout = findViewById(R.id.tabs1);
        tablayout.setupWithViewPager(viewPager1);


    }
}
