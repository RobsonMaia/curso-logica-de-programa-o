algoritmo "AULA10_ex_repita"
var
   N, S: Real
   resp: Caractere
inicio
      S <- 0
      Repita
           Escreva ("Digite o valor ==> R$")
           Leia (N)
           S <- S + N
           Escreva ("Voce quer continuar [S/N] ")
           Leia (resp)
      Ate (resp = "N")
      Escreval ("A soma dos valores digitados é: ", S:5:2)
fimalgoritmo