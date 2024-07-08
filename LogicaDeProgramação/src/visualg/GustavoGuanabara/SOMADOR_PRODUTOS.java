algoritmo "SOMADOR_PRODUTOS"
var
   cont, N, S, maior: Real
   V: Inteiro
inicio
      Escreval ("-----------------------------------")
      Escreval ("    SOMANDO VALORES DE PRODUTOS    ")
      Escreval ("-----------------------------------")
      cont <- 1
      S <- 0
      Escreva  ("Quantos produtos serão somados? ")
      Leia (V)
      Escreval ("-----------------------------------")
      Enquanto (cont <= V) faça
          Escreva ("Informe o Valor: R$ ")
          Leia (N)
          Escreval ("-----------------------------------")
          Se (N > maior) Entao
             maior <- N
          FimSe
          cont <- cont + 1
          S <- S + N
      FimEnquanto
      Escreval ("A soma dos valores é: R$",S)
      Escreval ("O MAIOR valor apresentado foi:",maior)
      Escreval ("-----------------------------------")
fimalgoritmo