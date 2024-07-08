algoritmo "IMPAR_PAR_VETOR"
var
   N: vetor[1..7] de Inteiro
   S, TP, TI: Inteiro
inicio
     Para S <- 1 ate 7 Faça
          Escreva ("Informe o", S, "º valor: ")
          Leia (N[S])
          Se (N[S] % 2 = 0) Entao
             TP <- TP + 1
             Escreval ("O valor ", N[S], " é PAR")
             Escreval (" ")
          Senao
             TI <- TI + 1
             Escreval ("O valor ", N[S], " é IMPAR")
             Escreval (" ")
          FimSe
     FimPara
     Escreval ("TOTAL DE NUMEROS PARES: ", TP)
     Escreval ("TOTAL DE NUMEROS IMPARES: ", TI)
     Escreval (" ")
     Para S <- 1 ate 7 Faça
          Se (N[S] % 2 = 0) Entao
             Escreval ("O valore PAR está na posição ", S)
             Escreval (" ")
          Senao
             Escreval ("O valore IMPAR está na posição ", S)
             Escreval (" ")
          FimSe
     FimPara
fimalgoritmo