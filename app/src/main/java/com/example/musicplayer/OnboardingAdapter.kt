package com.example.musicplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

data class OnboardingItem(val image: Int, val title: String, val description: String)

class OnboardingAdapter(
    private val items: List<OnboardingItem>,
    private val viewPager: ViewPager2,              // <-- get a direct reference
    private val finishCallback: () -> Unit
) : RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.onboarding_item, parent, false)
        return OnboardingViewHolder(view)
    }

    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        val item = items[position]
        holder.image.setImageResource(item.image)
        holder.title.text = item.title
        holder.description.text = item.description

        // Change button label on the last page
        holder.btnNext.text = if (position == items.lastIndex) "Get Started" else "Next"

        holder.btnNext.setOnClickListener {
            if (position == items.lastIndex) {
                finishCallback()
            } else {
                // Advance to the next page using the reference we passed in
                viewPager.currentItem = position + 1
            }
        }

        holder.btnSkip.setOnClickListener {
            finishCallback()
        }
    }

    override fun getItemCount(): Int = items.size

    class OnboardingViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.imgOnboarding)
        val title: TextView = view.findViewById(R.id.txtTitle)
        val description: TextView = view.findViewById(R.id.txtDescription)
        val btnNext: Button = view.findViewById(R.id.btnNext)
        val btnSkip: Button = view.findViewById(R.id.btnSkip)
    }
}
