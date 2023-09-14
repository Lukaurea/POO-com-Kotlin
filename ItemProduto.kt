class ItemProduto(val codigoBarras: String, val dataValidade: Data, val produto: Produto) {
    fun valido(): Boolean {
        val dataAtual = Data.dataHoje()
        return !dataValidade.antes(dataAtual)
    }
}