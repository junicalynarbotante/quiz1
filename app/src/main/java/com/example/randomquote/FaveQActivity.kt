package com.example.randomquote

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.randomquote.databinding.FavquoteBinding

class FaveQActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var binding: FavquoteBinding
    private lateinit var  sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FavquoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

        binding.btnDel.setOnClickListener(this)
        val listQuote = String.format("%s", sharedPreferences.getString(FAV_QUOTE, ""))
        binding.textView.text = listQuote
    }

    override fun onClick(p0: View?) {
        val editor = sharedPreferences.edit().clear()
        when(p0!!.id){
            (R.id.btn_del)    ->{
                editor.apply()
                Toast.makeText(this, "QUOTE DELETED", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}