package com.example.v_scope

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.v_scope.databinding.ActivityMainBinding

public class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    //
//class MainActivity : AppCompatActivity(){
//    lateinit var binding: ActivityMainBinding
//
//    override fun onCreaate(savedInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.sendButton.setOnClickListener{
//            val email = binding.editTextEmail.text.toString()
//            val subject = binding.editTextSubject.text.toString()
//            val message = binding.editTextMessage.text.toString()
//            val addresses = email.split(",".toRegex()).toTypeArray()
//
//            val Intent(Intent.ACTION_SENDTO).apply {
//                data = Uri.parse(uriString"mailto:")
//            putExtra(Intent.EXTRA_EMAIL,addresses)
//            putExtra(Intent.EXTRA_EMAIL,subject)
//            putExtra(Intent.EXTRA_EMAIL,message)
//
//        }
//            if (intent.resolveActivity(packageManager) != null){
//                startActivity(intent)
//            }else{
//                Toast.makeText(context: this@MainActivity,"The required app is not installed",Toast.LENGTH_SHORT).show()
//            }
//
//
//        }
//    }

//}
}