package com.omarqataberi.blckgemchallenge

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        addFakeMarkers(googleMap)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(15.4579600, 44.2385772), 18f))
    }

    //this can be changed with an API call
    private fun addFakeMarkers(googleMap: GoogleMap) {

        //this could be a map to supply the marker with longitude, latitude, & title
        val markers = arrayOf(
            LatLng(15.4579600, 44.2385772),
            LatLng(15.4571913, 44.2382520),
            LatLng(15.4569247, 44.2368535),
            LatLng(15.4588920, 44.2385567),
            LatLng(15.4565075, 44.2389976)
        )

        markers.forEach { latLng ->
            googleMap.addMarker(MarkerOptions().position(latLng).title("Title of the marker"))
        }
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
        val mapFragment =
            childFragmentManager.findFragmentById(R.id.MainLayout) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}