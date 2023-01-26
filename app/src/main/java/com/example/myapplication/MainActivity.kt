package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create the data classes from resources
        val puffingBilly = Location(
            image = R.drawable.puffing_billy,
            title = getString(R.string.PuffingBilly),
            description = getString(R.string.PuffingBillyDescription),
            location = getString(R.string.PuffingBillySuburb),
            lastVisited = getString(R.string.PuffingBillyVisited),
            rating = 3.5f)
        val birdsland = Location(
            image = R.drawable.birdsland,
            title = getString(R.string.Birdsland),
            description = getString(R.string.BirdslandDescription),
            location = getString(R.string.BirdslandSuburb),
            lastVisited = getString(R.string.BirdslandVisited),
            rating = 4.5f)
        val thousandSteps = Location(
            image = R.drawable.thousand_steps,
            title = getString(R.string.ThousandSteps),
            description = getString(R.string.ThousandStepsDescription),
            location = getString(R.string.ThousandStepsSuburb),
            lastVisited = getString(R.string.ThousandStepsVisited),
            rating = 4.0f)
        val ftgPark = Location(
            image = R.drawable.ftg_park,
            title = getString(R.string.FtgPark),
            description = getString(R.string.FtgParkDescription),
            location = getString(R.string.FtgParkSuburb),
            lastVisited = getString(R.string.FtgParkVisited),
            rating = 4.0f)

        val puffingBillyImage = findViewById<ImageView>(R.id.PuffingBilly)
        val birdslandImage = findViewById<ImageView>(R.id.Birdsland)
        val thousandStepsImage = findViewById<ImageView>(R.id.ThousandSteps)
        val ftgParkImage = findViewById<ImageView>(R.id.FtgPark)

        puffingBillyImage.setOnClickListener { startImageActivity(puffingBilly) }
        birdslandImage.setOnClickListener { startImageActivity(birdsland) }
        thousandStepsImage.setOnClickListener { startImageActivity(thousandSteps) }
        ftgParkImage.setOnClickListener { startImageActivity(ftgPark) }
    }

    private fun startImageActivity(location: Location) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("location", location)
        startActivity(intent)
    }
}