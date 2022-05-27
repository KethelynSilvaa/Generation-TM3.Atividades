 abstract class Homem( altura: Double, peso: Double, idade: Int, nome: String) :
            Metabolica (altura, peso, idade) {


    override fun tmb(idade: Int, altura: Double, peso: Double, sexo: Boolean): Double{
        var auxAltura = altura * 100

        var calcTbm = 66 + (13.7 * peso) + (5.0 * auxAltura) - (6.8 * idade)
        println("Homem: " + "%.2f".format(calcTbm))
        return calcTbm
    }


}





