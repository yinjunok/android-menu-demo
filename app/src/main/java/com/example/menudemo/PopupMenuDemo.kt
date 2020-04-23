package com.example.menudemo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import com.example.menudemo.databinding.FragmentPopupMenuBinding

/**
 * A simple [Fragment] subclass.
 */
class PopupMenuDemo : Fragment(), View.OnClickListener, PopupMenu.OnMenuItemClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_popup_menu, container, false)
        val btn = rootView.findViewById<Button>(R.id.show_menu)
        btn.setOnClickListener(this)
        return rootView
    }

    override fun onClick(v: View?) {
        val popMenu = PopupMenu(requireContext(), v)
        popMenu.inflate(R.menu.popup_item)
        popMenu.setOnMenuItemClickListener(this)
        popMenu.show()
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.popup_menu_1 -> {
                Toast.makeText(requireContext(), "popup_menu_1", Toast.LENGTH_SHORT).show()
            }
            R.id.popup_menu_2 -> {
                Toast.makeText(requireContext(), "popup_menu_2", Toast.LENGTH_SHORT).show()
            }
            R.id.popup_menu_3 -> {
                Toast.makeText(requireContext(), "popup_menu_3", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(requireContext(), "else", Toast.LENGTH_SHORT).show()
            }
        }

        return false
    }
}
