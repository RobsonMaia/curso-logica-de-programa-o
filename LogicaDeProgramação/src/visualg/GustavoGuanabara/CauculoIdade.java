algoritmo "CauculoIdade"
var
   AnoA, AnoN, Idade: Inteiro
inicio
      Escreva ("Em que ano estamo? ")
      Leia (AnoA)
      Escreva ("Em que ano eu nasci? ")
      Leia (AnoN)
      Idade <- AnoA - AnoN
      Escreval ("Então minha idade é,", Idade, " anos")
      Se (Idade >= 21) Entao
         Escreva ("E eu ja atingi a maior idade")
      Senao (Idade < 21) Entao
            Escreva ("E eu ainda não atingi a maior idade")
      FimSe
fimalgoritmo