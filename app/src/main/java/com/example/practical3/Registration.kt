package com.example.practical3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class Registration : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        bottomNavigationView = findViewById(R.id.bottom_navigator)
        bottomNavigationView.setSelectedItemId(R.id.registeration)
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