package agenda_vsiii

data class ContatosIII(var nome: String, var telefone: String) {
    val id = getProximoId()

    companion object {
        var lastId = -1

        fun getProximoId(): Int {
            return lastId++
        }
    }
}