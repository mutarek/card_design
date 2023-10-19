package com.example.dummyprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyllerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        recyllerview = findViewById(R.id.recyllerView)
//
//        recyllerview.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = TopUpAdapter(createDummyData(), 1)
        }
    }

//    private fun createDummyData(): ArrayList<OfferModel> {
//        return arrayListOf<OfferModel>(
//            OfferModel(
//                "১ পঃ/ সেকেন্ড", "কঃ ৳৪", " ৭দিন", 122
//            ),
//            OfferModel(
//                "১ পঃ/ সেকেন্ড", "কঃ ৳৪", " ৭দিন", 133
//            ),
//
//
//            )
//    }
