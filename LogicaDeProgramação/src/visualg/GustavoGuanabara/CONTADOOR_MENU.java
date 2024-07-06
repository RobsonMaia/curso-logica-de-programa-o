algoritmo "CONTADOOR_MENU"
var
   QM, cont: Inteiro
inicio
  Repita
      Escreval ("=================")
      Escreval ("|    M E N U    |")
      Escreval ("=================")
      Escreval ("| [1] De 1 a 10 |")
      Escreval ("| [2] De 10 a 1 |")
      Escreval ("| [3] Sair      |")
      Escreval ("=================")
      Leia (QM)
      Escreval ("=================")
      Escolha QM
              Caso 1
                cont <- 1
                Repita
                    Escreval (cont)
                    cont <- cont + 1
                Ate (cont > 10)
                Escreval ("=================")
                Escreval ("FIM DA CONTAGEM")
                Escreval ("=================")
              Caso 2
                cont <- 10
                Repita
                    Escreval (cont)
                    cont <- cont - 1
                Ate (cont < 1)
                Escreval ("=================")
                Escreval ("FIM DA CONTAGEM")
                Escreval ("=================")
              Caso 3
                Escreval ("SAINDO...")
                Escreval ("=================")
              OutroCaso
                Escreval ("INVALIDO!!!")
                Escreval ("=================")
      FimEscolha
  Ate (QM = 3)
fimalgoritmo