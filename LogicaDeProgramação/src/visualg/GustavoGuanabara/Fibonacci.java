algoritmo "Fibonacci"
var
   T, T1, T2, T3, S: Inteiro
inicio
     Escreva ("Quntos termos da série de FIBONACCI você quer ver? ")
     Leia (S)
     T1 <- 0
     Escreva (T1,",")
     T2 <- 1
     Escreva (T2,",")
     Para T := 3 ate S Faça
          T3 <- T1 + T2
          Escreva (T3,",")
          T1 <- T2
          T2 <- T3
     FimPara
fimalgoritmo