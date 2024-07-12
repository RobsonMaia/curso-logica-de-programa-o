Algoritmo "dados_pessoas"


Var

      N, i, contH, contM: inteiro
      media, soma, MenorAltura, MaiorAltura: real
      altura: vetor [0..99] de real
      genero: vetor [0..99] de caractere

Inicio
       escreval("Quantas pessoas serao digitadas?")
       leia (N)

       para i de 0 ate N-1 faca
            escreval("Altura da ",i + 1,"ª pessoa:")
            leia(altura[i])
            escreval("Genero da ",i + 1,"ª pessoa:")
            leia(genero[i])
       fimpara

       MenorAltura <- altura[0]
       MaiorAltura <- altura[0]

       para i de 0 ate N-1 faca
            se altura[i] > MaiorAltura então
               MaiorAltura <- altura[i]
            fimse
            se altura[i] < MenorAltura entao
               MenorAltura <- altura[i]
            fimse
       fimpara

       escreval("Menor altura = ",MenorAltura:4:2)
       escreval("Maior altura = ",MaiorAltura:4:2)


       soma <- 0
       contM <- 0

       para i de 0 ate N-1 faca
            se genero[i] = "F" entao
               soma <- soma + altura[i]
               contM <- contM + 1
            fimse
       fimpara

       media <- soma / contM
       escreval("Media das alturas das mulheres = ", media:4:2)

       contH <- N - contM
       escreval("Numero de homens = ", contH)
    
Fimalgoritmo