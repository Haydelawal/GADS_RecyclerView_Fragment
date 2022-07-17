package com.example.gads_path_daawk_module_3_coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.gads_path_daawk_module_3_coroutines.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //activity_main ==>> Activity_Main_Binding
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)


    }
    override fun onSupportNavigateUp(): Boolean {

        val navController = findNavController(R.id.navHost)

        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}