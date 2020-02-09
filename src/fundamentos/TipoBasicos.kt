package fundamentos

import java.util.*

fun main() {
    //Tipos Numericos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 135135135135135 //Long.MAX_VALUE

    //Tipos Numericos Reais
    val num5 = 3.14F
    val num6 = 3.14

    //Tipos Caractere
    val char: Char = '?' //'a','1'

    //Tipo Booleano
    var boolean: Boolean = true

    println(listOf(num1,num2,num3,num4,num5,num6,char,boolean))

    println(2 is Int)
    println(232312341414411 is Long)

    //Tudo é objeto
    println(10.dec())


}