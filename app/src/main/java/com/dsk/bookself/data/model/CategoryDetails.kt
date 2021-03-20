package com.dsk.bookself.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "category_details")
data class CategoryDetails(
    val categoryImage: String,
    val categoryName: String
){
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    var id: Int? = null
}
