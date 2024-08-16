fun main() {
    val valores = doubleArrayOf(10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 95.0)
    val valor_procurado = 95.0

    for(i in 0 until valores.size) {

        if(valor_procurado == valores[i]) {
            println("Elemento $valor_procurado achado")
            break
        }

        if(i == valores.size-1) println("Elemento $valor_procurado não achado")
    }
}