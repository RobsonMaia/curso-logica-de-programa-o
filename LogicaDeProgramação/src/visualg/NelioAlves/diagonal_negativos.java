algoritmo "diagonal_negativos"


var
      M: vetor[0..9, 0..9] de Inteiro
      N, i, j, cont: Inteiro

inicio

      escreval("Qual a ordem da matriz?")
      leia(N)
      
      Para i de 0 ate N Faça
          Para  j de 0 ate N Faça
                Escreva ("Informe o numero da posição [", i, ",", j, " ]: ")
                Leia(M[i,j])
          FimPara
      FimPara

      escreval("DIAGONAL PRINCIPAL: ")

      Para i de 0 ate N-1 Faça
            Escreva (M[i,i], " ")
      FimPara

      Escreval
      cont <- 0

      Para i de 0 ate N Faça
          Para  j de 0 ate N Faça
               se M[i,j] < 0 entao
                  cont <- cont + 1
               fimse
          fimpara
      fimpara

      Escreval("QUANTIDADE DE NEGATIVOS = ", cont)

fimalgoritmo