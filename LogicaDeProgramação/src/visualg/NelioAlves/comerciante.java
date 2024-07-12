Algoritmo "comerciante"


Var

       N, i, LucroAbaixo, LucroEntre, LucroAcima: inteiro
       lucro, porcenLucro,totalC, totalV, lucroT: real
       PrecoCompra: vetor [0..99] de real
       PrecoVenda: vetor [0..99] de real
       nome: vetor [0..99] de caractere

Inicio
       escreval("Serao digitados dados de quantos produtos?")
       leia (N)

       para i de 0 ate N-1 faca
            escreval("Produto ",i + 1,"ª:")
            escreva("Nome: ")
            leia(nome[i])
            escreva("Preco de compra: ")
            leia(PrecoCompra[i])
            escreva("Preco de venda: ")
            leia(PrecoVenda[i])
       fimpara

       LucroAcima <- 0
       LucroEntre <- 0
       LucroAbaixo <- 0
       para i de 0 ate N-1 faca
            lucro <- PrecoVenda[i] - PrecoCompra[i]
            porcenLucro <- lucro * 100 / PrecoCompra[i]

            se porcenLucro < 10 então
               LucroAbaixo <- LucroAbaixo + 1
            senao
               se porcenLucro < 20  então
                  LucroEntre <- LucroEntre + 1
               senao
                    LucroAcima <- LucroAcima + 1
               fimse
            fimse
       fimpara

       totalV <-0
       totalC <-0
       para i de 0 ate N-1 faca
            totalC <- totalC + PrecoCompra[i]
            totalV <- totalV + PrecoVenda[i]
       fimpara

       lucroT <-0
       lucroT <- totalV - totalC
       
       escreval("RELATORIO:")
       escreval("Lucro abaixo de 10%:", LucroAbaixo:4:2)
       escreval("Lucro entre 10% e 20%:", LucroEntre:4:2)
       escreval("Lucro acima de 20%:", LucroAcima:4:2)
       escreval("Valor total de compra:", totalC:4:2)
       escreval("Valor total de venda:", totalV:4:2)
       escreval("Lucro total:", lucroT:4:2)
       


Fimalgoritmo