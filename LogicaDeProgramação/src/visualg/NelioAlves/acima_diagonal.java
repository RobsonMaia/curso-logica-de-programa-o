algoritmo "acima_diagonal"
Var

    i, j, N, soma: inteiro
    matrix: vetor [0..9, 0..9] de inteiro

Inicio

    escreval("Qual a ordem da matriz?")
    leia(N)

    para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(matrix[i,j])
      fimpara
   fimpara


   soma <- 0

   para i de 0 ate N-1 faca
      para j de i+1 ate N-1 faca
         soma <- soma + matrix[i,j]
      fimpara
   fimpara

   escreval("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = ", soma)

fimalgoritmo
