algoritmo "Departamento_Transito"
var
   AnoA, AnoN, Idade: Inteiro
inicio
      Escreval ("------------------------")
      Escreval ("DEPARTAMENTO DE TRANSITO")
      Escreval ("------------------------")
      Escreva ("Ano Atual (yyyy): ")
      Leia (AnoA)
      Escreva ("Ano de Nascimento (yyyy): ")
      Leia (AnoN)
      Idade <- AnoA - AnoN
      Escreval ("---------STATUS---------")
      Se (Idade >= 18) Entao
         Escreval ("IDADE:", Idade, " anos")
         Escreval ("APTO A TIRAR CARTEIRA DE MOTORISTA")
         Escreval ("------------------------")
      Senao (Idade < 18) Entao
         Escreval ("IDADE:", Idade, " anos")
         Escreval ("INAPTO A TIRAR CARTEIRA DE MOTORISTA")
         Escreval ("------------------------")
      FimSe
fimalgoritmo