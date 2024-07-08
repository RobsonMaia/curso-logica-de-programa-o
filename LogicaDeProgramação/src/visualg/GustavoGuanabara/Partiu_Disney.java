algoritmo "Partiu_Disney"
var
   D: Real
inicio
      Escreval ("---------------------")
      Escreval ("----PARTIU DISNEY----")
      Escreval ("---------------------")
      Escreval ("Quanto dinheiro eu tenho? ")
      Leia (D)
      Se (D >= 10000) Entao
         Escreval ("---------------------")
         Escreval ("Partiu Disney")
         Escreval ("---------------------")
      Senao
           Se (D >= 5000) e (D < 10000) Entao
              Escreval ("---------------------")
              Escreval ("Não vou pra Disney, más...")
              Escreval ("Ainda da pra pegar uma praia")
              Escreval ("---------------------")
           Senao
              Escreval ("---------------------")
              Escreval ("#CHATEADO")
              Escreval ("---------------------")
           FimSe
      FimSe
fimalgoritmo