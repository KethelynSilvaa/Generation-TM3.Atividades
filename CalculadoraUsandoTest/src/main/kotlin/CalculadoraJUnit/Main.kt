import CalculadoraJUnit.Calculadora

fun main (){

        println("*** CALCULADORA SIMPLES ***")
        println(
            "Qual operação deseja efetuar?" +
                    "\nDigite: 1 - Soma" +
                    "\nDigite: 2 - Subtração" +
                    "\nDigite: 3 - Multiplicação " +
                    "\nDigite: 4 - Divisão" +
                    "\nDigite: 5 - Raiz" +
                    "\nDigite: 5 - Elavado"
        )
        val operacao = readln().toInt()

        println("Informe o primeiro número da operação: ")
        var n1 = readln().toDouble()
        println("Informe o segundo número da operação: ")
        var n2 = readln().toDouble()


        when (operacao) {
            1 -> println(Calculadora.som(n1, n2))
            2 -> println(Calculadora.sub(n1, n2))
            3 -> println(Calculadora.mult(n1, n2))
            4 -> println(Calculadora.div(n1, n2))
            5 -> println(Calculadora.pot(n1, n2))
            6 -> println(Calculadora.ele(n1))
        }




}