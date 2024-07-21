algoritmo "cada_linha"


var
      M: vetor[0..9, 0..9] de Inteiro
      N, i, j, maior: Inteiro

inicio

      escreval("Qual a ordem da matriz?")
      leia(N)

      para i de 0 ate N-1 faca
          para  j de 0 ate N-1 faca
                escreva ("Informe o numero da posição [", i, ",", j, " ]: ")
                leia(M[i,j])
          fimpara
      fimPara
      escreval
      
      para i de 0 ate N-1 faca
            para j de 0 ate N-1 faca
                 escreva(M[i, j])
            fimpara
            escreval
      fimpara

      escreval
      escreval("MAIOR ELEMENTO DE CADA LINHA:")
      
      para i de 0 ate N-1 faca
           maior <- M[i,0]
           para  j de 0 ate N-1 faca
              se maior < M[i,j] entao
                 maior <- M[i, j]
              fimse
           fimPara
           escreval(maior)
      fimpara

fimalgoritmo
