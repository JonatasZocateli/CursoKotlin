package Classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2("Eli",2001,"Ação")
     println("${filme.nome} foi lançado em ${filme.anoLancamento} sem um filme de ${filme.genero}")
}