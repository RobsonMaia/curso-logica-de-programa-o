algoritmo "Prova"
var
   S, n: Real
   c: Inteiro
Funcao operacao (n:Inteiro):Real
Var
   x:Real
inicio
Escreva ("numero? ")
leia (n)
   Se (n % 2 = 0) entao
      x <- n ^ 2
   Senao
      x <- n / 2
   FimSe
   Retorne x
FimFuncao
Inicio
S <- 0
   Para c <- 1 ate 3 faca
      S <- S + Operacao(c)
   FimPara
   Escreva(S)
Fimalgoritmo