algoritmo "AnalisadorStrings"
var
  N: Caractere
  C: Inteiro
inicio
   Escreva("Digite seu nome: ")
   Leia(N)
   EscrevaL("Total de letras do seu nome: ", Compr(N))
   Escreval (" ")
   EscrevaL("Seu nome em maiusculas é ", Maiusc(N))
   Escreval (" ")
   EscrevaL("Seu nome em minusculas é ", Minusc(N))
   Escreval (" ")
   EscrevaL("A primeira letra do seu nome é ", Copia(N, 1, 1))
   Escreval (" ")
   EscrevaL("A ultima letra do seu nome é ", Copia(Maiusc(N), Compr(N), 1))
   Escreval (" ")
   EscrevaL("Seu nome tem a letra S na posicao ", Pos("S", Maiusc(N)))
   Escreval (" ")
   EscrevaL("O codigo da letra S é ", Asc("S"))
   Escreval (" ")
   EscrevaL("A letra do codigo 83 é ", Carac(83))
   Escreval (" ")
   Para C <- Compr(N) ate 1 passo -1 faca
        Escreva (Copia(Maiusc(N),C,1))
        Escreva (" ")
   FimPara
fimalgoritmo