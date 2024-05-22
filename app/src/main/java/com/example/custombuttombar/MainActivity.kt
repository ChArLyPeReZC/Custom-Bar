package com.example.custombuttombar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var selectedTab = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeLayout = findViewById<LinearLayout>(R.id.homeLayout)
        val likeLayout = findViewById<LinearLayout>(R.id.likeLayout)
        val notificationLayout = findViewById<LinearLayout>(R.id.notificationLayout)
        val profileLayout = findViewById<LinearLayout>(R.id.profileLayout)

        val homeImage = findViewById<ImageView>(R.id.homeImage)
        val likeImage = findViewById<ImageView>(R.id.likeImage)
        val notificationImage = findViewById<ImageView>(R.id.notificationImage)
        val profileImage = findViewById<ImageView>(R.id.profileImage)

        val homeTxt = findViewById<TextView>(R.id.homeTxt)
        val likeTxt = findViewById<TextView>(R.id.likeTxt)
        val notificationTxt = findViewById<TextView>(R.id.notificationTxt)
        val profileTxt = findViewById<TextView>(R.id.profileTxt)

        homeLayout.setOnClickListener {
            if (selectedTab != 1) {
                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
                    .commit()
                likeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                likeImage.setImageResource(R.drawable.baseline_thumb_up_24)
                notificationImage.setImageResource(R.drawable.baseline_notifications_24)
                profileImage.setImageResource(R.drawable.baseline_person_24)

                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                homeTxt.visibility = View.VISIBLE
                homeImage.setImageResource(R.drawable.baseline_home_selected_24)
                homeLayout.setBackgroundResource(R.drawable.round_back_home_100)

                val scaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                ).apply {
                    duration = 200
                    fillAfter = true
                }
                homeLayout.startAnimation(scaleAnimation)
                selectedTab = 1
            }
        }

        likeLayout.setOnClickListener {
            if (selectedTab != 2) {
                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, LikesFragments::class.java, null)
                    .commit()
                homeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.baseline_home_24)
                notificationImage.setImageResource(R.drawable.baseline_notifications_24)
                profileImage.setImageResource(R.drawable.baseline_person_24)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                likeTxt.visibility = View.VISIBLE
                likeImage.setImageResource(R.drawable.baseline_thumb_up_selected_24)
                likeLayout.setBackgroundResource(R.drawable.round_back_like_100)

                val scaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    1.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                ).apply {
                    duration = 200
                    fillAfter = true
                }
                likeLayout.startAnimation(scaleAnimation)
                selectedTab = 2
            }
        }

        notificationLayout.setOnClickListener {
            if (selectedTab != 3) {
                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, NotificationFragment::class.java, null)
                    .commit()
                homeTxt.visibility = View.GONE
                likeTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.baseline_home_24)
                likeImage.setImageResource(R.drawable.baseline_thumb_up_24)
                profileImage.setImageResource(R.drawable.baseline_person_24)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                notificationTxt.visibility = View.VISIBLE
                notificationImage.setImageResource(R.drawable.baseline_notifications_selected_24)
                notificationLayout.setBackgroundResource(R.drawable.round_back_notification_100)

                val scaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    1.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                ).apply {
                    duration = 200
                    fillAfter = true
                }
                notificationLayout.startAnimation(scaleAnimation)
                selectedTab = 3
            }
        }

        profileLayout.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainer, ProfileFragment::class.java, null)
                .commit()
            if (selectedTab != 4) {
                homeTxt.visibility = View.GONE
                likeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.baseline_home_24)
                likeImage.setImageResource(R.drawable.baseline_thumb_up_24)
                notificationImage.setImageResource(R.drawable.baseline_notifications_24)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                profileTxt.visibility = View.VISIBLE
                profileImage.setImageResource(R.drawable.baseline_person_selected_24)
                profileLayout.setBackgroundResource(R.drawable.round_back_profile_100)

                val scaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    1.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                ).apply {
                    duration = 200
                    fillAfter = true
                }
                profileLayout.startAnimation(scaleAnimation)
                selectedTab = 4
            }
        }


    }
}