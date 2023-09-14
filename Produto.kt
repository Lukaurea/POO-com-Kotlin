class Produto(val codigo: Int, val nome: String, val preco: Double, val marca: Marca, val genero: Genero) {
    fun getMarca(): Marca {
        return marca
    }

    // Outros getters e setters para os atributos codigo, nome, preco e genero

}
