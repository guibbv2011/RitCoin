package com.example.ritcoin.ui.screens.maps

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.Composable
import androidx.ui.layout.Container
import com.example.ritcoin.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment(fragmentMaps: Int) : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        val saoPaulo = LatLng(-23.5747, -46.6409)
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val googlePlex = CameraPosition.builder()
            .target(saoPaulo)
            .zoom(10f)
            .bearing(0f)
            .tilt(45f)
            .build()

        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex), 1000, null)

        googleMap.addMarker(MarkerOptions().position(saoPaulo).title("Marker in São Paulo"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(saoPaulo))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}