package com.example.makrokel8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.makrokel8.databinding.FragmentProfileBinding

class profileFragment : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        binding.btnInf.setOnClickListener(this)
        binding.btnDc.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_inf -> {
                val intent = Intent(activity, Informasipribadi_Activity::class.java)
                startActivity(intent)
            }

            R.id.btn_dc -> {
                val intent = Intent(activity, Document_Activity::class.java)
                startActivity(intent)
            }
        }
    }
}
