package com.example.menudemo

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class NormalMenu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_normal_menu, container, false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.normal_menu_1 -> {
                Toast.makeText(requireContext(), "normal_menu_1", Toast.LENGTH_SHORT).show()
            }
            R.id.normal_menu_2 -> {
                Toast.makeText(requireContext(), "normal_menu_2", Toast.LENGTH_SHORT).show()
            }
            R.id.normal_menu_3 -> {
                Toast.makeText(requireContext(), "normal_menu_3", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(requireContext(), "else", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.normal_item, menu)
    }
}
