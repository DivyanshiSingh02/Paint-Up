package com.example.paintup

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintup.PaintView.Companion.colorList
import com.example.paintup.PaintView.Companion.currentBrush
import com.example.paintup.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path= Path()
        var paintbrush=Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redbtn=findViewById<ImageButton>(R.id.btnred)
        val blackbtn=findViewById<ImageButton>(R.id.btnblack)
        val bluebtn=findViewById<ImageButton>(R.id.btnblue)
        val yellowbtn=findViewById<ImageButton>(R.id.btnyellow)
        val eraser=findViewById<ImageButton>(R.id.btnwhite)

        redbtn.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.RED
            currentColor(paintbrush.color)
        }

        blackbtn.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.BLACK
            currentColor(paintbrush.color)
        }

        yellowbtn.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.YELLOW
            currentColor(paintbrush.color)
        }

        bluebtn.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.BLUE
            currentColor(paintbrush.color)
        }

        eraser.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun currentColor(color: Int){
        currentBrush=color
        path=Path()
    }
}
