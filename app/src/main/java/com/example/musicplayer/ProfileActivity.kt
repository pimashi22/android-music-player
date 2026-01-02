package com.example.musicplayer

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Navigation
        val navHome = findViewById<LinearLayout>(R.id.navHome)
        val navSearch = findViewById<LinearLayout>(R.id.navSearch)
        val navAdd = findViewById<LinearLayout>(R.id.navAdd)
        val navProfile = findViewById<LinearLayout>(R.id.navProfile)

        navHome.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            overridePendingTransition(0, 0)
        }

        navSearch.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
            overridePendingTransition(0, 0)
        }

        navAdd.setOnClickListener {
            startActivity(Intent(this, AddActivity::class.java))
            overridePendingTransition(0, 0)
        }

        navProfile.setOnClickListener {
            // Already here
        }

        // Demo user info
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val tvPassword = findViewById<TextView>(R.id.tvPassword)

        tvUsername.text = "John Doe"
        tvPassword.text = "********"

        // Progress bars
        findViewById<ProgressBar>(R.id.progressListening).progress = 65
        findViewById<ProgressBar>(R.id.progressPlaylist).progress = 45
        findViewById<ProgressBar>(R.id.progressUpload).progress = 30

        // Logout → Onboarding
        findViewById<TextView>(R.id.tabLogout).setOnClickListener {
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
