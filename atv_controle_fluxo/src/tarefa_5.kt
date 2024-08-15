fun main() {
    val linhas = 4
    val colunas =4
    var digito = 10.25f
    //colocar primeiro linhas e depois colunas caso o contrario sera uma matriz transposta
    val matriz: Array<Array<Float>> = Array(linhas) {Array(colunas) {0f}}

    for(i in 0 until linhas) {
        for(j in 0 until colunas) {
            matriz[i][j] = digito++
        }
    }

    println("Quantidade de colunas: ${matriz[0].size}")
    println("Quantidade de linhas: ${matriz.size}")

    for(i in 0 until linhas) {
        for(j in 0 until colunas) {
            print("${matriz[i][j]}  ")
        }
        println()
    }
}