algoritmo "APROVEITAMENTO_ALUNO"
var
   N1, N2, M: Real
inicio
      Escreval ("---------------------------")
      Escreval ("  APROVEITAMENTO DO ALUNO  ")
      Escreval ("---------------------------")
      Escreva ("Infome Primeira Nota: ")
      Leia (N1)
      Escreva ("Infome a Segunda Nota: ")
      Leia (N2)
      M <- (N1 + N2) / 2
      Escreval ("---------------------------")
      Escreval ("MÉDIA: ", M)
      Se (M >= 9)e (M < 10) Entao
         Escreval ("APROVEITAMENTO: A")
         Escreval ("---------------------------")
      Senao
           Se (M >= 8) e (M < 9) Entao
              Escreval ("APROVEITAMENTO: B")
              Escreval ("---------------------------")
           Senao
                Se (M >= 7) e (M < 8) Entao
                   Escreval ("APROVEITAMENTO: C")
                   Escreval ("---------------------------")
                Senao
                     Se (M >= 6) e (M < 7) Entao
                        Escreval ("APROVEITAMENTO: D")
                        Escreval ("---------------------------")
                     Senao
                          Se (M >= 5) e (M < 6) Entao
                             Escreval ("APROVEITAMENTO: E")
                             Escreval ("---------------------------")
                          Senao
                               Se (M < 5) Entao
                                  Escreval ("APROVEITAMENTO: F")
                                  Escreval ("---------------------------")
                               FimSe
                          FimSe
                     FimSe
                FimSe
           FimSe
      FimSe
fimalgoritmo