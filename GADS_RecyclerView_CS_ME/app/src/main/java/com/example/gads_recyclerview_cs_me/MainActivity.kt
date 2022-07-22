package com.example.gads_recyclerview_cs_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.gads_recyclerview_cs_me.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var carList: ArrayList<Car>
    private lateinit var carAdapter: CarAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createRecyclerView()
    }


    private fun createRecyclerView() {

        recyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false )

        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)

        carList = ArrayList()

        addDataToList()
        carAdapter = CarAdapter(carList)
        recyclerView.adapter = carAdapter

        carAdapter.myOnItemClick = {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("car", it)
            startActivity(intent)

        }

    }

    private fun addDataToList() {
        carList.add(Car(R.drawable.bbb, "Lexy"))
        carList.add(Car(R.drawable.ccc, "Lexy"))
        carList.add(Car(R.drawable.ddd, "Lexy"))
        carList.add(Car(R.drawable.eee, "Lexy"))
        carList.add(Car(R.drawable.fff, "Lexy"))
        carList.add(Car(R.drawable.ggg, "Lexy"))
        carList.add(Car(R.drawable.hhh, "Lexy"))
    }
}