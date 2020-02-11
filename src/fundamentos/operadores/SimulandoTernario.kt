package fundamentos.operadores

fun obterResultado(resultado: Double) : String = if(resultado>7) "Aprovado" else "Reprovado"

fun main() {
    val nota = 6.5
    val resultado: String = if(nota>6) "Aprovado" else "Reprovado"
    println(resultado)

    println(obterResultado(nota))
}