Algoritmo "tabuada_Repita"


Var

      N, I, produto: inteiro

Inicio
       escreval("Qual tabuada você quer ver? ")
       leia (N)
       I <- 0
       repita
            produto <- N * I
            escreval(N," X ",I, " = ",produto)
            I <- I + 1
       ate I = 11
Fimalgoritmo