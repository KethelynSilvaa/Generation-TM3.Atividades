fun main () {

    /*Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)*/


    var num = 0
    var soma = 0
    do {
        println("Digite os números")
        num = readln().toInt()
        soma += num
    }while (num != 0)
        println("A soma é $soma")
}
