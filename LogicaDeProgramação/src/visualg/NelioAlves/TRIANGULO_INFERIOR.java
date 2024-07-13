algoritmo "TRIANGULO_INFERIOR"


var
      M: vetor[0..9, 0..9] de Inteiro
      N, i, j, cont: Inteiro

inicio

      escreval("Qual a ordem da matriz?")
      leia(N)

      para i de 0 ate N-1 faca
          para  j de 0 ate N-1 faca
                escreva ("Informe o numero da posição [", i, ",", j, " ]: ")
                leia(M[i,j])
          fimpara
      fimPara
      escreval

      para j de 1 ate N-1 faca
           escreva
           para  i de 0 ate j - 1 faca
                escreva(M[j,i]:4)
           fimPara
           escreval
           para cont de 0 ate i faca
                escreva
           fimPara
      fimpara

fimalgoritmo
