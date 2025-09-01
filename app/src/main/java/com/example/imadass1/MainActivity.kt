package com.example.imadass1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
class MainActivity : AppCompatActivity() {
    // Declare variables for UI elements

    private lateinit var Header1: TextView
    private lateinit var Suggest: Button
    private lateinit var UserInput: EditText
    private lateinit var Subheading: TextView
    private lateinit var imageView: ImageView
    private lateinit var reset: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            insets
            // Set up UI elements and set click listeners
        }
        Header1 = findViewById(R.id.Header1)
        Suggest = findViewById(R.id.Suggest)
        UserInput = findViewById(R.id.UserInput)
        Subheading = findViewById(R.id.Subheading)
        imageView = findViewById(R.id.imageView)
        reset = findViewById(R.id.reset)



        Suggest.setOnClickListener {
            val userInput = UserInput.text.toString().trim()

            // Check if the user input is not empty

            if (userInput.isNotEmpty()) {
                when (userInput.lowercase()) {


                    "morning" -> {
                        imageView.setImageResource(R.drawable.bacon_and_eggs)
                        Subheading.text = "Eggs and bacon will be a great meal for the morning"
                    }

                    "mid-morning" -> {
                        imageView.setImageResource(R.drawable.fruit)
                        Subheading.text = "Eating some fruits will be ideal to get in some vitamins"
                    }

                    "afternoon" -> {
                        imageView.setImageResource(R.drawable.sandwich)
                        Subheading.text = "Have a sandwich for the afternoon"
                    }

                    "mid-afternoon" -> {
                        imageView.setImageResource(R.drawable.cake)
                        Subheading.text = "Have a small snack to treat yourself. Eg. a piece of cake"
                    }

                    "dinner" -> {
                        imageView.setImageResource(R.drawable.pasta)
                        Subheading.text = "Have a nice bowl of Pasta"
                    }

                    "after-dinner" -> {
                        imageView.setImageResource(R.drawable.ice_cream)
                        Subheading.text = "Have some ice cream as a snack after dinner. Not too much though."
                    }

                    else -> {
                        imageView.setImageResource(R.drawable.frontcover_picute1)
                        Subheading.text = "Please enter: morning, mid-morning, afternoon, mid-afternoon, or dinner"
                    }
                }
            } else {
                Subheading.text = "Input cannot be empty"
            }
        }
        // Set click listener for the reset button
        reset.setOnClickListener {
            imageView.setImageResource(R.drawable.frontcover_picute1)
            Subheading.text = "Please enter time of day. Only morning, mid-morning, afternoon, mid-afternoon, dinner and after-dinner will be accepted"

            //Author: Zahra Bulbulia
            //Url: https://www.youtube.com/watch?v=R5p-YXC87VU
        }
    }
}


