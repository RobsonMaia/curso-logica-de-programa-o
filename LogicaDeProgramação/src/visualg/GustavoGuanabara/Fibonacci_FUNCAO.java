algoritmo "Fibonacci_FUNCAO"
var
   n1, n2, n3, C, S: Inteiro
Funcao ProximoFibonacci (var A, B: Inteiro) :Inteiro
var
   C: Inteiro
inicio
   C := A + B
   A := B
   B := C
   Retorne C
FimFuncao
inicio
      Escreva ("Quntos termos da série de FIBONACCI você quer ver? ")
      Leia (S)
      n1 <- 0
      Escreva (n1,",")
      n2 <- 1
      Escreva (n2,",")
      Para C := 3 ate S Faça
           n3 <- ProximoFibonacci (n1, n2)
           Escreva (n3,",")
      FimPara
fimalgoritmo