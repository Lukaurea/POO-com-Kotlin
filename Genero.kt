abstract class Genero(val nome: String) {
    abstract fun getDescricao(): String
}

class GeneroLaticinio(nome: String) : Genero(nome) {
    override fun getDescricao(): String {
        return "Produtos lácteos, como leite e queijo"
    }
}

class GeneroBiscoito(nome: String) : Genero(nome) {
    override fun getDescricao(): String {
        return "Biscoitos de vários tipos"
    }
}
