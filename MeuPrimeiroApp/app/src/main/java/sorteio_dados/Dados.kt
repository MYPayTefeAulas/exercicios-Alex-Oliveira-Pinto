package greeter

class Dado(val numeroLados: Int) {
    private var qtdLados = mutableListOf<Int>()
    private var i = 1

    fun lancar(): String{
        while(i <= numeroLados){
            qtdLados.add(i)
            i++
        }
        return "${qtdLados.shuffled().first()}"
    }

}