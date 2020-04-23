package com.example.menudemo

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

/**
 * A simple [Fragment] subclass.
 */
class SideMenu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_side_menu, container, false)
        val drawerLayout = rootView.findViewById<DrawerLayout>(R.id.drawer_layout)
        val button = rootView.findViewById<Button>(R.id.switch_menu)
        button.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        return rootView
    }
}
