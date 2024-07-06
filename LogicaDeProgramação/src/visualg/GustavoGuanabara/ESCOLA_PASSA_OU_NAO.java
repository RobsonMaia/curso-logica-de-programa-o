algoritmo "ESCOLA_PASSA_OU_NAO"
var
   nota1, nota2, M: Real
inicio
      Escreval ("------------------------")
      Escreval ("ESCOLA OLGA CHAKUR FARAH")
      Escreval ("------------------------")
      Escreva ("Primeira NOTA: ")
      Leia (nota1)
      Escreva ("Segunda NOTA: ")
      Leia (nota2)
      M <- (nota1 + nota2) / 2
      Escreval ("---------STATUS---------")
      Se (M >= 7) Entao
         Escreval ("MÉDIA: ", M)
         Escreval ("ALUNO APROVADO")
         Escreval ("------------------------")
      Senao
           Se (M >= 5) e (M < 7) Entao
              Escreval ("MÉDIA: ", M)
              Escreval ("ALUNO EM RECUPERAÇÃO")
              Escreval ("---------------------")
           Senao (M < 7) Entao
                 Escreval ("MÉDIA: ", M)
                 Escreval ("ALUNO REPROVADO")
                 Escreval ("------------------------")
           FimSe
      FimSe
fimalgoritmo