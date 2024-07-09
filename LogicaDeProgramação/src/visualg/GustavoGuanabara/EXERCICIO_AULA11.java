algoritmo "EXERCICIO_AULA11"
var
   N, S, cont, DV, NU, SP, Si: Inteiro
   M: Real
inicio
      S <- 0
      M <- 0
      DV <- 0
      NU <- 0
      SP <- 0
      Si <- 0
      Para cont <- 1 ate 5 Faça
           Escreva ("Informe o", cont, "º numero: ")
           Leia (N)
           S <- S + N
           M <- S / 5
           Se (N % 5 = 0) Entao
              DV <- DV + 1
           FimSe
           Se (N = 0) Entao
              NU <- NU + 1
           FimSe
           Se (N % 2 =0) Entao
              SP <- SP + N
           FimSe
           Se (N % 2 = 1) Entao
              Si <- Si + N
           FimSe
      FimPara
      Escreval ("==========================================")
      Escreval ("Valore Nulos:", NU)
      Escreval ("==========================================")
      Escreval ("A media entre os valores é:", M)
      Escreval ("==========================================")
      Escreval ("Valores divisiveis por cinco:", DV)
      Escreval ("==========================================")
      Escreval ("A soma de todos os valores é:", S)
      Escreval ("==========================================")
      Escreval ("A soma de todos os valores pares é:", SP)
      Escreval ("==========================================")
      Escreval ("A soma de todos os valores impares é:", Si)
      Escreval ("==========================================")
fimalgoritmo