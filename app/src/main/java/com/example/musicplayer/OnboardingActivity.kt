package com.example.musicplayer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class OnboardingActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: OnboardingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        viewPager = findViewById(R.id.viewPager)

        val screens = listOf(
            OnboardingItem(
                R.drawable.bg_onboarding1,
                "Find the music you love",
                "Explore millions of tracks, trending hits, and hidden gems—all in one place."
            ),
            OnboardingItem(
                R.drawable.bg_onboarding2,
                "Your vibe, your playlist",
                "Get tailored recommendations and daily mixes based on your taste"
            ),
            OnboardingItem(
                R.drawable.bg_onboarding3,
                "Music without limits",
                "Stream offline, create playlists, and enjoy music anytime, anywhere"
            )
        )

        // Pass the viewPager into the adapter
        adapter = OnboardingAdapter(
            items = screens,
            viewPager = viewPager
        ) {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        viewPager.adapter = adapter
    }
}
