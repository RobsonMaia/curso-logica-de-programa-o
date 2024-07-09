algoritmo "AULA10somador"
var
   N, S: Real
   resp: Caractere
inicio
      S <- 0
      resp <- "S"
      Enquanto (resp = "S") Faca
             Escreva ("Digite o valor ==> R$")
             Leia (N)
             S <- S + N
             Escreva ("Voce quer continuar [S/N] ")
             Leia (resp)
      FimEnquanto
      Escreval ("A soma dos valores digitados é: ", S:5:2)
fimalgoritmo