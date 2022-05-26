package AtividadeErancaPoliferismo

class Cachorro ( override var nome: String, override var idade: Int, var pelo: String):
    Animal  {



    override fun correr() {
        super.correr()
        println("Correndo e como Dog")
    }

    override fun emitsom() {
        super.emitsom()
        println(" AU AU ")
    }
    override fun toString(): String {
        return "Cachorro com nome $nome, idade $idade e cor do pelo $pelo"
    }


}
