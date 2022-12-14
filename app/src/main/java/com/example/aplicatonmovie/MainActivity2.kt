package com.example.aplicatonmovie

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.aplicatonmovie.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMain2Binding.inflate(layoutInflater)
     setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main2)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_downloads, R.id.navigation_account))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true


    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu1 ->{
                Toast.makeText(this,"Not Available yet", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu2 ->{
                Toast.makeText(this,"Not Available yet", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu3 ->{
                Toast.makeText(this,"Not Available yet", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu4 ->{
                val intent = Intent(this@MainActivity2,MainActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> return true
        }
    }
}