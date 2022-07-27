package com.example.gads_recyclerview_fragment_me

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.gads_recyclerview_cs_me.Car
import com.example.gads_recyclerview_fragment_me.databinding.FragmentFirstBinding


class FirstFragment : Fragment(), CarAdapter.ClickListener {

    private lateinit var _binding: FragmentFirstBinding
    private val binding get() = _binding!!

    ////

    private lateinit var recyclerView: RecyclerView
    private lateinit var carList: ArrayList<Car>
    private lateinit var carAdapter: CarAdapter

    ////
    private lateinit var car: Car
    private var selectedCar: Car? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)


        createRecyclerView()

        return binding.root

    }


    private fun createRecyclerView() {

        recyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false )

        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)

        carList = ArrayList()

        addDataToList()
        carAdapter = CarAdapter(carList, this)
        recyclerView.adapter = carAdapter



    }

    private fun addDataToList() {
        carList.add(Car(R.drawable.bbb, "Lexccy"))
        carList.add(Car(R.drawable.ccc, "Lennxy"))
        carList.add(Car(R.drawable.ddd, "Lebbxy"))
        carList.add(Car(R.drawable.eee, "Leaaxy"))
        carList.add(Car(R.drawable.fff, "Lexooy"))
        carList.add(Car(R.drawable.ggg, "Lzzexy"))
        carList.add(Car(R.drawable.hhh, "Levvxy"))
    }


    /// Implementing the click listener
    override fun onCardClick(car: Car) {
        selectedCar = car


        val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(selectedCar!!)
        findNavController().navigate(action)
    }
}