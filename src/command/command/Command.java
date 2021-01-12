package command.command;

/*Essa é a nossa interface que irá derivar todos os comandos necessários. O método execute para cada implementação
* é que ficará responsável por executar as diferentes ações em cada situação*/
public interface Command {

    public void executar();
}
