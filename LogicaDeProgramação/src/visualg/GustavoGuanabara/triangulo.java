algoritmo "triangulo"
var
   L1, L2, L3: Real
   EQ, Es, TRI: Logico
inicio
      Escreva ("Digite o primeiro lado, ")
      Leia (L1)
      Escreva ("Digite segundo lado, ")
      Leia (L2)
      Escreva ("Digite o terceiro lado, ")
      Leia (L3)
      TRI <- (L1 < L2 + L3) e (L2 < L1 + L3) e (L3 < L1 + L2)
      EQ <- (L1 = L2) e (L2 = L3)
      ES <- (L1 <> L2) e (L2 <> L3) e (L1 <> L3)
      Escreval ("Pode formar um TRIANGULO? ", TRI)
      Escreval ("O Triangulo é EQUILATERO? ", EQ)
      Escreval ("O Triangulo é ESCALENO? ", ES)
      Escreval ("--------------------------------------")
      Escreval ("Se o resultado for VERDADEIRO para TRIANGULO. E FALSO para EQUILATERO e ESCALENO. Então ele é um triangulo, ISÓSCELES.")
fimalgoritmo