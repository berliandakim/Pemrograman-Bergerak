package com.example.visitsouthkorea.choose

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.visitsouthkorea.R
import com.example.visitsouthkorea.databinding.FragmentDetailChooseBinding

class DetailChooseFragment : Fragment() {


    companion object{
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_INFO = "extra_info"
    }

    private lateinit var binding : FragmentDetailChooseBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailChooseBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataPhoto = arguments?.getInt(EXTRA_PHOTO,0)
        val dataInfo = arguments?.getString(EXTRA_INFO)
        Log.d("Info", "$dataInfo")

        binding.tvInfo.text = dataInfo.toString()
        Glide.with(view.context)
                .load(dataPhoto)
                .apply(RequestOptions().override(350,350))
                .into(binding.imgDestinasi)


    }

}