algoritmo "CONTADOR_INTELIGENTE"
var
   cont, C1, C2, S: Inteiro
inicio
      Escreval ("----------------------------")
      Escreval ("    CONTADOR INTELIGENTE    ")
      Escreval ("----------------------------")
      Escreval ("                            ")
      Escreva ("Conte de: ")
      Leia (C1)
      Escreva ("Até: ")
      Leia (C2)
      Escreva ("Na sequencia de?: ")
      Leia (S)
      Escreval ("Vou contar de ", S, " em", S)
      cont <- C1
      Se (C1 < C2) Entao
        Enquanto (cont <= C2) Faça
              Escreval (cont)
              cont <- cont + S
        FimEnquanto
      Senao
           Enquanto (cont >= C2) Faça
                       Escreval (cont)
                       cont <- cont - S
           FimEnquanto
      FimSe
      Escreval ("----------------------------")
      Escreval ("Terminei de contar!")
      Escreval ("----------------------------")
fimalgoritmo