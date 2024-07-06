algoritmo "Equação de segundo Grau"
var
   a, b, c: inteiro
   delta: real
   x1, x2: real
inicio
      Escreval ("Equação de segundo Grau")
      Escreval ("-----------------------")
      Escreva ("informe o valor de A: ")
      Leia (a)
      Escreva ("informe o valor de B: ")
      Leia (b)
      Escreva ("informe o valor de C: ")
      Leia (c)
      Escreval ("----------------------")
      Escreval ("sua equação é: ", a, "x2 +", b, "x +", c , " = 0")
      delta :=  (b*b) - 4*a*c
      Escreval ("Valor de Delta: ", delta:4:2)
      Escreval ("-----------------------")
      Se (delta < 0) entao
         Escreval ("Para Delta negativo, não existem raizes Reais")
      Senao
           se (delta = 0) então
               x1 := (-b + raizQ (delta))/(2*a)
               Escreval ("Para Delta zero, temos duas raizes iguais a ", x1)
           Senao
                x1 := (-b + raizQ(delta))/(2*a)
                x2 := (-b + raizQ(delta))/(2*a)
                Escreval ("Para Delta positivo. Raizes diferentes: ")
                Escreval ("x' = ", x1:4:2)
                Escreval ("x'' = ", x2:4:2)
           FimSe
      FimSe
fimalgoritmo