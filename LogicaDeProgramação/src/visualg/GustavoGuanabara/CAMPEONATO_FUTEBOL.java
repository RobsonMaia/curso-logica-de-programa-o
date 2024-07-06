algoritmo "CAMPEONATO_FUTEBOL"
var
   nome: Vetor[1..3] de Caractere
   i, c: Inteiro
inicio
      Escreval ("=========================")
      Escreval ("| CAMPEONATO DE FUTEBOL |")
      Escreval ("=========================")
      Para c <- 1 ate 3 Faça
          Escreva ("Nome do", c, "º time: ")
          Leia (nome[c])
      FimPara
      LimpaTela
      Escreval ("=========================")
      Escreval ("|  TABELA DE PARTIDAS   |")
      Escreval ("=========================")
      Para i <- 1 ate 3 Faça
           Para c <- 1 ate 3 Faça
               Se (i <> c) Entao
                 Escreval (nome[i]:11, " [] X []  ", nome[c]:11)
               FimSe
           FimPara
      FimPara
fimalgoritmo