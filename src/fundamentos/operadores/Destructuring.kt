package fundamentos.operadores

data class Carro(val marca: String, val modelo:String)

fun main() {
    val(marca,modelo) = Carro("Ford","Eco Sport")
    println("Marca: $marca | Modelo: $modelo")

    val(_,_,terceiroLugar) = listOf("Hemilton","Kimi","Massa")
    println(terceiroLugar)
}