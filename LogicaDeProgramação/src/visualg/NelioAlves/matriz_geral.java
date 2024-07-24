algoritmo "matriz_geral"


var
      mat: vetor[0..9, 0..9] de real
      N, i, j, linha: inteiro
      somapares: real
inicio

      escreva("Qual a ordem da matriz? ")
      leia(N)

      para i de 0 ate N-1 faca
           para j de 0 ate N-1 faca
                escreva("Elemento [", i, ",", j, "]: ")
                   leia(mat[i, j])
           fimpara
      fimpara

      somapares <- 0
      para i de 0 ate N-1 faca
           para j de 0 ate N-1 faca
                se mat[i,j] > 0 entao
                   somapares <- somapares + mat[i,j]
                fimse
           fimpara
           escreval
      fimpara

      escreval("SOMA DOS POSITIVOS:", somapares)

      escreva("Escolha uma linha: ")
      leia(linha)
      escreval("LINHA ESCOLHIDA: ")
      para j de 0 ate N-1 faca
           escreva(mat[linha,j])
      fimpara

      escreva("Escolha uma coluna: ")
      leia(linha)
      escreval("COLUNA ESCOLHIDA: ")
      para i de 0 ate N-1 faca
           escreva(mat[i,linha])
      fimpara
      
      escreval("DIAGONAL PRINCIPAL: ")
      para i de 0 ate N-1 faca
           escreva(mat[i,i]:3:1)
      fimpara
      escreval
      
      escreval("MATRIZ ALTERADA: ")
      para i de 0 ate N-1 faca
           para j de 0 ate N-1 faca
                se mat[i,j] < 0 entao
                   mat[i,j] <- mat[i,j] * mat[i,j]
                fimse
                escreva(mat[i,j]:3:1)
           fimpara
           escreval
      fimpara

fimalgoritmo