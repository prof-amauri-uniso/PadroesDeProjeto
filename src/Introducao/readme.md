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

A solução implementada para permitir a flexibilidade necessária no projeto foi 
aplicar três conceitos de projetos:

**- Programar para interfaces**

**- Separar em classes próprias código mais sujeito a mudança**

**- Dar prioridade á composição**

A primeira implementação dessa forma está na branch "Versao1.0"

Versao2.0 - Temos o exemplo de uma implementação com um pato definindo dinamicamente seu 
tipo de voo


Ao final da implementação temos um exemplo do padrão **STRATEGY**

Definição: este padrão de projeto define uma familia de algoritmos, encapsula cada um 
deles e os torna intecambiáveis. A estratégia deixa o algoritmo variar independente dos 
clientes que o utilizam. 

No exemplo:

- Os conjuntos de algoritmos são as diferentes formas que um pato pode grasnar ou 
voar. 
- Para que esses algoritmos sejam intercambiaveis, implementamos uma interface base
para todos, definindo assim um tipo comum para representar todos os algoritmos.


OBS: Exemplos baseados no livro Use a Cabeça Padrões de Projeto da O'Reilly/AltaBooks
