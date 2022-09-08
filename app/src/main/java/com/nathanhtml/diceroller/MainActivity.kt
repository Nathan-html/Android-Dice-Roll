package com.nathanhtml.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.nathanhtml.diceroller.model.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dice process
        val dice : Dice = Dice(6);
        val diceImage : ImageView = findViewById(R.id.print_roll);
        val rollButton : Button = findViewById(R.id.btn_roll);
        var result : Int = dice.roll();
        val toast = Toast.makeText(this, "You get $result", Toast.LENGTH_SHORT)
        rollButton.setOnClickListener{
            result = dice.roll();
            if (result == 1) diceImage.setImageResource(R.drawable.dice_1);
            else if (result == 2) diceImage.setImageResource(R.drawable.dice_2);
            else if (result == 3) diceImage.setImageResource(R.drawable.dice_3);
            else if (result == 4) diceImage.setImageResource(R.drawable.dice_4);
            else if (result == 5) diceImage.setImageResource(R.drawable.dice_5);
            else if (result == 6) diceImage.setImageResource(R.drawable.dice_6);
            toast.show();
        }
    }
}