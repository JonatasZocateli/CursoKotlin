package Classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean){
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main() {
    val p1 = Produto("MacBook",8990.00,0.20,true)
    println(p1.precoComDesconto)

    val p2 = Produto("Mochila HP",89.90,0.17,false)
    with(p2){
        println("$nome - De: R$: $preco Por: R$: $precoComDesconto")
    }

}