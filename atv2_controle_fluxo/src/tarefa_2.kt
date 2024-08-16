fun main() {
    println(calculaMedia(9f, 4f, 6f, 10f))
}

fun calculaMedia(nota1: Float, nota2: Float, nota3: Float, nota4: Float): String {

    if ((nota1 in 0.0..10.0) && (nota2 in 0.0..10.0) && (nota3 in 0.0..10.0) && (nota4 in 0.0..10.0)) {

        var notaFinal = (nota1 + nota2 + nota3 + nota4) / 4

        if (notaFinal >= 7) return "Aluno aprovado!"
        if (notaFinal < 7 && notaFinal >= 4) return "Aluno de recuperação."
        if (notaFinal < 4) return "Aluno reprovado"
    }

    return "Nota inexistente"
}