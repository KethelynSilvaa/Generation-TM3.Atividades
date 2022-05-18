fun main (){
    /*3-Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)*/



    var idade = 0
    var idade21 = 0
    var idade50 = 0

    while (idade != -99 ) {

        print("informe sua idade: ")
        idade = readln().toInt()

    if (idade!= -99 ) { if (idade < 21)
        idade21++ }

     if (idade >50 ) {
        idade50++ }
    }

    println(" Total de pessoas com menos 21 anos é $idade21" +
            "\n E com mais de 50 anos é $idade50")

    }
