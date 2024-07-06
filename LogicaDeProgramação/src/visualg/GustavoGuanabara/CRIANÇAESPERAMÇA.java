algoritmo "CRIANÇA ESPERAMÇA"
var
   D: Inteiro
   V: Real
inicio
      Escreval ("-------------------------------")
      Escreval ("       CRIANÇA ESPERAMÇA       ")
      Escreval ("-------------------------------")
      Escreval ("   MUITO OBRIGADO POR AJUDAR   ")
      Escreval ("-------------------------------")
      Escreval ("[1] para doar R$10 ")
      Escreval ("[2] para doar R$25 ")
      Escreval ("[3] para doar R$50 ")
      Escreval ("[4] para doar outros valores ")
      Escreval ("[5] para doar para cancelar ")
      Leia (D)
      Escolha D
           Caso 1
                V <- 10
           Caso 2
                V <- 25
           Caso 3
                V <- 50
           Caso 4
                Escreval ("Qual o valor da doação? ")
                Leia (V)
           Caso 5
                V <- 0
      FimEscolha
      Escreval ("-------------------------------")
      Escreval ("Sua doação foi de R$",V, " rais")
      Escreval ("MUITO OBRIGADO!")
      Escreval ("-------------------------------")
fimalgoritmo