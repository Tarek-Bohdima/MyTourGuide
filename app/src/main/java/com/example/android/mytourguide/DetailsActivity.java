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
        if(bundle != null) {

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
        bundle.putInt("DESCRIPTION",descriptionId);
        bundle.putInt("WEBSITE",websiteId);
        bundle.putInt("PHONE",phoneId);
        bundle.putInt("BUSINESS",businessHoursId);
        bundle.putDouble("LONGITUDE",longitude);
        bundle.putDouble("LATITUDE",latitude);
        bundle.putInt("IMAGE",imageResourceId);

        overView.putExtras(bundle1);
        mapIntent.putExtras(bundle1);

        ViewPager viewPager1 = findViewById(R.id.viewpager1);
        DetailsFragmentPageAdapter adapter = new DetailsFragmentPageAdapter(this,getSupportFragmentManager());
        viewPager1.setAdapter(adapter);

        TabLayout tablayout = findViewById(R.id.tabs1);
        tablayout.setupWithViewPager(viewPager1);


    }
}
