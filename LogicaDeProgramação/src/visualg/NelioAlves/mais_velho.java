Algoritmo "mais_velho"


Var

      N, i, maiorIdade, posiMaior: inteiro
      idade: vetor [0..9] de inteiro
      nome: vetor [0..9] de caractere

Inicio
       escreval("Quantas pessoas voce vai digitar?")
       leia (N)

       para i de 0 ate N-1 faca
            escreval("Dados da ",i + 1,"ª pessoa:")
            escreva("NOME: ")
            leia(nome[i])
            escreva("IDADE: ")
            leia(idade[i])
       fimpara
       
       maiorIdade <- idade[0]
       posiMaior <- 0
       
       para i de 0 ate N-1 faca
            se idade[i] > maiorIdade entao
               maiorIdade <- idade[i]
               posiMaior <- i
            fimse
       fimpara
       escreval
       escreval("PESSOA MAIS VELHA: ", nome[posiMaior])
Fimalgoritmo