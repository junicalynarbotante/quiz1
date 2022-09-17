package com.example.randomquote

import kotlin.random.Random

class PoolQuote {
    companion object {
        private val PoolQuotes = mapOf(
            Pair(1, "What we have once enjoyed we can never lose. All that we love deeply becomes a part of us. -Helen Keller"),
            Pair(2, "Loved you yesterday, love you still, always have, always will.” -Elaine Davis"),
            Pair(3, "To love well is the task in all meaningful relationships, not just romantic bonds. -bell hooks, All About Love: New Visions"),
            Pair(4, "Love takes off the masks we fear we cannot live without and know we cannot live within. - James Baldwin, The Fire Next Time"),
            Pair(5, "All’s fair in love and basketball.- Quincy, Love and Basketball."),
            Pair(6, "We loved with a love that was more than love.” - Edgar Allen Poe"),
            Pair(7, "Love isn’t something you find. Love is something that finds you.” - Loretta Young"),
            Pair(8, "Love is a juice with many tastes. Some bitter, others sweet. A wine which has few vineyards. - Justice, Poetic Justice"),
            Pair(9, "The practice of love offers no place of safety. We risk loss, hurt, pain. We risk being acted upon by forces outside our control. - bell hooks, All About Love: New Visions"),
            Pair(10, "One is loved because one is loved. No reason is needed for loving.- Paulo Coelho, The Alchemist"),
            Pair(11, "When you have a dream, you've got to grab it and never let go. — Carol Burnett"),
            Pair(12, "Nothing is impossible. The word itself says 'I'm possible! — Audrey Hepburn"),
            Pair(13, "There is nothing impossible to they who will try. — Alexander the Great"),
            Pair(14, "The bad news is time flies. The good news is you're the pilot. — Michael Altshuler"),
            Pair(15, "Life has got all those twists and turns. You've got to hold on tight and off you go. — Nicole Kidman"),
            Pair(16, "Keep your face always toward the sunshine, and shadows will fall behind you. — Walt Whitman"),
            Pair(17, "Be courageous. Challenge orthodoxy. Stand up for what you believe in. When you are in your rocking chair talking to your grandchildren many years from now, be sure you have a good story to tell. — Amal Clooney"),
            Pair(18, "You make a choice: continue living your life feeling muddled in this abyss of self-misunderstanding, or you find your identity independent of it. You draw your own box. — Duchess Meghan"),
            Pair(19, "I just want you to know that if you are out there and you are being really hard on yourself right now for something that has happened ... it's normal. That is what is going to happen to you in life. No one gets through unscathed. We are all going to have a few scratches on us. Please be kind to yourselves and stand up for yourself, please. — Taylor Swift"),
            Pair(20, "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill"),
            Pair(21, "When you have a dream, you've got to grab it and never let go. — Carol Burnett"),
            Pair(22, "Nothing is impossible. The word itself says 'I'm possible! — Audrey Hepburn"),
            Pair(23, "There is nothing impossible to they who will try. — Alexander the Great"),
            Pair(24, "The bad news is time flies. The good news is you're the pilot. — Michael Altshuler"),
            Pair(25, "Life has got all those twists and turns. You've got to hold on tight and off you go. — Nicole Kidman"),
            Pair(26, "Keep your face always toward the sunshine, and shadows will fall behind you. — Walt Whitman"),
            Pair(27, "Be courageous. Challenge orthodoxy. Stand up for what you believe in. When you are in your rocking chair talking to your grandchildren many years from now, be sure you have a good story to tell. — Amal Clooney"),
            Pair(28, "You make a choice: continue living your life feeling muddled in this abyss of self-misunderstanding, or you find your identity independent of it. You draw your own box. — Duchess Meghan"),
            Pair(29, "I just want you to know that if you are out there and you are being really hard on yourself right now for something that has happened ... it's normal. That is what is going to happen to you in life. No one gets through unscathed. We are all going to have a few scratches on us. Please be kind to yourselves and stand up for yourself, please. — Taylor Swift"),
            Pair(30, "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill")

        )

        fun getPQuote(): String {
            val poolquo = Random.nextInt(1, 31)
            return PoolQuotes[poolquo].toString()
        }
    }
}