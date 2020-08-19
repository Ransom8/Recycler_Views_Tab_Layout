package com.example.week5task

/**
 * This is the recycler view Adapter that handles all the items, resources and data
 * for the recycler view. It also does the job of view binding and view holding.
 */

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclers.view.*

class RecyclerAdapter(var recyclerItemData: List<RecyclerItem>) :
    RecyclerView.Adapter<RecyclerAdapter.RecyclerItemInner>() {

    class RecyclerItemInner(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerItemInner {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.recyclers, parent, false)
        return RecyclerItemInner(item)
    }

    override fun getItemCount(): Int {
        return recyclerItemData.size
    }

    /**
     * This function handle given the views and placeholders in the recycler view their view
     * resources.
      */

    override fun onBindViewHolder(holder: RecyclerItemInner, position: Int) {
        holder.itemView.apply {
            imgProfile.setImageResource(recyclerItemData[position].imageResource)
            tvName.text = recyclerItemData[position].name
            tvPhone.text = recyclerItemData[position].number
            s.text = (position + 1).toString()
        }
    }


}