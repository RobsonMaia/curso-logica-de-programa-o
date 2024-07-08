
algoritmo "SELETOR"
var
   I, C, i18, i25: Inteiro
   S, resp: Caractere
inicio
      Escreval ("============================")
      Escreval ("|    SELETOR DE PESSOAS    |")
      Escreval ("============================")
      Repita
            Escreva ("Qual o Sexo/ [M/F] ")
            Leia (S)
            Escreva ("Qual a idade? ")
            Leia (I)
            Escreval ("Qual a cor do cabelo?")
            Escreval ("---------------------------------------------------------------")
            Escreval ("[1] Preto")
            Escreval ("[2] Catanho")
            Escreval ("[3] Loiro")
            Escreval ("[4] Ruivo")
            Leia (C)
            Escolha C
                    Caso 1
                         Escreval ("Preto")
                         Escreval ("---------------------------------------------------------------")
                    Caso 2
                         Escreval ("Castanho")
                         Escreval ("---------------------------------------------------------------")
                    Caso 3
                         Escreval ("Loiro")
                         Escreval ("---------------------------------------------------------------")
                    Caso 4
                         Escreval ("Ruivo")
                         Escreval ("---------------------------------------------------------------")
            FimEscolha
      Se (S = "M") e (I > 18) e (C = 2) Entao
         i18 <- i18 + 1
      FimSe
      Se (S = "F") e ((I >= 25) e (I <= 30)) e (C = 3) Entao
         i25 <- i25 + 1
      FimSe
      Escreval ("Quer continuar? [S/N]")
      Leia (resp)
      Escreval ("---------------------------------------------------------------")
      Ate (resp = "N")
      Escreval ("---------------------------------------------------------------")
      Escreval ("RESULTADO FINAL:")
      Escreval ("---------------------------------------------------------------")
      Escreval ("Total de homens com mais de 18 anos e cabelos castanhos é,", i18)
      Escreval ("Total de mulheres entre 25 e 30 anos e cabelos loiros é,", i25)
      Escreval ("---------------------------------------------------------------")
fimalgoritmo