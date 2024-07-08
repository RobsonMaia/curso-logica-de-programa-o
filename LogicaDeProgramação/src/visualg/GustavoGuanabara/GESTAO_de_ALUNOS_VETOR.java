
algoritmo "GESTAO_de_ALUNOS_VETOR"
var
   nome: Vetor[1..4] de Caractere
   n1: Vetor[1..4] de Real
   n2: Vetor[1..4] de Real
   m: Vetor[1..4] de Real
   i: Inteiro
   SM, Mt, ACM: Real
inicio
     Para i <- 1 ate 4 Faça
         Escreval ("ALUNO ", i)
         Escreva ("NOME: ")
         Leia (nome[i])
         Escreva ("PRIMEIRA NOTA: ")
         Leia (n1[i])
         Escreva ("SEGUNDA NOTA: ")
         Leia (n2[i])
         Escreval (" ")
         m[i] <- (n1[i] + n2[i]) / 2
         SM <- SM + m[i]
     FimPara
     MT <- SM / 4
     LimpaTela
     Escreval ("==============================")
     Escreval ("      LISTAGEM DE ALUNOS      ")
     Escreval ("==============================")
     Para i := 1 ate 4 Faça
         Escreval ("ALUNO: ", nome[i]:10, " MEDIA: ", m[i]:4:1)
         Se (m[i] > MT) Entao
           ACM <- ACM + 1
         FimSe
     FimPara
     Escreval (" ")
     Escreval ("Ao todo temos", ACM, " alunos acima da media da turma que é", MT:4:1)
fimalgoritmo