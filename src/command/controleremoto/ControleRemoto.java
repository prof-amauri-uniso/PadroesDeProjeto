package command.controleremoto;

import command.command.Command;

/*Agora nossa classe ControleRemoto não é mais simples com apenas um comando, mas será composta por vários, por isso
* ela foi refatorada e renomeada*/
public class ControleRemoto {

    /*O controle remoto possui, para cada tipo de recurso que ele irá controlar, dois "botões" de controles básicos:
    * Ligar e Desligar. Então precisamos de um conjunto de comandos para ligar os dispositivos e outro para desligar.
    * Armazenamos esses comandos nesse em vetores*/
    Command[] ligarCommands;
    Command[] desligarCommands;

    public ControleRemoto(){
        ligarCommands = new Command[7];
        desligarCommands = new Command[7];

        /*Criamos uma classe de comando vazio apenas para poder inicializar os comandos.
        * Como command é uma interface funcional (possui apenas um método para ser sobrescrito) podemos usar
        * a sintaxe com lambda*/
        Command commandVazio = () -> {
            System.out.println("Comando Vazio");
        };

        /*Aqui inicializamos os vetores. Não usamos tipos mais eficientes de loops porque seria necessário
        * que objetos já estivessem armazenados nos elementos dos vetores. Assim eliminamos a necessidade de
        * antes de chamarmos o comando, de verificar se espaço referente está nulo */
        for(int i = 0; i < 7; i++){
            ligarCommands[i] = commandVazio;
            desligarCommands[i] = commandVazio;
        }
    }

    /*Agora quando vamos associar os comandos, fazemos em pares, pois para cada recurso que será configurado no controle,
    * duas ações podem ser acionadas no mesmo, ligar e desligar o recurso*/
    public void setCommand(int espacoNoControle, Command ligarCommand, Command desligarCommand){
        ligarCommands[espacoNoControle] = ligarCommand;
        desligarCommands[espacoNoControle] = desligarCommand;
    }

    /*Quando botão é pressionaldo invoca esse método.*/
    public void botaoLigarFoiPressionado(int espacoNoControle){
        ligarCommands[espacoNoControle].executar();
    }
    public void botaoDesligarFoiPressionado(int espacoNoControle){
        desligarCommands[espacoNoControle].executar();
    }

    @Override
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n---- Remote Control ---\n");
        for(int i = 0; i < 7; i++){
            stringBuff.append("[espaco " + i + "] " + ligarCommands[i].getClass().getName() +
                    "   " + desligarCommands[i].getClass().getName() + "\n");
        }

        return stringBuff.toString();
    }
}
