fun main() {
    fibonacci(8)
}

fun fibonacci(num: Int) {
    var cont = 0
    for(i in 1 .. num) {
        cont = cont++
        println("${cont}")
    }
}