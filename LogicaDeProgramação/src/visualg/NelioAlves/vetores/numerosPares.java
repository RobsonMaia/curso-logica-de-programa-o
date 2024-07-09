package visualg.NelioAlves.vetores;
Algoritmo "numeros pares"


Var

      N, i, cont : inteiro
      nd : vetor [0..99] de inteiro

Inicio
       escreval("Quantas numeros serao digitadas?")
       leia (N)

       para i de 0 ate N-1 faca
            escreval("Digite um numero: " )
            leia (nd[i])
      fimpara
      escreval
      
      cont <- 0
      escreval ("NUMEROS PARES")
      para i de 0 ate N-1 faca
           se  nd[i] % 2 = 0 entao
               cont <- + 1
               escreva (nd[i])
           fimse
      fimpara
      escreval
      escreval("QUANTIDADE DE PARES = ", cont)

Fimalgoritmo
