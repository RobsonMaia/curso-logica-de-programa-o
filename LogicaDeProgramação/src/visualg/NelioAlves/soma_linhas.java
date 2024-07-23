algoritmo "soma_linhas"


var
      mat: vetor[0..9, 0..9] de real
      vet: vetor[0..9] de real
      V, H, i, j: inteiro

inicio

      escreva("Quantas linhas vai ter cada matriz? ")
      leia(V)
      escreva("Quantas colunas vai ter cada matriz? ")
      leia(H)

      para i de 0 ate V-1 faca
           escreval("Digite os elementos da ", i+1, "a. linha:")
           para j de 0 ate H-1 faca
                leia(mat[i, j])
           fimpara
      fimpara

      para i de 0 ate V-1 faca
           vet[i] <- 0
           para j de 0 ate H-1 faca
                vet[i] <- vet[i] + mat[i, j]
           fimpara
      fimpara

      escreval("VETOR GERADO:")
      para i de 0 ate V-1 faca
           escreval(vet[i]:3:1)
      fimpara


fimalgoritmo
