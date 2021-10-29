package agenda_vsiii

data class ContatosIII(var nome: String, var telefone: String, var favorito: Boolean = false ) {
    val id = getProximoId()

    companion object {
        var lastId = -1

        fun getProximoId(): Int {
            return lastId++
        }
    }
}