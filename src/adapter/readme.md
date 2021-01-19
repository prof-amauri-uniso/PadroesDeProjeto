**Definição do padrão Adapter**
 
O padrão adapter converte a interface de uma classe para outra intrerface que o cliente espera 
encontrar. O adaptador permite que classes com interfaces incompativeis trabalhem 
juntas.

Quando temos um código que implementa suas funcionalidades baseadas em uma determinada
interface, pode ocorrer que precisemos inserir código implementado usando outra.
Um exemplo é o uso de um determinado tipo de biblioteca e posterior migração para
outra. Para não se migrar todo o código já implementado, cria-se classes intermediarias
que convertem as chamadas de uma interface para outra.
 
 **Exemplo** 
 
Em uma versão do exemplo dos patos da introdução, temos aqui uma interface pato
e uma interface peru. Por algum motivo, a aplicação passou a necessitar que onde se 
trabalhava com patos, agora os objetos que devem ser manipulados também podem ser
perus. Perus e patos tem funcionalidadese finalidades parecidas, então ao invés de modificar todo 
o código, criamos uma adaptador de peru para pato, e assim todo o código que espera
um pato fica inalterado.
 
 `v1.0-adapter` - Exemplo com patos
