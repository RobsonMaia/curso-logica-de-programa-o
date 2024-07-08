algoritmo "MATRIZES_IDENTIDADE"
var
   M: vetor[1..3, 1..3] de Inteiro
   V, H: Inteiro
inicio
      Escreval (" ")
      Escreval ("===============")
      Escreval ("| M A T R I Z |")
      Escreval ("===============")
      Escreval (" ")
      Para V <- 1 ate 3 Faça
          Para H <- 1 ate 3 Faça
              Se (V = H)  Entao
                 M[V,H] <- 1
              Senao
                 M[V,H] <- 0
              FimSe
              Escreva (M [V,H]:4)
          FimPara
          Escreval (" ")
      FimPara
fimalgoritmo