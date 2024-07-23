algoritmo "negativos_matriz"


var
      mat: vetor[0..9, 0..9] de real
      V, H, i, j: inteiro

inicio

      escreva("Quantas linhas vai ter cada matriz? ")
      leia(V)
      escreva("Quantas colunas vai ter cada matriz? ")
      leia(H)

      para i de 0 ate V-1 faca
           para j de 0 ate H-1 faca
                escreva("Elemento [", i, ",", j, "]: ")
                   leia(mat[i, j])
           fimpara
           escreval
      fimpara

      escreval
      para i de 0 ate V-1 faca
           para j de 0 ate H-1 faca
                escreva(mat[i,j])
           fimpara
           escreval
      fimpara
      escreval

      escreval("VALORES NEGATIVOS:")
      para i de 0 ate V-1 faca
           para j de 0 ate H-1 faca
                se mat[i,j] < 0 entao
                   escreval(mat[i,j])
                fimse
           fimpara
           escreval
      fimpara



fimalgoritmo
