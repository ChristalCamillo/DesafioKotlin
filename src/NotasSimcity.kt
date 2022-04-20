import kotlin.system.exitProcess

//programa que leia as notas da primeira, segunda, terceira e quarta avaliação de um aluno. Calcule
//e imprima a média semestral.
//O programa só aceitará notas válidas (uma nota válida deve pertencer ao intervalo
//[0,10]). Cada nota deve ser validada separadamente.
// uma função fun calcularmedia(nota1, nota2, nota3, nota4) retorno media
//função validarnotas (nota1, nota2, nota3, nota4) ---- sem retorno
// função mostrarmedia(calcularmedia(validarnotas)) ---- sem retorno
// fazer um menu dentro da main -- duas opções: 1 -- roda de novo 2-- sair


fun main() {

    do{
        val nota1 = lerNota()
        val nota2 = lerNota()
        val nota3 = lerNota()
        val nota4 = lerNota()
        print("Calcule aqui a média de notas dos seus alunos. Selecione 1 para rodar o programa e 2 para sair")
        val opcao: Int = readln().toInt()

        if(opcao == 1){

            if(notaEvalida(nota1) && notaEvalida(nota2) && notaEvalida(nota3) && notaEvalida(nota4)){
                val media = calcularMedia(nota1,nota2,nota3,nota4)
                imprimirMedia(media)
            }
            else{
                println("erro no programa")
            }
        }
        else if(opcao == 2){
            exitProcess(0)
        }
    }while(true)
}

fun lerNota(): Int{
    println("Digite a nota")
    val nota = readln().toInt()
    return nota
}

fun notaEvalida(nota: Int): Boolean{
    if(nota > 0 && nota < 10){
        return true
    }
    else{
        println("nota inválida")
        return false
    }
}

fun calcularMedia(nota1: Int, nota2: Int, nota3: Int, nota4: Int): Int{
    val media = (nota1+nota2+nota3+nota4)/4
    return media
}

fun imprimirMedia(media: Int){
    println(media)
}