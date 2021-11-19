package repository.room.dao

import androidx.room.*
import model.Contato
import repository.sqlite.COLUMN_ID
import repository.sqlite.TABLE_CONTATO

@Dao
interface ContatoDao {
    @Insert
    fun insert(obj: Contato): Long

    @Update
    fun update(obj: Contato)

    @Delete
    fun delete(obj: Contato)

    @Query("""SELECT * FROM $TABLE_CONTATO WHERE $COLUMN_ID = :id""")
    fun contatoById(id: Long): Contato

    @Query("""SELECT * FROM $TABLE_CONTATO""")
    fun getAllContatos(): List<Contato>
}