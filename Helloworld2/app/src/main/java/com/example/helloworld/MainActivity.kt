package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val findBeer = findViewById<Button>(R.id.find_beer)
        findBeer.setOnClickListener {
            val beerColor = findViewById<Spinner>(R.id.beer_color)
            val color = beerColor.selectedItem
            val beerlist = getBeers(color.toString())
            val beers = beerlist.reduce { str,item -> str +'\n'+ item}
            val brands = findViewById<TextView>(R.id.brands)
            brands.text = beers

        }
    }
    fun getBeers(color:String) : List<String>{
        return when (color){
            "Light" -> listOf("Jail pale Ale " , "Lager Lite")
            "Amer" -> listOf("Jack amber","red moose")
            "Brown" -> listOf("Brown bear" , "bock browine")
            else -> listOf("gout stout "  , "dark daniel")
        }

    }
}