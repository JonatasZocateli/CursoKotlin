package fundamentos

fun imprimirSoma(a: Int, b: Int){
    println(a + b)
}

fun imprimirSomaComRetorno(a: Int, b: Int): Int {
    return a + b
}

fun main(){
    imprimirSoma(4,5);
    println(imprimirSomaComRetorno(4,5))
}