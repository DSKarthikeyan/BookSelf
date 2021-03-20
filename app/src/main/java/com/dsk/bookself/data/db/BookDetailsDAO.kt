package com.dsk.bookself.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dsk.bookself.data.model.BooksItem

@Dao
interface BookDetailsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @JvmSuppressWildcards
    suspend fun insertBookList(objects: List<BooksItem?>)

    @Query("SELECT * FROM book_details")
    fun getAllBookDetails(): LiveData<List<BooksItem>>


}