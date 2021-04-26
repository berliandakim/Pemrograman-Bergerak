package com.example.visitsouthkorea.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.visitsouthkorea.R
import com.example.visitsouthkorea.choose.ChooseActivity
import com.example.visitsouthkorea.databinding.ActivityDetailCityBinding
import com.example.visitsouthkorea.entity.Korea
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class DetailCityActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding : ActivityDetailCityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailCityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataCity = intent.getParcelableExtra<Korea>(EXTRA_DATA)

        setDetail(dataCity)

        binding.btnMore.setOnClickListener {
            val intent = Intent(this, ChooseActivity::class.java)
            intent.putExtra(ChooseActivity.EXTRA_KOREA, dataCity)
            startActivity(intent)
        }

    }

    private fun setDetail(city: Korea?) {
        binding.tvNameCity.text = city?.name
        binding.tvInfo.text = city?.info
        Glide.with(this)
            .load(city?.image)
            .transform(RoundedCornersTransformation(10,10))
            .apply(RequestOptions().override(350,350))
            .into(binding.imgCity)
    }
}