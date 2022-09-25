package com.example.practical3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigator)
        bottomNavigationView.setSelectedItemId(R.id.login)
        bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            val id = item.itemId
            when (id) {
                R.id.registeration -> {
                    Intent(this,Registration::class.java).also{startActivity(it)}
                }
                R.id.login -> {
                    Intent(this,MainActivity::class.java).also{startActivity(it)}
                }
            }
            true
        })
    }
}