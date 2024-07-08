algoritmo "NUMERO_PRIMO"
var
   C, N, contDiv: Inteiro
inicio
      C <- 1
      Escreva ("Informe um numero: ")
      Leia (N)
      Repita
            Se (N % C = 0) Entao
               contDiv <- contDiv + 1
            FimSe
            C <- C + 1
      Ate (C > N)
      Se (contDiv > 2) Entao
         Escreval ("O valor", N, " não é primo!")
      Senao
         Escreval ("O valor", N, " é primo!")
      FimSe
fimalgoritmo