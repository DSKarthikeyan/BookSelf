package com.dsk.bookself.data.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "book_details")
data class BooksItem(
    val authors: List<String>,
    val categories: List<CategoryDetails>,
    val isbn: String,
    val longDescription: String,
    val pageCount: Int,
    val publishedDate: PublishedDate,
    val shortDescription: String,
    val status: String,
    val thumbnailUrl: String,
    val title: String
){
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    var id: Int? = null
}