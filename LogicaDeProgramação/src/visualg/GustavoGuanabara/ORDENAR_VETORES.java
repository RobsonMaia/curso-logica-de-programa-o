algoritmo "ORDENAR_VETORES"
var
   vet: Vetor[1..4] de Inteiro
   i, j, aux: Inteiro
inicio
      Para i := 1 ate 4 Faça
           Escreva ("Informe um valor: ")
           Leia (vet[i])
      FimPara
      Para i <- 1 ate 3 Faça
           Para j <- i + 1 ate 4 Faça
               Se (vet[i] > vet[j]) Entao
                 aux <- vet[i]
                 vet[i] <- vet[j]
                 vet[j] <- aux
               FimSe
           FimPara
      FimPara
      Para i := 1 ate 4 Faça
           Escreval ("{", vet[i], " }")
      FimPara
fimalgoritmo