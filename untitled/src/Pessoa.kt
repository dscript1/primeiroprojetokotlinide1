class Pessoa {
    var nome string = "fulano"
    var cpf string = "123.456.789-10"
}

fun main() {
    val fulano = Pessoa()

    println(fulano.nome)
    println(fulano.cpf)
}