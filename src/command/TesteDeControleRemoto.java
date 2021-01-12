package command;

import command.command.LigarLuzesCommand;
import command.controleremoto.ControleRemotoSimples;
import command.fornecedores.luz.Luz;

/*Aqui temos o cliente  do padrão comando*/
public class TesteDeControleRemoto {

    public static void main(String orgs[]){
        /*O controle remoto é o invocador, ele reeberá um comando que será utilizado para fazer solicitações*/
        ControleRemotoSimples controle = new ControleRemotoSimples();
        /*A luz será o o receptor das solicitações*/
        Luz luz = new Luz();
        /*Criamos o comando e passamos para ele o receptor que das solicitações e execuções*/
        LigarLuzesCommand ligarLuz = new LigarLuzesCommand(luz);

        /*Aqui o comando é passado para o invocador*/
        controle.setCommand(ligarLuz);
        controle.botaoFoiPressionado();

    }
}
