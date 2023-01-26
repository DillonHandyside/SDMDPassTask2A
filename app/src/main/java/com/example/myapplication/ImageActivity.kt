package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        // get Image, TextView and RatingBar elements
        val locationImage = findViewById<ImageView>(R.id.locationImage)
        val locationTitle = findViewById<TextView>(R.id.locationTitle)
        val locationSuburb = findViewById<TextView>(R.id.locationSuburb)
        val lastVisited = findViewById<TextView>(R.id.lastVisited)
        val locationDescription = findViewById<TextView>(R.id.locationDescription)
        val locationRating = findViewById<RatingBar>(R.id.locationRating)

        // get parcel data
        val location: Location? = intent.extras?.getParcelable("location")

        // populate all data
        locationImage.setImageResource(location!!.image)
        locationTitle.text = location.title
        locationSuburb.text = location.location
        lastVisited.text = location.lastVisited
        locationDescription.text = location.description
        locationRating.rating = location.rating
    }
}