package atividadecliente

class ContaClinte( ) {

    var nome = ""
    var idade = 0
    var cpf = ""
    var valprod = 0
    var saldcont = 2000
    var crtcred = ""


    constructor(
        nome: String, idade: Int, cpf: String, valprod: Double,
        saldcont: Double, crtcred: String
    ): this(nome, idade, cpf, valprod, saldcont) {
        this.crtcred = crtcred
    }

    fun compra(valprod: Int) {
        if (valprod > 20.0  && valprod <= saldcont) {
            saldcont = valprod
            println("compra de R$$valprod realizado com sucesso!\n")
        } else {
            println(" Compra de R$$valprod impossível de ser realizado!\n")
        }
    }
}

