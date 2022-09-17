package com.example.randomquote

import kotlin.random.Random

class MotivQuote {
        companion object {
            private val motivquote = mapOf(
                Pair(1,"When you have a dream, you've got to grab it and never let go. — Carol Burnett"),
                Pair(2, "Nothing is impossible. The word itself says 'I'm possible! — Audrey Hepburn"),
                Pair(3, "There is nothing impossible to they who will try. — Alexander the Great"),
                Pair(4, "The bad news is time flies. The good news is you're the pilot. — Michael Altshuler"),
                Pair(5, "Life has got all those twists and turns. You've got to hold on tight and off you go. — Nicole Kidman"),
                Pair(6, "Keep your face always toward the sunshine, and shadows will fall behind you. — Walt Whitman"),
                Pair(7, "Be courageous. Challenge orthodoxy. Stand up for what you believe in. When you are in your rocking chair talking to your grandchildren many years from now, be sure you have a good story to tell. — Amal Clooney"),
                Pair(8, "You make a choice: continue living your life feeling muddled in this abyss of self-misunderstanding, or you find your identity independent of it. You draw your own box. — Duchess Meghan"),
                Pair(9, "I just want you to know that if you are out there and you are being really hard on yourself right now for something that has happened ... it's normal. That is what is going to happen to you in life. No one gets through unscathed. We are all going to have a few scratches on us. Please be kind to yourselves and stand up for yourself, please. — Taylor Swift"),
                Pair(10,  "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill")

            )

            fun getMQuote(): String{

                val mquote = Random.nextInt(1, 11)
                return motivquote[mquote].toString()
            }

        }
    }
