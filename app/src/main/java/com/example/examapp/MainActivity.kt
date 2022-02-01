package com.example.examapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.adapter.FoodAdapter
import com.example.examapp.model.FoodModel

class MainActivity : AppCompatActivity() {

    lateinit var context:Context
    lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView(){
        context = this
        recyclerView =findViewById(R.id.rv)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        val foodList : ArrayList<FoodModel> = ArrayList()

        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "foodName", "restaurantName"))
        refreshAdapter(foodList)
    }

    fun refreshAdapter(foodList:ArrayList<FoodModel>) {
        val adapter = FoodAdapter(context, foodList)
        recyclerView.adapter = adapter
    }
}