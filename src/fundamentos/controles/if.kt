package fundamentos.controles

fun main() {
    val nota: Double = 8.3

    if(nota >= 7){
        println("Aprovado")
    } else {
        println("reprovado")
    }

    val num1 = 2
    val num2 = 3

    val maiorValor = if(num1>num2) {
        println("processando....")
        num1
    } else {
        println("processando....")
        num2
    }

    println("O maior valor é $maiorValor")

    val nota2 = 4.5
    // Usando operador range
    if(nota2 in 9.0..10.0){
        println("Boa!!")
    } else if (nota2 in (6.5..8.9)){
        println("Razoável, mas vai")
    } else {
        println("Hoje não!")
    }

}