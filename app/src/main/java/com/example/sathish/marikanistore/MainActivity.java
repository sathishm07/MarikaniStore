package com.example.sathish.marikanistore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    // GoogleMap m_map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map_view);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap map){
        map.addMarker(new MarkerOptions()
                .position(new LatLng(13.114498, 80.293634))
                .title("Marikani Foods")
                .snippet("Grocery Store"));
        map.getUiSettings().setZoomControlsEnabled(true);
        map.getUiSettings().setCompassEnabled(true);
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(13.114498, 80.293634), 16));
    }
}