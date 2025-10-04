package com.example.lesson_31

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lesson_31.databinding.ItemCarCardBinding

class CarAdapter(val listCar: List<CarModel>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarViewHolder {
        return CarViewHolder(
            ItemCarCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: CarViewHolder,
        position: Int
    ) {
        holder.onBind(listCar[position])
    }

    override fun getItemCount(): Int {

        return listCar.size
    }

    class CarViewHolder(private val binding: ItemCarCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(carModel: CarModel){
            binding.carName.text = carModel.title
            binding.datesValue.text = carModel.data
            binding.priceValue.text = carModel.price
            binding.statusText.text = carModel.status
            Glide
                .with(binding.carImage)
                .load(carModel.img)
                .centerCrop()
                .into(binding.carImage);


        }

    }
}


