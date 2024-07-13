algoritmo "diagonalPrincipal"


var
      M: vetor[0..9, 0..9] de Inteiro
      N, i, j, cont: Inteiro

inicio

      escreval("Qual a ordem da matriz?")
      leia(N)

      para i de 0 ate N-1 faca
          para  j de 0 ate N-1 faca
                escreva ("Informe o numero da posição [", i, ",", j, " ]: ")
                leia(M[i,j])
          fimpara
      fimPara

      escreval("DIAGONAL PRINCIPAL: ")
      cont <- 0
      para i de 0 ate N-1 faca
           EscrevaL (M[i,i]:4)
           para cont de 0 ate i faca
                Escreva("    ")
           FimPara
      FimPara

fimalgoritmo