package com.example.recyclercalendar_dia.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclercalendar_dia.R
import com.example.recyclercalendar_dia.calendar.calAdapter
import com.example.recyclercalendar_dia.calendar.calModel

class FragMent : Fragment() {

    lateinit var recycle1: RecyclerView
    val callist = ArrayList<calModel>()
    val adapter: calAdapter = calAdapter(callist)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val v = inflater.inflate(R.layout.cal_fragment, container, false)
        recycle1 = v.findViewById(R.id.fragTwo_RV)

        val adapterr = calAdapter(callist)
        recycle1.adapter = adapterr
        recycle1.layoutManager = LinearLayoutManager(activity)

        recycle1.addItemDecoration(
            DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
        )






        return v
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragment_one, container, false)

}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        callist.add(calModel("10"))




        adapter.notifyDataSetChanged()
    }

}