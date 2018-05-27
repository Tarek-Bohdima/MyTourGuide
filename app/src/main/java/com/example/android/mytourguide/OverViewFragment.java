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
