package com.als1921008.pracexam.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.als1921008.pracexam.model.Res


class MViewModel : ViewModel(){

    val userLiveData = MutableLiveData<ArrayList<Res>>()
    private val originalUserList = ArrayList<Res>()
    private val userList = ArrayList<Res>()

    fun load(){
        originalUserList.addAll(dataSet())
    }

    private fun dataSet(): ArrayList<Res> {
        val res1 = Res("Thikana", "Shop 401-403, White Square Building, Hinjawadi, Pune","Bar Food, North Indian, Fast Food","4.2 / 5")
        val res2 = Res("Vaishali", "1218/1, Rage Path, Ganeshwadi, Shivajinagar, FC Road, Pune","South-Indian food","4.5 / 5")
        val res3 = Res("Le Plaisir", "Survey 759/125, Rajkamal, Opposite Kelkar Eye Hospital, Prabhat Road, Deccan Gymkhana, Pune"," European, Italian, Continental, Cafe","4.9 / 5")
        val res4 = Res("Bungalow 424", "Survey 424, Karve Road, Opposite World of Titan, Kothrud, Pune","Bar Food, Pizza","4.1 / 5")
        val res5 = Res("TTF - The Tenth Floor", "10th Floor, Deron Heights, Above Ranka Jewellers, Baner, Pune"," Cocktail, Cheesecake, Chocolate, Dessert","4.3 / 5")
        val res6 = Res("Mezza 9", "Survey 152, IT Park, Phase 1, Opposite KPIT Cummins, Hinjawadi, Pune","Sizzlers, Lasagne, Tiramisu","4.1 / 5")
        val res7 = Res("360 Degree - The Rooftop Restaurant & Bar", "7, 8, 9, Bhosale Shinde Arcade, Ghole Road, Near Deccan Gymkhana, JM Road, Pune"," Mughlai, Fast Food, North Indian, Beverages","3.4 / 5")
        val res8 = Res("Rude Lounge", "Trade Net Building, Clover Park, Phoenix Road, Viman Nagar, Pune","North Indian, Chinese, Fast Food, Bar Food","4.2 / 5")

        val userList = ArrayList<Res>()
        userList.add(res1)
        userList.add(res2)
        userList.add(res3)
        userList.add(res4)
        userList.add(res5)
        userList.add(res6)
        userList.add(res7)
        userList.add(res8)
        return userList
    }

    fun addButtonClicked() {
        if(originalUserList.isNotEmpty()){
            userList.add(originalUserList.removeFirst())
            userLiveData.value = userList
        }
    }
}