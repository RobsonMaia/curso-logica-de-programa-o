Algoritmo "media_pares"


Var

      N, i, cont: inteiro
      vet: vetor [0..99] de real
      media, soma: real

Inicio
       escreval("Quantos elementos vai ter o vetor?")
       leia (N)

       soma <- 0
       media <- 0
       cont <- 0
       para i de 0 ate N-1 faca
            escreva("Digite um numero: ")
            leia(vet[i])
       fimpara

       para i de 0 ate N-1 faca
            se vet[i] % 2 = 0 entao
                    cont <- cont + 1
                    soma <- soma + vet[i]
            fimse
       fimpara
       se cont = 0 entao
            escreval ("NENHUM NUMERO PAR")
       senao
            media <- soma / cont
            escreval ("MEDIA DOS PARES = ", media:3:1)
       fimse

Fimalgoritmo