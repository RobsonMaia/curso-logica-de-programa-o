Algoritmo "maior_posicao"


Var

      N, i, localMaior: inteiro
      maior: real
      vet : vetor [0..99] de real

Inicio
       escreval("Quanto numeros voce vai digitar?")
       leia (N)

      localMaior <- 0
      maior <- vet[0]
      para i de 0 ate N-1 faca
           escreva("Digite um numero: " )
           leia (vet[i])
           se vet[i] > maior entao
              maior <- vet[i]
              localMaior <- i
           fimse
      fimpara

      escreval
      escreval ("MAIOR VALOR = ", maior)
      escreval ("POSICAO DO MAIOR VALOR = ", localMaior)

Fimalgoritmo
