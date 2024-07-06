algoritmo "Fibonacci_Procedimento"
var
   n1, n2, n3, C, S: Inteiro
Procedimento ProximoFibonacci (var A, B: Inteiro)
var
   C: Inteiro
inicio
   C := A + B
   Escreva (C,",")
   A := B
   B := C
FimProcedimento
inicio
      Escreva ("Quntos termos da série de FIBONACCI você quer ver? ")
      Leia (S)
      n1 <- 0
      Escreva (n1,",")
      n2 <- 1
      Escreva (n2,",")
      Para C := 3 ate S Faça
           ProximoFibonacci (n1, n2)
      FimPara
fimalgoritmo