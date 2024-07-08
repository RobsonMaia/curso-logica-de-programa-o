algoritmo "IMPAR_PAR_PROCEDIMRNTO"
var
   N: Inteiro
Procedimento ParOuImpar (V: Inteiro)
inicio
      Escreval ("O valor de V é", V)
      Escreval ("O valor de N é", N)
      Se (V % 2 = 0) Entao
          Escreval ("O numero", V, " é PAR")
      Senao
          Escreval ("O numero", V, " é IMPAR")
      FimSe
FimProcedimento
inicio
      Escreva ("Informe um numero: ")
      Leia (N)
      ParOuImpar (N)
fimalgoritmo