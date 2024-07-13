Algoritmo "MATRIZ"


Var

       V, H, i, j: inteiro
       matrix: vetor [0..9, 0..9] de inteiro

Inicio
       escreva("Quantas linhas vai ter a matriz? ")
       leia(V)
       escreva("Quantas colunas vai ter a matriz? ")
       leia(H)

       para i de 0 ate V-1 faca
             para j de 0 ate H-1 faca
               escreva("Elemento [", i, ",", j, "]: ")
               leia(matrix[i, j])
             fimpara
             escreval
       fimpara

       escreval
       escreval("MATRIZ DIGITADA:")

       para i de 0 ate V-1 faca
            para j de 0 ate H-1 faca
                 escreva(matrix[i, j])
            fimpara
            escreval
       fimpara

Fimalgoritmo