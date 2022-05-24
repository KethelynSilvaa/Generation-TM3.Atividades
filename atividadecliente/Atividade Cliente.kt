import atividadecliente.ContaClinte

fun main() {

    val cliente = ContaClinte()


    println("Informe seu nome:")
    cliente.nome = readln()
    println("Informe sua idade:")
    cliente.idade = readln().toInt()
    println("Informe seu cpf:")
    cliente.cpf = readln()
    println("Informe valor do Produto:")
    cliente.valprod = readln().toInt()
    cliente.saldcont = 2000
    cliente.crtcred = ""
}


