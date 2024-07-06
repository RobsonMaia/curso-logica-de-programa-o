package visualg.vetores;
Algoritmo "Problema alturas"


Var

      N, i, cont : inteiro
      soma, media, porcentagem: real
      nomes : vetor [0..9] de caractere
      idades : vetor [0..9] de inteiro
      alturas : vetor [0..9] de real

Inicio
       escreval("Quantas pessoas serao digitadas?")
       leia (N)

       para i de 0 ate N-1 faca
            escreval("Dados da", i + 1,"ª pessoa:" )
            esceval("NOME: ")
            leia (nomes[i])
            escreval("IDADE: ")
            leia(idades[i])
            escreval("ALTURA: ")
            leia(alturas[i])
       fimpara
       
       soma <- 0
       para i de 0 ate N-1 faca
            soma <- soma + altura[i]
       fimpara
       
       media <- soma / N
       escreval
       escreval("Altura média: ", media)

       cont <- 0
       para i de 0 ate N-1 faca
            se idades[i] < 16 entao
               cont <- cont + 1
            fimse
      fimpara

      porcentagem <- cont * 100 / N
      escreval("Pessoas com menos de 16 anos: ", porcentagem, "%")

      para i de 0 ate N-1 faca
           se idades[i] < 16 entao
              escreval(nomes[i])
           fimse
      fimpara

Fimalgoritmo