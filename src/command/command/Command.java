package command.command;

/*Essa é a nossa interface que irá derivar todos os comandos necessários. O método execute para cada implementação
* é que ficará responsável por executar as diferentes ações em cada situação*/
public interface Command {

    public void executar();
    /*Para adicionar a funcionalidade de desfazer precisamos que as classes concretas implementem um método que desfaça
    * sua ação. Precisamos que a interface reflita isso, e que as classes concretas implementem.*/
    public void desfazer();
}
