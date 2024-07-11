Algoritmo "aprovados"


Var

      N, i: inteiro
      media: real
      Pnota: vetor [0..9] de real
      Snota: vetor [0..9] de real
      nome: vetor [0..9] de caractere

Inicio
       escreval("Quantos alunos serao digitados?")
       leia (N)

       para i de 0 ate N-1 faca
            escreval("Digite nome, primeira e segunda nota do",i + 1,"ª aluno:")
            leia(nome[i])
            leia(Pnota[i])
            leia(Snota[i])
       fimpara

       escreval("Alunos aprovados:")
       para i de 0 ate N-1 faca
            media <- (Pnota[i] + Snota[i]) /2
            se media>= 6.0 então
               escreval(nome[i])
            fimse
       fimpara

Fimalgoritmo