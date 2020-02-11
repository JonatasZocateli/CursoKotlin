package fundamentos.controles

fun main() {
    val nota = 6

    when(nota){
        10, 9 -> println("Excelente")
        8, 7 -> println("Parabéns")
        6, 5, 4 -> print("Recuperação")
        in 0..3 -> print("Não deu")
        else -> print("Nota Inválida")
    }
}