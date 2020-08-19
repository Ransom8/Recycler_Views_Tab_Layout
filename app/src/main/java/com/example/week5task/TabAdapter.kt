package com.example.week5task

import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.*

// This is the Tab Adapter Class that help to manage Fragment changes.

class TabAdapter (fm:FragmentManager,lc:Lifecycle):FragmentStateAdapter(fm,lc){

    // The function below return the number of pages to be loaded in the frame layout

    private val number_of_pages = 3

    override fun getItemCount(): Int {
        return number_of_pages
    }

    // The function below take care of creating or inflating the fragments into position.

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->Following()
            1->Local()
            2->Global()
            else->Local()
        }
    }
}