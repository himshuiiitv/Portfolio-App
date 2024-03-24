package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


// This project is just for learning intents not focused on design part


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            intent= Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        val buttonProject = findViewById<Button>(R.id.btnProject)
        buttonProject.setOnClickListener {
            intent=Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }

    }
}