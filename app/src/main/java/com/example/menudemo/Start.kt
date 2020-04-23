package com.example.menudemo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.menudemo.databinding.FragmentStartBinding

/**
 * A simple [Fragment] subclass.
 */
class Start : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(layoutInflater)
        binding.normalMenu.setOnClickListener(this)
        binding.switchMenuButton.setOnClickListener(this)
        binding.popupMenu.setOnClickListener(this)
        binding.bottomSide.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View?) {
        val nav = findNavController()
        when(v?.id) {
            R.id.normal_menu -> {
                nav.navigate(R.id.action_start2_to_normalMenu)
            }
            R.id.popup_menu -> {
                nav.navigate(R.id.action_start2_to_popupMenu)
            }
            R.id.bottom_side -> {
                nav.navigate(R.id.action_start2_to_bottomSheetMenu)
            }
            R.id.switch_menu_button -> {
                nav.navigate(R.id.action_start2_to_sideMenu)
            }
            else -> {
                Log.d("Start", "Start")
            }
        }
    }
}
