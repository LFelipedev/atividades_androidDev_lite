fun main() {
    println(calculaMedia(9f, 4f, 6f, 10f))
}

fun calculaMedia(nota1: Float, nota2: Float, nota3: Float, nota4: Float): String {

    var notaFinal = (nota1 + nota2 + nota3 + nota4)/4

    if(notaFinal >= 7) return "Aluno aprovado!"
    if(notaFinal < 7 && notaFinal >= 4) return "Aluno de recuperação."
    if(notaFinal < 4) return "Aluno reprovado"
    else return "Nota inexistentente"
}