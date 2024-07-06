package visualg.vetores;
Algoritmo "teste vetor negativos"


Var

      N, i: inteiro
      vet : vetor [0..9] de inteiro

Inicio
       escreval("Quantos numeros voce vai digitar?")
       leia (N)

       para i de 0 ate N-1 faca
            escreval("Digite um numero: ")
            leia (vet[i])
       fimpara

       escreval("NUMEROS NEGATIVOS:")

       para i de 0 ate N-1 faca
            se vet[i] < 0 entao
               escreval(vet[i])
            fimse
       fimpara

Fimalgoritmo
