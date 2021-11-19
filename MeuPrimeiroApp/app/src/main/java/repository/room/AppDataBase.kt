package repository.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import model.Contato
import repository.room.dao.ContatoDao
import repository.sqlite.DATABASE_NAME
import repository.sqlite.DATABASE_VERSION

@Database(entities = [
    Contato::class
], version = DATABASE_VERSION, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun contatoDao(): ContatoDao

    companion object {
        private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if(instance == null) {
                synchronized(this) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        DATABASE_NAME
                    )
                        .build()
                }
            }
            return instance as AppDatabase
        }
    }
}
