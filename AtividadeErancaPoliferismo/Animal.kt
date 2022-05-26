package AtividadeErancaPoliferismo

import AtividadeErancaPoliferismo.Preguica
import AtividadeErancaPoliferismo.Cavalo
import AtividadeErancaPoliferismo.Cachorro


interface Animal {

    var nome: String
    var idade: Int


    fun emitsom() {
        println("")
    }

    fun correr() {

        println("")
    }
}
fun main (){
     val cachorro = Cachorro("Bob", 2, "caramelo")
    cachorro.emitsom()
    cachorro.correr()
    println("\n$cachorro")

    val cavalo= Cavalo ("Relampago", 8, )
    cavalo.emitsom()
    cavalo.correr()
    println("\n$cavalo")

    var preguica = Preguica ("Tired", 3,"Marrom")
    preguica.emitsom()
    preguica.correr()
    println("\n$preguica")
}