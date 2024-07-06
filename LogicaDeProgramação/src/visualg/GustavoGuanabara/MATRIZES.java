algoritmo "MATRIZES"
var
   M: vetor[1..3, 1..3] de Inteiro
   V, H, TP, TI: Inteiro
inicio
      Para V <- 1 ate 3 Faça
          Para  H <- 1 ate 3 Faça
                Escreva ("Informe o numero da posição [", V, ",", H, " ]: ")
                Leia(M[V,H])
          FimPara
      FimPara
      Escreval (" ")
      Escreval ("===============")
      Escreval ("| M A T R I Z |")
      Escreval ("===============")
      Escreval (" ")
      Para V <- 1 ate 3 Faça
          Para H <- 1 ate 3 Faça
            Escreva (M [V,H]:4)
            Se (M[V,H] % 2 = 0) Entao
               TP <- TP + 1
            Senao
               TI <- TI + 1
            FimSe
          FimPara
          Escreval (" ")
      FimPara
      Escreval (" ")
      Escreval ("TOTAL DE NUMEROS PARES: ", TP)
      Escreval (" ")
      Escreval ("TOTAL DE NUMEROS IMPARES: ", TI)
      Escreval (" ")
fimalgoritmo