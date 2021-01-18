**Definição do padrão Command**

O padrão Command encapsula solicitações como um objeto, o que lhe permite parametrizar
outros objetos com diferentes solicitações, enfileirar ou registrar solicitações e implementar 
recursos de cancelamento de operações
 

 
 **Exemplo** 
 
 Vamos criar um controle universal genérico. Os usuários poderão atribuir diferentes 
 produtos de diferentes fornecedores de automação residencial (luzes, tv, etc), associar
 esses produtos com o controle e para cada produto associado terão dois botões: liga 
 e desliga. Dessa forma o objetivo é um controle remoto com funções customizavies.
 
 `v1.0-command` - Versão inicial com controle remoto simples
 
 `v2.0-command` - Atribuindo comandos a slots no controle remoto
 
 `v3.0-command` - Desfazer simples
 
 `v4.0-command` - Desfazer usando estado
 
 Uma outra possbilidade de uso de command é com a criação de macro comandos.
 Esses macro comandos possuem um conjunto de commandos que será exeecutados todos ao mesmo
 tempo. Por exemplo, um macrocomando para o verão, onde liga TV e arcondicionado  
 em diferentes comodos. Criariamos uma classe com um array de comandos, adiconariamos
 os que fossem necessários, e no executar() do macro comando chamariamos o executar
 de cada comando individual que compoe o macrocomando.
 
 **Uso do padrão Command para filas de processamento**
 
 Como fica transparente para o cliente o que deverá ser executado, é possivel 
 usar o padrão para criar uma fila de processamento. Ao se criar o objeto command,
 ele é colocado em uma fila. Um outro agente retira os itens da fila e em seguida
 executa o método executar() do objeto. Não importa o que será processado, pois 
 o agente conhece apenas o método executar. 
 
 
 