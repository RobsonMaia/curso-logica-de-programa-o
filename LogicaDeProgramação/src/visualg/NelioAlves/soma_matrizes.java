algoritmo "soma_matrizes"


var
      A: vetor[0..9, 0..9] de Inteiro
      B: vetor[0..9, 0..9] de Inteiro
      C: vetor[0..9, 0..9] de Inteiro
      V, H, i, j: Inteiro

inicio

      escreva("Quantas linhas vai ter cada matriz? ")
      leia(V)
      escreva("Quantas colunas vai ter cada matriz? ")
      leia(H)

      escreval
      escreval("Digite os valores da matriz A:")
      para i de 0 ate V-1 faca
          para  j de 0 ate H-1 faca
             escreva ("Informe o numero da posição [", i, ",", j, " ]: ")
                leia(A[i,j])
          fimpara
      fimPara
      escreval

      escreval("Digite os valores da matriz B:")
      para i de 0 ate V-1 faca
          para  j de 0 ate H-1 faca
             escreva ("Informe o numero da posição [", i, ",", j, " ]: ")
                leia(B[i,j])
          fimpara
      fimPara

      escreval
      escreval("MATRIZ A:")
      para i de 0 ate V-1 faca
           para  j de 0 ate H-1 faca
                 escreva(A[i,j])
           fimPara
           escreval
      fimpara
      escreval
      
      escreval
      escreval("MATRIZ B:")
      para i de 0 ate V-1 faca
           para  j de 0 ate H-1 faca
                 escreva(B[i,j])
           fimPara
           escreval
      fimpara
      escreval

      escreval("MATRIZ SOMA:")
      para i de 0 ate V-1 faca
           para  j de 0 ate H-1 faca
                 C[i,j] <- A[i,j] + B[i,j]
           fimPara
           escreval
      fimpara
      
      para i de 0 ate V-1 faca
           para  j de 0 ate H-1 faca
                 escreva(C[i,j])
           fimPara
           escreval
      fimpara

fimalgoritmo
