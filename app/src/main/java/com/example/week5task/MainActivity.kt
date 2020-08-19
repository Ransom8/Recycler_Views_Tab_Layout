package com.example.week5task

/**
 * The Main Activity class. It handles and manages the life cycle of the and every activity
 * that is instantiated or used in the app.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_global.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Below is were the view pager and it's tab adapter is declared to manage or view life cycle
         * and inflate fragment into the views the were created as tabs.
         */

        val viewPager:ViewPager2 = viewPagerItem
        val tab=tbItem

        var adapter = TabAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tab,viewPager){tab,position->
            when(position){
                0->tab.text="FOLLOWING"
                1->tab.text="LOCAL"
                2->tab.text="GLOBAL"
            }

        }.attach()
    }

}