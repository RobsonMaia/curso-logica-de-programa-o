algoritmo "GABARITO"
var
   gab: vetor[1..5] de Caractere
   prova: Vetor [1..5] de Caractere
   nome: Vetor [1..3] de Caractere
   nota: Vetor[1..3] de Real
   a: Inteiro
   s,m: Real
Procedimento Gabarito ()
var
   c: Inteiro
inicio
      Escreval ("------------------------")
      Escreval ("  CADASTRO DO GABARITO  ")
      Escreval ("------------------------")
      Para c <- 1 ate 5 Faça
          Escreva ("Questão ", c, "º: ")
          Leia (gab[c])
      FimPara
FimProcedimento
Funcao CProva () :Real
var
   c: Inteiro
   nota: Real
inicio
      nota <- 0
      Escreval ("RESPOSTAS DADAS")
      Para c <- 1 ate 5 Faça
         Escreva ("Questão ", c, ": ")
         Leia  (prova[c])
         Se (Maiusc(prova[c]) = Maiusc(gab[c])) entao
           nota <- nota + 2
         FimSe
      FimPara
      Retorne nota
FimFuncao
inicio
      Gabarito ()
      Para a <- 1 ate 3 Faça
          LimpaTela
          Escreval ("------------------------")
          Escreval ("ALUNO ", a, "º")
          Escreval ("------------------------")
          Escreva ("NOME: ")
          Leia (nome[a])
          nota[a] <- CProva ()
          s <- s + nota[a]
      FimPara
      LimpaTela
      Escreval ("------------------------")
      Escreval ("      NOTAS FINAIS      ")
      Escreval ("------------------------")
      Para a <- 1 ate 3 Faça
          EscrevaL(nome[a]:10, nota[a]:4:1)
      FimPara
      m <- s / 3
      EscrevaL("-----------------------------")
      EscrevaL("Media da Turma: ", M:4:1)
fimalgoritmo