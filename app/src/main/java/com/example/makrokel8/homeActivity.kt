package com.example.makrokel8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.makrokel8.databinding.ActivityHomeBinding
import com.google.android.material.navigation.NavigationBarView

class homeActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener(this)
        replaceFragment(homeFragment())
    }

    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_container, fragment)
        fragmentTransaction.commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menuhome -> {
                replaceFragment(homeFragment())
                return true
            }
            R.id.menupekerjaan -> {
                replaceFragment(homeFragment())
                return true
            }
            R.id.menucheck -> {
                replaceFragment(homeFragment())
                return true
            }
            R.id.menupelatihan -> {
                replaceFragment(homeFragment())
                return true
            }
            R.id.menuprogress -> {
                replaceFragment(profileFragment())
                return true
            }
            else -> return false
        }
    }
}