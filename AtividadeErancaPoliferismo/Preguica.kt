package AtividadeErancaPoliferismo

class Preguica ( override var nome: String, override var idade: Int, var pelo: String):
    Animal  {
    override fun correr() {
        super.correr()
        println(" Co rren do co mo uma  pre gui ça" )
    }

    override fun emitsom() {
        super.emitsom()
        println("Preguiça Emiti Som?")
    }
    override fun toString(): String {
        return "Preguiça com nome $nome, idade $idade, e cor do pelo $pelo"
    }
}