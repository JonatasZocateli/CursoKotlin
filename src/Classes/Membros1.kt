package Classes

class Data(var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(dia = 11,mes = 12, ano = 1989)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with (nascimento){
        println("$dia/$mes/$ano")
    }
    println(nascimento.formatar())
}