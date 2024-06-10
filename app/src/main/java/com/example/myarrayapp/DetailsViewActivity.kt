package com.example.myarrayapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailsViewActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_view)


        val day = intent.getStringArrayListExtra("day") ?: arrayListOf()
        val MiniTemperature = intent.getIntegerArrayListExtra("MiniTemperature") ?: arrayListOf()
        val MaxTemperature = intent.getIntegerArrayListExtra("MaxTemperature") ?: arrayListOf()
        val WeatherCondition = intent.getStringArrayListExtra("WeatherCondition") ?: arrayListOf()

        val detailsTextView = findViewById<TextView>(R.id.DetailstextView)
        val averageTemperatureTextView = findViewById<TextView>(R.id.AverageTemperaturetextView)
        val backButton = findViewById<Button>(R.id.Backbutton)

        var totalScreenTime = 0
        var displayText = ""
        for (i in day.indices) {
            val dailyScreenTime = MiniTemperature[i] + MaxTemperature[i]
            totalScreenTime += dailyScreenTime
            displayText += "Day: ${day[i]}, MinimumTemperature: ${MiniTemperature[i]} Temp, MaximumTemperature: ${MaxTemperature[i]} Temp, WeatherCondition: ${WeatherCondition[i]}\n\n"
        }
        val averageScreenTime = if (day.isNotEmpty()) totalScreenTime / day.size else 0

        detailsTextView.text = displayText
        averageTemperatureTextView.text = "Average Temperature : $averageTemperatureTextView Temp"

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)



        }
}
}
