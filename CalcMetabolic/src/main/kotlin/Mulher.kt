abstract class Mulher(altura: Double, peso: Double, idade: Int, nome: String) :
    Metabolica (altura, peso, idade) {

    override fun tmb(idade: Int, altura: Double, peso: Double, sexo: Boolean): Double {
        var auxAltura = altura * 100
        var calcTbm2 = 665 + (9.6 * peso) + (1.8 * auxAltura) - (4.7 * idade)
        println("Mulher: " + "%.2f".format(calcTbm2))
        return calcTbm2
    }
}