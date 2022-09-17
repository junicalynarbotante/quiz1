package com.example.randomquote

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.randomquote.databinding.LovequoteBinding
import java.lang.Math.random
import java.lang.StrictMath.random
import kotlin.random.Random

class LoveQuote {
    companion object{


        private val lovequote = mapOf(
            Pair(1,"What we have once enjoyed we can never lose. All that we love deeply becomes a part of us. -Helen Keller"),
            Pair(2,"Loved you yesterday, love you still, always have, always will.” -Elaine Davis"),
            Pair(3,"To love well is the task in all meaningful relationships, not just romantic bonds. -bell hooks, All About Love: New Visions"),
            Pair(4,"Love takes off the masks we fear we cannot live without and know we cannot live within. - James Baldwin, The Fire Next Time"),
            Pair(5,"All’s fair in love and basketball.- Quincy, Love and Basketball."),
            Pair(6,"We loved with a love that was more than love.” - Edgar Allen Poe"),
            Pair(7,"Love isn’t something you find. Love is something that finds you.” - Loretta Young"),
            Pair(8,"Love is a juice with many tastes. Some bitter, others sweet. A wine which has few vineyards. - Justice, Poetic Justice"),
            Pair(9,"The practice of love offers no place of safety. We risk loss, hurt, pain. We risk being acted upon by forces outside our control. - bell hooks, All About Love: New Visions"),
            Pair(10,"One is loved because one is loved. No reason is needed for loving.- Paulo Coelho, The Alchemist")
        )


        fun getLQuote(): String {

            val lquote =  Random.nextInt(1,11)
            return lovequote[lquote].toString()
        }




    }

}
