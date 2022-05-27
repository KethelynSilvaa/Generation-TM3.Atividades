
abstract class Metabolica(
    var altura: Double,
    var peso: Double,
    var idade: Int) {


        fun verificaIdade(idade: Int){
            if (idade in 0 .. 12){
                println("Criança")
            }else if (idade in 12 .. 18){
                println("Jovem")
            }else if (idade in 18 ..50){
                println("Adulto")
            }else if (idade >= 50){
                println("Idoso")
            }else{
                println("Idade Inválido")
            }
        }

        fun imc(peso: Double, altura: Double): Double{
            var calcImc = peso / Math.pow(altura, 2.0)
            println("%.2f".format(calcImc))
            return calcImc
        }

    abstract fun tmb(idade: Int, altura: Double, peso: Double)
    abstract fun tmb(idade: Int, altura: Double, peso: Double)
}


