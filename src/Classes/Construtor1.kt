package Classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String = "Terror"){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("O Senhor dos Anéis",anoLancamento = 2019, genero = "Drama")
    with((filme)){
        println("O $genero $nome foi lançado em $anoLancamento")
    }

}