algoritmo "MATRIZES_DISSECANDO"
var
   M: Vetor[1..4, 1..4] de Inteiro
   V, H, C: Inteiro
Procedimento MostrarMatriz ()
inicio
      Escreval ("=======================")
      Escreval ("|     M A T R I Z     |")
      Escreval ("=======================")
      Para V <- 1 ate 4 Faça
           Para H <- 1 ate 4 Faça
                Escreva (M[V,H]:4)
           FimPara
           Escreval (" ")
      FimPara
FimProcedimento
Procedimento DiagonalPrincipal()
var
   t: inteiro
inicio
   Escreval ("=====================")
   Escreval ("  DIAGONAL PRNCIPAL  ")
   Escreval ("=====================")
   Para V <- 1 ate 4 faca
      EscrevaL (M[V,V]:4)
      Para t <- 1 ate V faca
         Escreva("    ")
      FimPara
   FimPara
   Escreval ("    ")
FimProcedimento
Procedimento TrianguloSuperior ()
var
   t: inteiro
inicio
   Escreval ("=====================")
   Escreval (" TRIANGULO  SUPERIOR ")
   Escreval ("=====================")
   Para V <- 1 ate 3 faca
      Escreva("    ")
      Para H <- V+1 ate 4 faca
         Escreva(M[V,H]:4)
      FimPara
      EscrevaL(" ")
      Para t <- 1 ate V faca
         Escreva("    ")
      FimPara
   FimPara
   EscrevaL()
FimProcedimento

Procedimento TrianguloInferior ()
Inicio
      Escreval ("=====================")
      Escreval (" TRIANGULO  INFERIOR ")
      Escreval ("=====================")
      Para V <- 2 ate 4 faca
          EscrevaL(" ")
          Para H <- 1 ate V-1 faca
              Escreva(M[V,H]:4)
          FimPara
      FimPara
      EscrevaL(" ")
FimProcedimento
inicio
      Para V <- 1 ate 4 Faça
          Para H <- 1 ate 4 Faça
              Escreva ("Informe o numero da posição [", V, ",", H, " ]: ")
              Leia (M[V,H])
          FimPara
      FimPara
      LimpaTela
      Repita
            Escreval ("======================")
            Escreval ("|   MENU DE OPÇÕES   |")
            Escreval ("======================")
            Escreval ("[1] Mostrar a Matriz")
            Escreval ("[2] Diagonal Principal")
            Escreval ("[3] Triangulo Superior")
            Escreval ("[4] Triangulo Inferior")
            Escreval ("[5] SAIR")
            Repita
                  Escreval ("===== OPÇÃO: ")
                  Leia (C)
            Ate (C >= 1) e (C <= 5)
            LimpaTela
            Escolha C
                    Caso 1
                         MostrarMatriz ()
                    Caso 2
                         DiagonalPrincipal ()
                    Caso 3
                         TrianguloSuperior ()
                    Caso 4
                         TrianguloInferior ()
                    Caso 5
                         Escreval ("SAINDO...")
                    OutroCaso
                         Escreval ("INVALIDO...")
            FimEscolha
      Ate (C = 5)
fimalgoritmo