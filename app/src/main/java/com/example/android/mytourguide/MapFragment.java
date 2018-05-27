package com.example.android.mytourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment implements OnMapReadyCallback {

    private int nameId;
    private double longitude;
    private double latitude;
    private GoogleMap mMap;

    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_map, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

        Bundle bundle1 = getActivity().getIntent().getExtras();

            nameId = bundle1.getInt("NAME");
            latitude = bundle1.getDouble("LATITUDE");
            longitude = bundle1.getDouble("LONGITUDE");

        return rootView;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng latLng = new LatLng(latitude, longitude);
        float zoomLevel = 13.0f;
        mMap.addMarker(new MarkerOptions().position(latLng).title(getString(nameId)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));

//        LatLng latLng = new LatLng(latitude, longitude);
//        MarkerOptions markerOptions = new MarkerOptions();
//        markerOptions.position(latLng);
//        markerOptions.title(String.valueOf(nameId));
//        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
//        markerOptions.snippet("My Position");
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,15.0f));
//        mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
//        mMap.addMarker(markerOptions);


    }
}
