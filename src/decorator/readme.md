_**Principio de projeto**_

As classes devem estar abertas para extensão, mas fechadas para modificação.

**Sobre o padrão decorator**
 - Os decoradores têm o mesmo supertipo que os objetos que eles decoram.
 - Você pode usar um ou mais decoradores para englobar um objeto.
 - Uma vez que o decorador tem o mesmo supertirpo que o objeto decorado, podemos passar
 um objeto decorado no lugar do objeto original.
 - O decorador adicionar seu próprio comportamento antes e/ou depois de delegar para o objeto que ele decora o resto do 
 trabalho.
 - Os objetos podem ser decorados a qualquer momento, então podemos decorar os objetos de maneira dinâmica no tempo
 de execução com quantos decoradores desejarmos.
 
 **_Definição do padrão decorator_**
 
 O padrão decorator anexa responsabilidades adicionais a um objeto dinamicamente. Os decoradores fornecem
 uma alternativa flexível de subclasse para estender a funcionalidade.
 
 O padrão decorator normalmente é utilizada com outros padrões, como o Factory e o Builder,
 para que a criação dos componentes decorados fique encapsulado e menos sujeito a falhas de 
 codificação.
 
 Um bom exercicio seria:
 Agora você pode pedir um café com os tamanhos pequeno, médio e grande. Para isso foram
 adicionados na classe Bebida os métodos `getTamanho()` e `setTamanho()`. Os precos dos
 condimentos devem levar em consideração o tamanho da bebida. Como poderiam ser 
 alteradas as classes decoradoras para modificar isso.