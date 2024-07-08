algoritmo "MATRIZES_EXEMPLOS"
var
   M: vetor[1..4, 1..4] de Inteiro
   V, H, S, S2L, MAIOR: Inteiro
inicio
      S <- 0
      S2L <- 1
      Para V <- 1 ate 4 Faça
          Para  H <- 1 ate 4 Faça
                Escreva ("Informe o numero da posição [", V, ",", H, " ]: ")
                Leia(M[V,H])
          FimPara
      FimPara
      Escreval (" ")
      Escreval ("=================")
      Escreval ("|  M A T R I Z  |")
      Escreval ("=================")
      Escreval (" ")
      Para V <- 1 ate 4 Faça
          Para H <- 1 ate 4 Faça
            Escreva (M [V,H]:4)
            Se (V = H) Entao
               S <- S + M[V,H]
            FimSe
          FimPara
          Escreval (" ")
      FimPara
      Para H <- 1 ate 4 Faça
          S2L <- S2l * M[2,H]
      FimPara
      Para V <- 1 ate 4 Faça
          Se (M[V,3] > MAIOR) entao
            MAIOR <- M[V,3]
          FimSe
      FimPara
      Escreval (" ")
      Escreval ("O MAIOR VALOR DA TERCEIRA COLUNA É: ", MAIOR)
      Escreval ("A SOMA DA DIAGONAL PRINCIPAL É: ", S)
      Escreval ("A MULTIPLICAÇÃO DOS VALORES DA SEGUNDA LINHA É: ", s2L)
fimalgoritmo