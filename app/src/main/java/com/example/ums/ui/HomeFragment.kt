package com.example.ums.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ums.R
import com.example.ums.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       binding.apply {
           lineTarif.setOnClickListener {
               findNavController().navigate(R.id.listFragment, bundleOf("key" to 1))
           }
           lineDaqiqalar.setOnClickListener {
               findNavController().navigate(R.id.listFragment, bundleOf("key" to 2))
           }
           lineInternet.setOnClickListener {
               findNavController().navigate(R.id.listFragment, bundleOf("key" to 3))
           }
           lineXizmatlar.setOnClickListener {
               findNavController().navigate(R.id.listFragment, bundleOf("key" to 4))
           }
           lineSms.setOnClickListener {
               findNavController().navigate(R.id.listFragment, bundleOf("key" to 5))
           }
           lineYangiliklar.setOnClickListener {
               val intent = Intent(Intent.ACTION_VIEW)
               intent.data = Uri.parse("https://mobi.uz/uz/")
               startActivity(intent)
           }
       }

       return binding.root
       }
}