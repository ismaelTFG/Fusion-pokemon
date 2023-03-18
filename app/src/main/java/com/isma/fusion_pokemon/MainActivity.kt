package com.isma.fusion_pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun batalla(view: View){

        val i = Intent(this, BatallaActivity::class.java)

        startActivity(i)

    }
    fun entrenar(view: View){

        val i = Intent(this, EntrenarActivity::class.java)

        startActivity(i)

    }
    fun caja(view: View){

        val i = Intent(this, CajaActivity::class.java)

        startActivity(i)

    }
    fun pokedex(view: View){

        val i = Intent(this, PokedexActivity::class.java)

        startActivity(i)

    }

}