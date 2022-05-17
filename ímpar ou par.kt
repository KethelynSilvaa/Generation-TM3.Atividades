import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    /*Faça um programa em que permita a entrada de um número qualquer e exiba se este
            número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
        ímpar exiba o número elevado ao quadrado.*/

    print("Informe um numero para saber se é par ou ímpar:  ")
    var num = readln().toDouble()

    var raiz = sqrt(num)
    var quad = num.pow(2)

    
    if ( num % 2 == 0.0 ) {

        println("Numero ${"%.0f".format(num)} é par e a raiz é ${"%.0f".format(raiz)}")
    } else {
        println("numero ${"%.0f".format(num)} é ímpar o quadrado é ${"%.0f".format(quad)}")
    }





}
