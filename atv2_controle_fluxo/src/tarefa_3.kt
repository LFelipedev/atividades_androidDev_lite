fun main() {
    val numero = 8
    var cont = 0

    for(i in 2 until numero) {
        if(numero%i == 0) cont++
        if(cont > 0) break
    }

    if(cont != 0) println("Numero não é primo")
    else println("Numero primo")
}