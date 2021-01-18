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
 