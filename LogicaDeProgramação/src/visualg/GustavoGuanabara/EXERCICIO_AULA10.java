algoritmo "EXERCICIO_AULA10"
var
   N, C, T, Simp: Inteiro
inicio
      T <- 0
      Simp <- 0
      Para C <- 1 ate 6 Faça
          Escreva ("Informe um numero: ")
          Leia (N)
          Se (N >= 0) e (N <= 10) Entao
             T <- T + 1
          FImSe
      Se (N % 2 = 1) Entao
         Simp <- Simp + N
      FimSe
      FimPara
      Escreval ("Ao todo foram", T, " valores entre 0 e 10")
      Escreval ("A soma dos numeros impares foi", Simp)
fimalgoritmo