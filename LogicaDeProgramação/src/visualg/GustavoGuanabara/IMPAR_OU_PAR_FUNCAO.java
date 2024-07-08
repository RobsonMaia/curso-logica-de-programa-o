algoritmo "IMPAR_OU_PAR_FUNCAO"
var
   N: Inteiro
   R: Caractere
Funcao ParOuImpar (A: Inteiro) :Caractere
inicio
      Se (A % 2 = 0) Entao
        Retorne "PAR"
      Senao
        Retorne "IMPAR"
      FimSe
FimFuncao
inicio
      Escreva ("Informe um numero: ")
      Leia (N)
      R <- ParOuImpar (N)
      Escreval ("O numero", N, " é ", R)
fimalgoritmo