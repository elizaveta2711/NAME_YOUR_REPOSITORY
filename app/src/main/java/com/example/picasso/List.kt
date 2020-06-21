package com.example.picasso

import java.io.Serializable

class List(val imageURL : String) : Serializable {
    companion object{
        fun getAndroidVersionList(): kotlin.collections.List<List> {
            val versionList = ArrayList<List>()
            versionList.clear()
            versionList.add(List("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/cup_cake.png"))
            versionList.add(List("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/donut.png"))
            versionList.add(List("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/eclair.png"))
            versionList.add(List("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/Froyo.jpg"))
            versionList.add(List("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/gingerbread.png"))
            return versionList
        }
    }
}