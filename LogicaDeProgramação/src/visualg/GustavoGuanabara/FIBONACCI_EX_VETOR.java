algoritmo "FIBONACCI_EX_VETOR"
var
   N: vetor[1..4] de Inteiro
   S: Inteiro
inicio
     Escreva ("Quntos termos da série de FIBONACCI você quer ver? ")
     Leia (S)
     N[1] <- 0
     Escreva (N[1])
     N[2] <- 1
     Escreva (N[2])
     Para N[4] := 3 ate S Faça
          N[3] <- N[1] + N[2]
          Escreva (N[3])
          N[1] <- N[2]
          N[2] <- N[3]
     FimPara
fimalgoritmo