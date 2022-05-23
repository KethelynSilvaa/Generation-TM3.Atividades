fun main() {

    print("Qual função voçê quer chamar?" +
            "\nDigite: 1 - Soma" +
            "\nDigite: 2 - Multiplicação" +
            "\nDigite: 3 - Divisão " +
            "\nDigite: 4 - Subtração")

    print("\nDigite um número com base na função que voce quer chamar: ")
    val num1 = readln().toInt()

    println("\n")

    print("\nDigite um número da tabudada que vc quer calcular: ")
    val num2 = readln().toInt()

    //Contator para para o loop do do..while
    var cont = 0
    do {
        when(num1){
            1 -> {
                print("${soma(num2)}")
            }
            2 -> {
                print("${mult(num2)}")
            }
            3 -> {
                print(" ${divisao(num2)}")
            }
            4 -> {
                print("${subtracao(num2)}")
            }

        }

        cont++
    }while (num1 in 1..4 && cont <0)

}

fun soma(n1: Int): Int {
    var result= 0
    for (i in 1..10){
        result = n1
        print(n1)
        print(" x ")
        print(i)
        print(" = ")
        println("$result")
    }
    return result
}





fun mult(n1: Int): Int{
    var result=0
    for (i in 1..10){
        result = n1
        print(n1)
        print(" x ")
        print(i)
        print(" = ")
        println("$result")
    }
    return result
}

fun divisao(n1: Int): Int{
    var result=0
    for (i in 1..10){
        result = n1/i
        print(n1)
        print(" ÷ ")
        print(i)
        print(" = ")
        println("$result")
    }
    return result
}

fun subtracao(n1: Int): Int{
    var result=0
    for (i in 1..10){
        result = n1/i
        print(n1)
        print(" - ")
        print(i)
        print(" = ")
        println("$result")
    }
    return result
}

