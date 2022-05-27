
fun main(){


    println("Informe seu nome:")
    val nome= readln()
    println("Informe sua idade:")
    val idade= readln().toInt()
    println("Informe sua altura :")
    val altura= readln().toDouble()
    println("Informe seu peso:")
    val peso= readln().toDouble()
    println("Infome seu genero: 1 - Fem / 2 - Masc")
    when(readln().toInt()){
        1->{
            val mulher= Mulher(altura, peso, idade, nome)

        }
        2->{
            val homem= Homem(altura, peso, idade, nome)
        }
    }


}