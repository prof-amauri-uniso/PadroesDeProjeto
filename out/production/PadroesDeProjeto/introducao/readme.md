### Introdução de padrões de projeto.

Aqui utilizaremos um projeto ficticio de simulador de patos para desenvolver os conceitos 
iniciais de padrões de projeto.

O simulador começa apenas com duas classes representando patos reais:

`PatoMallard`
`PatoPescocoVermelho`

Quem possuiam métodos comuns a patos reais, porém quando se insere classes como

`PatoDeBorracha`

Que não deve voar temos um problema de design. A proposta desenvolvida nesse pacote é 
desenvolver esse problema e utilizando técnicas de orientação a objetos solucionar esse
problema de design.

O problema começa que as classes citadas todas herdam seus comportamentos de uma super
classe Pato. Quando se decidiu criar um método `voar` na super classe, gerou o problema
onde patos de borracha que não voam herdaram essa caracteristica. 

Da forma como estava originalmente, também tinhamos o problema de adicionar novos 
tipos de patos, como `PatoDeMadeira`, que não deve voar nem grasnar, mas herdaria
esse comportamento ao se herdar da super classe.

A solução implementada para permitir a flexibilidade necessária no proejto foi 
aplicar dois conceitos de projetos:

**- Programar para interfaces**

**- Separar em classes prórprias código mais sujeito a mudança**

A primeira implementação dessa forma está no commit "versão 1.0"



OBS: Exemplos baseados no livro Use a Cabeça Padrões de Projeto da O'Reilly/AltaBooks
