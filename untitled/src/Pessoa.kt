class Pessoa {
    var Nome String. = "Claudia"
    var CPF String. = "123.456.789-10"
    private get

    fun uniPessoaInfo() = “$Nome + $CPF” // unifica o NOME E O CPF DO TITULAR
    {
    }
}
inner class = Endereco {
    var Rua String. = "Rua A"
}

fun main() {
    val Claudia  = Pessoa();

    println(Claudia.Nome)
    println(Claudia.CPF)
    println(Claudia.uniPessoaInfo())
// imprime nome e cpf do usuário
}