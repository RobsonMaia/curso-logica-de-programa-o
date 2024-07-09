Algoritmo "somaVetores"


Var

      N, i: inteiro
      vetA : vetor [0..99] de inteiro
      vetB : vetor [0..99] de inteiro
      vetC : vetor [0..99] de inteiro

Inicio
       escreval("Quantos valores vai ter cada vetor?")
       leia (N)

      para i de 0 ate N-1 faca
           escreval("Digite os valores do vetor A" )
           leia (vetA[i])
      fimpara

      para i de 0 ate N-1 faca
           escreval("Digite os valores do vetor B" )
           leia (vetB[i])
      fimpara
      
     
      escreval ("VETOR RESULTANTE:")
      para i de 0 ate N-1 faca
           vetC[i] <- vetA[i] + vetB[i]
           escreval (vetC[i])
      fimpara

Fimalgoritmo