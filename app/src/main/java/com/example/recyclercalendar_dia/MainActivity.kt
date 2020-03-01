package com.example.recyclercalendar_dia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.recyclercalendar_dia.fragment.FragMent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var fraglist = ArrayList<FragMent>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        for (i in 0..9) {
            var frag = FragMent()
            fraglist.add(frag)
        }

        val pagerAdapter = MyPagerAdapter(supportFragmentManager)
        pager.adapter = pagerAdapter



        /*class MyPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
            override fun getItem(position: Int): Fragment {
                return fraglist.get(position)
            }

            override fun getCount(): Int {
                return fraglist.size

            }


        }*/
    }

 inner   class MyPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return fraglist.get(position)
        }

        override fun getCount(): Int {
            return fraglist.size
        }

    }
}