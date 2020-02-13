package Classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp",320)
    val g2 = Geladeira("Brastemp",320)

    println(g1==g2) //No class -> Compara referencia de memoria

    val tv1 = Televisao("Samsung",55)
    val tv2 = Televisao("Samsung",55)

    println(tv1==tv2) //No data class -> Compara valores
    println(tv1===tv2) //no data class -> Compara referencia de memmoria

    println(g1.toString())
    println(tv1.toString())
    println(tv1.copy(polegadas = 42))
    val tv3 = tv1.copy()
    println(tv3.toString())

    //Destructuring em data class
    val (marca,pol) = tv1
    println("$marca com $pol")

}