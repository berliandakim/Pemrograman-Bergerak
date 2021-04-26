package com.example.visitsouthkorea.choose

import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.visitsouthkorea.R
import com.example.visitsouthkorea.databinding.FragmentChooseBinding
import com.example.visitsouthkorea.entity.Korea
import kotlin.math.log

class ChooseFragment : Fragment(), View.OnClickListener {

    companion object{
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var dataKorea : Korea
    private lateinit var binding : FragmentChooseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentChooseBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataKorea = arguments?.getParcelable<Korea>(EXTRA_DATA) as Korea
        Log.d("Check", dataKorea.toString())

        binding.btnFashion.setOnClickListener(this)
        binding.btnHotel.setOnClickListener(this)
        binding.btnMarket.setOnClickListener(this)
        binding.btnMuseum.setOnClickListener(this)
        binding.btnNature.setOnClickListener(this)
        binding.btnRestaurant.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_fashion -> {
                val fragmentManager = fragmentManager
                val chooseDetailFragment = DetailChooseFragment()
                val bundle = Bundle()

                bundle.putInt(DetailChooseFragment.EXTRA_PHOTO, dataKorea.photoFashion)
                bundle.putString(DetailChooseFragment.EXTRA_INFO, dataKorea.infoFashion)
                Log.d("Bundle", bundle.toString())

                chooseDetailFragment.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_choose, chooseDetailFragment, DetailChooseFragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
            R.id.btn_hotel -> {
                val fragmentManager = fragmentManager
                val chooseDetailFragment = DetailChooseFragment()
                val bundle = Bundle()

                bundle.putInt(DetailChooseFragment.EXTRA_PHOTO, dataKorea.photoHotel)
                bundle.putString(DetailChooseFragment.EXTRA_INFO, dataKorea.infoHotel)

                chooseDetailFragment.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_choose, chooseDetailFragment, DetailChooseFragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
            R.id.btn_market -> {
                val fragmentManager = fragmentManager
                val chooseDetailFragment = DetailChooseFragment()
                val bundle = Bundle()

                bundle.putInt(DetailChooseFragment.EXTRA_PHOTO, dataKorea.photoMarket)
                bundle.putString(DetailChooseFragment.EXTRA_INFO, dataKorea.infoMarket)

                chooseDetailFragment.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_choose, chooseDetailFragment, DetailChooseFragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
            R.id.btn_museum -> {
                val fragmentManager = fragmentManager
                val chooseDetailFragment = DetailChooseFragment()
                val bundle = Bundle()

                bundle.putInt(DetailChooseFragment.EXTRA_PHOTO, dataKorea.photoMuseum)
                bundle.putString(DetailChooseFragment.EXTRA_INFO, dataKorea.infoMuseum)

                chooseDetailFragment.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_choose, chooseDetailFragment, DetailChooseFragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
            R.id.btn_restaurant -> {
                val fragmentManager = fragmentManager
                val chooseDetailFragment = DetailChooseFragment()
                val bundle = Bundle()

                bundle.putInt(DetailChooseFragment.EXTRA_PHOTO, dataKorea.photoRestaurant)
                bundle.putString(DetailChooseFragment.EXTRA_INFO, dataKorea.infoRestaurant)

                chooseDetailFragment.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_choose, chooseDetailFragment, DetailChooseFragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
            R.id.btn_nature -> {
                val fragmentManager = fragmentManager
                val chooseDetailFragment = DetailChooseFragment()
                val bundle = Bundle()

                bundle.putInt(DetailChooseFragment.EXTRA_PHOTO, dataKorea.photoNature)
                bundle.putString(DetailChooseFragment.EXTRA_INFO, dataKorea.infoNature)

                chooseDetailFragment.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_choose, chooseDetailFragment, DetailChooseFragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
        }
    }
}