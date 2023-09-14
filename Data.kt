import java.util.*

class Data(val dia: Int, val mes: Int, val ano: Int) {
    override fun toString(): String {
        return "$dia/$mes/$ano"
    }

    fun setData(dia: Int, mes: Int, ano: Int) {
        this.dia = dia
        this.mes = mes
        this.ano = ano
    }

    fun antes(outraData: Data): Boolean {
        if (ano < outraData.ano) return true
        if (ano == outraData.ano && mes < outraData.mes) return true
        return ano == outraData.ano && mes == outraData.mes && dia < outraData.dia
    }

    fun depois(outraData: Data): Boolean {
        if (ano > outraData.ano) return true
        if (ano == outraData.ano && mes > outraData.mes) return true
        return ano == outraData.ano && mes == outraData.mes && dia > outraData.dia
    }

    fun igual(outraData: Data): Boolean {
        return dia == outraData.dia && mes == outraData.mes && ano == outraData.ano
    }

    companion object {
        fun dataHoje(): Data {
            val calendar = Calendar.getInstance()
            val dia = calendar.get(Calendar.DAY_OF_MONTH)
            val mes = calendar.get(Calendar.MONTH) + 1 // Janeiro é 0 em Calendar
            val ano = calendar.get(Calendar.YEAR)
            return Data(dia, mes, ano)
        }
    }
}
