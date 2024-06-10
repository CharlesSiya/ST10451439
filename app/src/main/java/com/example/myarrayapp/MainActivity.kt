package com.example.myarrayapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private fun putStringArrayListExtra() {

}

private fun putIntegerArrayListExtra() {
    TODO("Not yet implemented")
}

@Suppress("USELESS_VARARG_ON_PARAMETER")
class MainActivity : AppCompatActivity() {


    private fun clearFields(
        dayEditText: EditText,
        MiniTemperatureEditText: EditText,
        afternoonScreenTimeEditText: Any?,
        activityNotesEditText: Any?
    ) {

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val dayEditText = findViewById<EditText>(R.id.dayEditText)
        val MiniTemperatureEditText = findViewById<EditText>(R.id.MiniTemperatureEditText)
        val MaxTemperatureEditText = findViewById<EditText>(R.id.MaxTemperatureEditText)
        val WeatherConditionEditText = findViewById<EditText>(R.id.WeatherConditionEditText)
        val addButton = findViewById<Button>(R.id.ADDButton)
        val clearButton = findViewById<Button>(R.id.CLEARButton)
        val DisplayDetailsButton = findViewById<Button>(R.id.DisplayDetailsButton)

        addButton.setOnClickListener {
            dayEditText.text.toString()
            MiniTemperatureEditText.text.toString().toIntOrNull()
            MaxTemperatureEditText.text.toString().toIntOrNull()
            WeatherConditionEditText.text.toString()


            if (dayEditText.isNotEmpty() && (MiniTemperatureEditText != null) && (MaxTemperatureEditText != null) && WeatherConditionEditText.isNotEmpty()) {
                dayEditText.add(dayEditText)
                MiniTemperatureEditText.add(MiniTemperatureEditText)
                MaxTemperatureEditText.add(MaxTemperatureEditText)
                WeatherConditionEditText.add(WeatherConditionEditText)
                Toast.makeText(this, "Data Added", Toast.LENGTH_SHORT).show()
                clearFields(dayEditText, MiniTemperatureEditText, MaxTemperatureEditText, WeatherConditionEditText)
            }else{
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
        }

            clearButton.setOnClickListener {
                //day.clear()
                // MiniTemperature.clear()
                //MaxTemperature.clear()
                // WeatherCondition.clear()
                // Toast.makeText(this, "Data Cleared", Toast.LENGTH_SHORT).show()
                clearFields(
                    dayEditText,
                    MiniTemperatureEditText,
                    MaxTemperatureEditText,
                    WeatherConditionEditText
                )
            }
            DisplayDetailsButton.setOnClickListener {
                val intent = Intent(this,DetailsViewActivity ::class.java)
                putStringArrayListExtra()
                putIntegerArrayListExtra()
                putIntegerArrayListExtra()
                putStringArrayListExtra()
                startActivity(intent)
            }private fun(vararg fields: EditText) {
                for (field in fields) {
                    field.text.clear()


                }
}
} }
}

private infix fun Unit.private(function: (EditText) -> Unit) {
    TODO("Not yet implemented")
}

private fun EditText.add(maxTemperatureEditText: EditText) {
    TODO("Not yet implemented")
}

private fun EditText.isNotEmpty() {

}
