fun main () {
    /*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
    10-14 infantil
    15-17 juvenil
    18-25 adulto*/

    print("Informe sua idade para verificar sua categoria: ")
    var idade = readln().toInt()

        when (idade) {
             in 10..14 -> println(" Categoria Infatil")
             in 15..17 -> println(" Categoria Juvenil")
             in 18..25 -> println(" Categoria Adulto")

            else -> println("Categoria Inválida")


        }






}