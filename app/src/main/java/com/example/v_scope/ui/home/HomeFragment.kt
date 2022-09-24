package com.example.v_scope.ui.home

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.v_scope.databinding.ActivityMainBinding
import com.example.v_scope.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


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