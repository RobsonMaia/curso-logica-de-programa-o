algoritmo "FATORIAL_FUNCAO"
var
   N, F: Inteiro
Funcao Fatorial (V: Inteiro) :Inteiro
var
   C, R: Inteiro
inicio
      R <- 1
      Para C <- 1 ate V Faça
           R <- R * C
      FimPara
      Retorne R
FimFuncao
inicio
      Escreva ("Informe um numero: ")
      Leia (N)
      F <- Fatorial (N)
      Escreval ("O valor de ", N, "! é igual a ", F)
fimalgoritmo