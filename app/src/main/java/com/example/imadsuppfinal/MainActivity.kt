package com.example.hydrationhaven

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.imadsuppfinal.R

class MainActivity : AppCompatActivity() {

    private val hydrationData = arrayOf(
        DayData("2024-04-02", 0.3, 5.0, "Drank water with meals."),
        DayData("2024-04-03", 2.0, 9.0, "Infused water with citrus fruits."),
        // Add more data as needed
    )

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val averageIntake = calculateAverageIntake(hydrationData)

        findViewById<TextView>(R.id.averageIntakeText).text = "Average Intake: $averageIntake L"

        findViewById<Button>(R.id.viewDetailsButton).setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.exitButton).setOnClickListener {
            finish()
        }
    }

    private fun calculateAverageIntake(data: Array<DayData>): Double {
        var totalIntake = 0.0
        for (day in data) {
            totalIntake += day.morningIntake + day.afternoonIntake
        }
        return totalIntake / data.size
    }
}
