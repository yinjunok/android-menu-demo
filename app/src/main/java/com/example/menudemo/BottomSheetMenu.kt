package com.example.menudemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

/**
 * A simple [Fragment] subclass.
 */
class BottomSheetMenu : Fragment() {

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_bottom_sheet_menu, container, false)
        val button = rootView.findViewById<Button>(R.id.show_dialog)
        val dialog = BottomSheetDialog(requireContext())
        val dialogView = layoutInflater.inflate(R.menu.bottom_sheet_dialog, null)
        dialog.setContentView(dialogView)
        button.setOnClickListener {
            dialog.show()
        }

        return rootView
    }

}
