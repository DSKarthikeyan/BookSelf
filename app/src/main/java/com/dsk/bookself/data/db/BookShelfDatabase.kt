package com.dsk.bookself.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dsk.bookself.data.model.BooksItem

@Database(
    entities = [BooksItem::class],
    version = 1, exportSchema = false
)
@TypeConverters(Converters::class)
abstract class BookShelfDatabase : RoomDatabase() {

    abstract fun getBookDetailsDao(): BookDetailsDAO

    companion object {
        @Volatile
        private var instance: BookShelfDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                BookShelfDatabase::class.java,
                "book_shelf.db"
            ).build()
    }


}