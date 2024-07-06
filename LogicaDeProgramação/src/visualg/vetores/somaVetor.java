package visualg.vetores;
Algoritmo "teste vetor soma vetor"


Var

      N, i : inteiro
      soma, media: real
      vet : vetor [0..9] de real

Inicio
       escreval("Quantos numeros voce vai digitar?")
       leia (N)

       para i de 0 ate N-1 faca
            escreval("Digite um numero: ")
            leia (vet[i])
       fimpara

       escreva("VALORES: ")
       para i de 0 ate N-1 faca
            escreva(vet[i]:3:1, " ")
       fimpara

       escreval
       soma <- 0
       para i de 0 ate N-1 faca
            soma <- soma + vet[i]
       fimpara
       escreval ("SOMA: ", soma)
       
       media <- soma / N
       
       escreval("MEDIA: ", media)
       
Fimalgoritmo
