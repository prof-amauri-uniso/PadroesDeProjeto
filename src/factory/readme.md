No padrão factory separmos as partes do código que manipulam instancias concretas das classes
para assim o restante do nosso código poder seguir o conceito de projeto onde se programa
para interfaces e não para implementações.

_**Principio de projeto**_

Depende de abstrações. Não depende de classes concretas. 

`v1.0-factory` - Simple Factory

`v2.0-factory` - Factory Method

**Definição:** O padrão Factory Method define uma interface para criar um objeto, mas permite ás classes decidir qual 
classe instanciar. O factory method permite a uma classe deferir a instanciação para subclasses.

Temos então uma classe com método abstrato que depende de um produto. O produto é comum a todas as 
implementações concretas, mas as implementações concretas é que especificam quais implmentações
concretas do produto serão instanciadas.

No exemplo, o método que factory abstrato é o criar pizza, e cada implementação de 
LojaDePizza tem suas proprias implementações de pizzas, que são os produtos.

`v3.0-factory` - Abstract Factory

**Definição:** O padrão Abstract Factory fornece uma interface para criar familias de objetos relacionados
ou dependentes sem especificar suas classes concretas.

Assim, um cliente usa uma interface abstrata para criar um conjunto de produtos relacionados
sem saber (ou se importar) sobre os produtos concretos que são realmente produzidos.
Dessa forma, o cliente é desvinculado de qualquer especificação dos produtos 
concretos.



