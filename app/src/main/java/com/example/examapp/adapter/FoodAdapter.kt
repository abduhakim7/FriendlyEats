package com.example.examapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.R
import com.example.examapp.adapter.FoodAdapter.*
import com.example.examapp.model.FoodModel

class FoodAdapter(var context:Context, var foodList:ArrayList<FoodModel>) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MemberViewHolder(view)
    }

    class MemberViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var image: ImageView
        var foodName: TextView
        var restaurantName: TextView

        init {
            image =view.findViewById(R.id.img_food)
            foodName =view.findViewById(R.id.tv_food_name)
            restaurantName =view.findViewById(R.id.tv_restaurant_name)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = foodList[position]

        if(holder is MemberViewHolder){
            val image =holder.image
            val foodName =holder.foodName
            val restaurantName =holder.restaurantName

            image.setImageDrawable(item.foodImage)
            foodName.setText(item.foodName)
            restaurantName.setText(item.restaurantName)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}