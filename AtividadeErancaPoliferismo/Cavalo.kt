package AtividadeErancaPoliferismo

class Cavalo ( override var nome: String, override var idade: Int):
    Animal  {




    override fun correr() {
        super.correr()
        println("pocotó pocotó")
    }

    override fun emitsom() {
        super.emitsom()
        println(" Hii in in ")
    }
    override fun toString(): String {
        return "Cavalo com nome $nome, idade $idade  $"
    }
}
