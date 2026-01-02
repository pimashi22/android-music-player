package com.example.musicplayer

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Navigation items (from included bottom_navigation.xml)
        val navHome = findViewById<LinearLayout>(R.id.navHome)
        val navSearch = findViewById<LinearLayout>(R.id.navSearch)
        val navAdd = findViewById<LinearLayout>(R.id.navAdd)
        val navProfile = findViewById<LinearLayout>(R.id.navProfile)

        // Stay on Home
        navHome.setOnClickListener {
            // Already here
        }

        // Go to Search
        navSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0) // no animation
        }

        // Inside onCreate of HomeActivity
        navAdd.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        navProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val playlistCard = findViewById<LinearLayout>(R.id.playlist1) // set the id in XML
        playlistCard.setOnClickListener {
            val intent = Intent(this, PlaylistActivity::class.java)
            startActivity(intent)
        }




    }
}
