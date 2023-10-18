package com.example.makrokel8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.makrokel8.databinding.FragmentHomeBinding

class homeFragment : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.ivNotif.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.iv_notif -> {
                val intent = Intent(activity, notifikasiActivity::class.java)
                startActivity(intent)
            }
        }
    }
}