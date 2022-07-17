package com.example.gads_path_daawk_module_3_coroutines

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.gads_path_daawk_module_3_coroutines.databinding.FragmentFirstBinding
import com.example.gads_path_daawk_module_3_coroutines.databinding.FragmentSecondBinding
import kotlinx.coroutines.*

class FirstFragment : Fragment() {


    private lateinit var binding: FragmentFirstBinding
    val scope = CoroutineScope(CoroutineName("MyScope"))

    val scope2 = CoroutineScope(Dispatchers.IO + CoroutineName("MyScope2"))

    // Job Scope
    val jobScope = CoroutineScope(Dispatchers.IO + CoroutineName("JobScope"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            findNavController().navigate(action)
            
            
        }

        scope.launch {
            Log.d("Coroutine", this.coroutineContext.toString())
        }
        scope2.launch {
            Log.d("Coroutine", this.coroutineContext.toString())
        }

        jobScope.launch {
            val job1 = launch {

                while (isActive) {
                    Log.d("Coroutine Job", "Job 1 Running...")
                }
            }

            delay(1000L)
            Log.d("Coroutine Job", "Cancelling....")
            job1.cancel()
            job1.join()
            Log.d("Coroutine Job", "Job 1 Cancelled")

//            val job2 = launch {
//                Log.d("Coroutine Job", "Job 2 Running...")
//            }
        }

        return binding.root
    }

}