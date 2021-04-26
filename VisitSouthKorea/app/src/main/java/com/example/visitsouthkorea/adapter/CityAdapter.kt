package com.example.visitsouthkorea.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.visitsouthkorea.R
import com.example.visitsouthkorea.databinding.ListCityBinding
import com.example.visitsouthkorea.detail.DetailCityActivity
import com.example.visitsouthkorea.entity.Korea

class CityAdapter : RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    private val listKorea = ArrayList<Korea>()

    fun setKorea(korea: List<Korea>){
        if (korea.isEmpty()) return
        listKorea.clear()
        listKorea.addAll(korea)
    }

    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ListCityBinding.bind(itemView)

        fun bind(korea : Korea){
            binding.tvNamecity.text = korea.name
            Glide.with(itemView.context)
                .load(korea.image)
                .apply(RequestOptions().override(350,350))
                .into(binding.imgCity)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailCityActivity::class.java)
                intent.putExtra(DetailCityActivity.EXTRA_DATA, korea)
                itemView.context.startActivity(intent)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_city, parent, false)
        return CityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.bind(listKorea[position])
    }

    override fun getItemCount(): Int = listKorea.size
}