package com.example.randomquote

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.randomquote.databinding.ActivityQuoteBinding


class RandomQuote : AppCompatActivity(), View.OnClickListener{
    private lateinit var binding: ActivityQuoteBinding
    private lateinit var sharedPreferences: SharedPreferences

    private var slovequote = ""
    private var smotivQuote = ""
    private var sinspiequote = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

        val sQuote = intent.getStringExtra("Quote")
        binding.textView3.text = sQuote

        binding.btnFavorite.setOnClickListener(this)
        binding.btnRandom.setOnClickListener(this)
        if (sQuote == "Love") {
             slovequote = LoveQuote.getLQuote()
            binding.textView3.text = slovequote
        }
        else if (sQuote == "Motivational") {
             smotivQuote = MotivQuote.getMQuote()
            binding.textView3.text = smotivQuote
        }
        else if (sQuote == "Inspirational") {
            sinspiequote = InspiQuote.getIQuote()
            binding.textView3.text = sinspiequote
        }
    }

    override fun onClick(p0: View?) {
        val whatQuote =  intent.getStringExtra("Quote")

        when (p0!!.id) {
            (R.id.btn_random) -> {
                if (whatQuote == "Love") {
                     slovequote = LoveQuote.getLQuote()
                    binding.textView3.text = slovequote
                }
                else if (whatQuote == "Motivational") {
                     smotivQuote = MotivQuote.getMQuote()
                    binding.textView3.text = smotivQuote
                }
                else if (whatQuote == "Inspirational") {
                     sinspiequote = InspiQuote.getIQuote()
                    binding.textView3.text = sinspiequote
                }
            }

            (R.id.btn_favorite) ->{
                val editor = sharedPreferences.edit()

                if (whatQuote == "Love") {
                    editor.putString(FAV_QUOTE, slovequote )
                }
                else if (whatQuote == "Motivational") {
                    editor.putString(FAV_QUOTE, smotivQuote )
                }
                else if (whatQuote == "Inspirational") {
                    editor.putString(FAV_QUOTE, sinspiequote )
                }
                else {}
                editor.apply()
                Toast.makeText(this, "Added to Favorites", Toast.LENGTH_SHORT).show()
            }
        }
    }
}