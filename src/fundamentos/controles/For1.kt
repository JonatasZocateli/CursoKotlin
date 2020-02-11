package fundamentos.controles

fun main() {
    //Modo 1
    for(i in 1 until 10 step 2){
        println(i)
    }

    //Modo 2
    for(i in 10 downTo 1 step 4){
        println(i)
    }

    //Percorrendo Lista
    val alunos = arrayListOf("Jonatas","Milena","Davi","Jonas",
        "Giane")
    for((indice,aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
}