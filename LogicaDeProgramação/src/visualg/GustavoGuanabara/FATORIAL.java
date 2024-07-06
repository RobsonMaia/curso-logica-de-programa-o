algoritmo "FATORIAL"
var
   R: Caractere
   C, N, F: Inteiro
inicio
      Repita
            Escreva("Informe um numero: ")
            Leia (N)
            C <- N
            F <- 1
            Repita
                  F <- F * C
                  C <- C - 1
            Ate (C < 1)
            Escreval ("O valor do fatorial de ", N, " é igual a: ", F)
            Escreval ("Quer continuar [S/N] ")
            Leia (R)
            LimpaTela
      Ate (R = "N")
fimalgoritmo