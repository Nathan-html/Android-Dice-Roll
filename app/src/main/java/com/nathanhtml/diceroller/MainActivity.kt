package com.nathanhtml.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.nathanhtml.diceroller.model.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dice process
        val dice : Dice = Dice(6);
        val rollText : TextView = findViewById(R.id.print_roll);
        val rollButton : Button = findViewById(R.id.btn_roll);
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        rollButton.setOnClickListener{
            toast.show();
            rollText.text = dice.roll().toString();
        }
    }
}