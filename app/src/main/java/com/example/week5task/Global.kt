package com.example.week5task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_global.*

/** Now, this Fragment File contains the recycler view and handles creating and inflating our recycler
 * view with its items in the fragment_global.xml file.
 */

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/** Below is the Fragment Class that instantiates our fragment in onCreate  and handles other actions
 * like populating the recycler view with items
 */

class Global : Fragment() {

    var recyclerList = generateDummyList(100)

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

/**
 *  The function below simply inflates our fragment
 */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_global, container, false)
    }

/** This function below instantiates the recycler view adapter abd layout manager */

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView.adapter = RecyclerAdapter(recyclerList)
        recyclerView.layoutManager = LinearLayoutManager(activity)
    }

/** The the function below is responsible for populating the recycler view with items */

    private fun generateDummyList(size: Int): List<RecyclerItem> {

        val list = ArrayList<RecyclerItem>()


        for (i in 0 until size) {

            when (i) {
                0 -> list.add(
                    RecyclerItem(
                        R.drawable.whatsapp,
                        "Ransom Ahanmisi",
                        "+2348****1587",
                        "1"
                    )
                )
                1 -> list.add(
                    RecyclerItem(
                        R.drawable.twitter,
                        "Kingsley Izundu",
                        "+2348*****6301",
                        "2"
                    )
                )
                2 -> list.add(
                    RecyclerItem(
                        R.drawable.instagram2,
                        "Michael Milliam",
                        "+2348*****4574",
                        "3"
                    )
                )
                3 -> list.add(
                    RecyclerItem(
                        R.drawable.spotify,
                        "James Jerry",
                        "+2348*****9876",
                        "4"
                    )
                )
                4 -> list.add(
                    RecyclerItem(
                        R.drawable.messenger,
                        "Jude Jackson",
                        "+2348*****2233",
                        "5"
                    )
                )
                5 -> list.add(
                    RecyclerItem(
                        R.drawable.pinterest,
                        "Emma Enoch",
                        "+2348*****5543",
                        "6"
                    )
                )
                6 -> list.add(
                    RecyclerItem(
                        R.drawable.facebook,
                        "Williams Wallace",
                        "+2348*****7768",
                        "7"
                    )
                )
                7 -> list.add(
                    RecyclerItem(
                        R.drawable.telegram,
                        "Joan Justice",
                        "+2348*****3209",
                        "8"
                    )
                )
                8 -> list.add(
                    RecyclerItem(
                        R.drawable.instagram2,
                        "Ransom Renner",
                        "+2348****1587",
                        "9"
                    )
                )
                9 -> list.add(
                    RecyclerItem(
                        R.drawable.facebook,
                        "Kingsley Kennedy",
                        "+2348*****6301",
                        "10"
                    )
                )
                10 -> list.add(
                    RecyclerItem(
                        R.drawable.twitter,
                        "Michael Milliam",
                        "+2348*****4574",
                        "11"
                    )
                )
                11 -> list.add(
                    RecyclerItem(
                        R.drawable.linkedin,
                        "James Jerry",
                        "+2348*****9876",
                        "12"
                    )
                )
                12 -> list.add(
                    RecyclerItem(
                        R.drawable.whatsapp,
                        "Jude Jackson",
                        "+2348*****2233",
                        "13"
                    )
                )
                13 -> list.add(
                    RecyclerItem(
                        R.drawable.spotify,
                        "Emma Enoch",
                        "+2348*****5543",
                        "14"
                    )
                )
                14 -> list.add(
                    RecyclerItem(
                        R.drawable.pinterest,
                        "Williams Wallace",
                        "+2348*****7768",
                        "15"
                    )
                )
                else -> list.add(
                    RecyclerItem(
                        R.drawable.linkedin,
                        "Ransom Ahanmisi",
                        "+2348*****3209",
                        "16"
                    )
                )
            }
        }
        return list
    }

}