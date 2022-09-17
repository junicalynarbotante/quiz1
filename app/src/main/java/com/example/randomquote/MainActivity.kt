package com.example.randomquote

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.randomquote.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

        binding.btnLove.setOnClickListener(this)
        binding.btnInspirational.setOnClickListener(this)
        binding.btnMotivational.setOnClickListener(this)
        binding.btnFavorite.setOnClickListener(this)

        val pquotes = PoolQuote.getPQuote()
        binding.tvRand.text = pquotes

    }
    override fun onClick(p0: View?) {
        when (p0!!.id) {
            (R.id.btn_love) -> {
                var love = "Love"
                var intent = Intent(this, RandomQuote::class.java)
                intent.putExtra("Quote", love)
                startActivity(intent)
            }
            (R.id.btn_inspirational)->{
                var inspirational = "Inspirational"
                var intent = Intent(this,RandomQuote::class.java)
                intent.putExtra("Quote",inspirational)
                startActivity(intent)
            }
            (R.id.btn_motivational)->{
                var motivational = "Motivational"
                var intent = Intent(this,RandomQuote::class.java)
                intent.putExtra("Quote", motivational)
                startActivity(intent)
            }
        }
    }


}