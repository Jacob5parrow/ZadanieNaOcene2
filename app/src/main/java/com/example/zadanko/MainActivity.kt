package com.example.zadanko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       fun sil(num: Int): Long {

            return if(num <= 1 ) 1
            else num * sil(num-1 )

        }

            var x = 0

            findViewById<Button>(R.id.button1).setOnClickListener {
                if ( x == 0 )
                {
                    findViewById<ImageView>(R.id.imageview).setImageResource(R.drawable.zdj1)
                    x = 1
                }
                else
                {
                    if ( x == 1 )
                    {
                        findViewById<ImageView>(R.id.imageview).setImageResource(R.drawable.zdj2)
                        x = 2
                    }
                    else
                    {
                        if ( x == 2 )
                        {
                            findViewById<ImageView>(R.id.imageview).setImageResource(R.drawable.zdj3)
                            x = 0
                        }
                    }
                }
            }
            findViewById<Button>(R.id.button2).setOnClickListener {
                if ( x == 0 )
                {
                    findViewById<ImageView>(R.id.imageview).setImageResource(R.drawable.zdj1)
                    x = 1
                }
                else
                {
                    if ( x == 1 )
                    {
                        findViewById<ImageView>(R.id.imageview).setImageResource(R.drawable.zdj2)
                        x = 2
                    }
                    else
                    {
                        if ( x == 2 )
                        {
                            findViewById<ImageView>(R.id.imageview).setImageResource(R.drawable.zdj3)
                            x = 0
                        }
                    }
                }
            }



            findViewById<Button>(R.id.button3).setOnClickListener {
                val num = findViewById<EditText>(R.id.silnia).text.toString().toInt()
                if ( num <= 10 ) {
                    val factorial = sil(num)
                    val text = factorial.toString()
                    findViewById<TextView>(R.id.text1).text = (text)
                }
                else
                {
                    val text = "podaj liczbę <10"
                    findViewById<TextView>(R.id.text1).text = (text)
                }
            }

    }
}




