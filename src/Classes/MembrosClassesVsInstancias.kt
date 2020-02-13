package Classes

class ItemDePedido(val nome: String, var preco: Double){
    companion object{
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemDePedido.create("TV de 42'",299.90)
    val item2 = ItemDePedido("Sofá 4 lugares",990.90)
    ItemDePedido.desconto = 0.1

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}