algoritmo "Calculo_IMC"
var
   M, A, IMC: Real
inicio
      Escreval ("----------------------------")
      Escreval ("----- CALCULANDO O IMC -----")
      Escreval ("----------------------------")
      Escreva ("Informe sua MASSA (kg): ")
      Leia (M)
      Escreva ("Informe sua ALTURA (m): ")
      Leia (A)
      Escreval ("----------------------------")
      IMC <- M / (A ^ 2)
      Escreval ("IMC: ", IMC:5:2)
      Se (IMC < 17) Entao
         Escreval ("Você está MUITO ABAIXO do peso ideal")
         Escreval ("------------------------------------")
      Senao
         Se (IMC >= 17) e (IMC < 18.5) Entao
            Escreval ("Você está ABAIXO do peso ideal")
            Escreval ("------------------------------")
         Senao
              Se (IMC >= 18.5) e (IMC < 25) Entao
                 Escreval ("Parabens você está no seu peso ideal")
                 Escreval ("------------------------------------")
              Senao
                   Se (IMC >= 25) e (IMC < 30) Entao
                      Escreval ("Você está com SOBREPESO")
                      Escreval ("------------------------")
                   Senao
                        Se (IMC >= 30) e (IMC < 35) Entao
                           Escreval ("Você está com OBESIDADE")
                           Escreval ("------------------------")
                        Senao
                             Se (IMC >= 35) e (IMC < 40) Entao
                                Escreval ("Você está com OBESIDADE SEVERA")
                                Escreval ("------------------------------")
                             Senao
                                  Se (IMC >= 40) entao
                                     Escreval ("Você está com OBESIDADE MÓRBIDA")
                                     Escreval ("-------------------------------")
                                  FimSe
                             FimSe
                        FimSe
                   FimSe
              FimSe
         FimSe
      FimSe
fimalgoritmo