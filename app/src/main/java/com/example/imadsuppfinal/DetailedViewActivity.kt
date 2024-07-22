package com.example.hydrationhaven

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.imadsuppfinal.R

class DetailedViewActivity : AppCompatActivity() {

    private val hydrationData = arrayOf(
        DayData("2024-04-02", 0.3, 5.0, "Drank water with meals."),
        DayData("2024-04-03", 2.0, 9.0, "Infused water with citrus fruits."),
        // Add more data as needed
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val listView: ListView = findViewById(R.id.hydrationListView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, hydrationData.map { "${it.date}: ${it.morningIntake + it.afternoonIntake} L - ${it.notes}" })
        listView.adapter = adapter
    }
}
