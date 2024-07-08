algoritmo "NOMES_COM_C"
var
   nome: Caractere
   soC: vetor[1..10] de Caractere
   c, t: Inteiro
inicio
      Para c := 1 ate 10 Faça
           Escreva ("Informe seu nome: ")
           Leia (nome)
           Se (Copia(MaiusC(nome), 1, 1) = "C") Entao
             t <- t + 1
             soC[t] <- nome
           FimSe
      FimPara
      LimpaTela
      Escreval ("========================")
      Escreval ("     LISTAGEM FINAL     ")
      Escreval ("========================")
      Escreval ("NOMES QUE COMEÇAM COM C:")
      Escreval ("========================")
      Para c := 1 ate t Faça
          Escreval (soC[c])
      FimPara
fimalgoritmo