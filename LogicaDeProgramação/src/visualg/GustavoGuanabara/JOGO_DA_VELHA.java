algoritmo "JOGO_DA_VELHA"
var
   M: Vetor [1..3, 1..3] de Caractere
   V, H, cont, Po: Inteiro
   Simb: Caractere
   R: Logico
Procedimento Velha ()
inicio
      Escreval ("+---+---+---+")
      Para V <- 1 ate 3 Faça
          Para H <- 1 ate 3 Faça
              Escreva ("|  ", M[V,H]:1)
          FimPara
          Escreva ("|")
          Escreval (" ")
          Escreval ("+---+---+---+")
      FimPara
FimProcedimento
Procedimento MudarJogador ()
inicio
     Se (Simb = "X") Então
        Simb <- "O"
     Senao
        Simb <- "X"
     FimSe
FimProcedimento
Função Jogar (S: Caractere; P: Inteiro) :Logico
var
   mudou: Logico
inicio
      mudou <- Falso
      Para V <- 1 ate 3 Faça
          Para H <- 1 ate 3 Faça
           Se (M[V,H] = NumpCarac(p)) Entao
              M[V,H] <- S
              mudou <- Verdadeiro
           FimSe
          FimPara
      FimPara
      Retorne mudou
FimFunção
Função FimVelha () :Logico
var
   Fim: Logico
   ocorr: Inteiro
inicio
      Fim <- Falso
      // Jogos em linha
      Para V <- 1 ate 3 faca
          Se (M[V,1] = M[V,2]) e (M[V,2] = M[V,3])Entao
            Fim <- Verdadeiro
          FimSe
      FimPara
      // Jogos em coluna
      Para H <- 1 ate 3 Faça
          Se (M[1,H] = M[2,H]) e (M[2,H] = M[3,H]) Entao
            Fim <- Verdadeiro
          FimSe
      Fimpara
      // Jogos em diagonal
      Se (M[1,1] = M[2,2]) e (M[2,2] = M[3,3]) Entao
         Fim <- Verdadeiro
      FimSe
      Se (M[1,3] = M[2,2]) e (M[2,2] = M[3,1]) Entao
         Fim <- Verdadeiro
      FimSe
      // Jogos em VELHA
      ocorr <- 0
      Para V <- 1 ate 3 Faça
          Para H <- 1 ate 3 Faça
              Se (M[V,H] <> "X") e (M[V,H] <> "O") Entao
                 ocorr <- ocorr + 1
              FimSe
          FimPara
      FimPara
      Se (ocorr = 0) Entao
          Fim <- Verdadeiro
      FimSe
      Retorne Fim
FimFunção
inicio
      Escreval (" ")
      Escreval ("===================")
      Escreval (" # JOGO DA VELHA # ")
      Escreval ("===================")
      Escreval (" ")
      cont <- 1
      Simb <- "X"
      Para V <- 1 ate 3 Faça
          Para H <- 1 ate 3 Faça
               M[V,H] <- NumpCarac(cont)
               cont <- cont + 1
          FimPara
      FimPara
      Velha ()
      Repita
          Repita
              Escreval (" ")
              Escreval ("Vai jogar [", Simb:1, "] em qual posição? ")
              Leia (Po)
              R <- Jogar (Simb, Po))
              Se (R = Falso) Entao
                 Escreval ("JOGADA INVALIDA!!")
              FimSe
          Ate (R = Verdadeiro)
          MudarJogador ()
          LimpaTela
          Velha ()
      Ate (FimVelha () = Verdadeiro)
      Escreval ("JOGO FINALIZADO")
fimalgoritmo