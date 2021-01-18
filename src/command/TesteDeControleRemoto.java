package command;

import command.command.DesligarLuzesCommand;
import command.command.LigarLuzesCommand;
import command.controleremoto.ControleRemoto;
import command.fornecedores.luz.Luz;

/*Aqui temos o cliente  do padrão comando*/
public class TesteDeControleRemoto {

    public static void main(String orgs[]){
        /*O controle remoto é o invocador, ele reeberá um comando que será utilizado para fazer solicitações*/
        ControleRemoto controle = new ControleRemoto();
        /*A luz será o o receptor das solicitações*/
        Luz luz = new Luz();

        /*Para simplificar o exemplo, apenas um tipo de recurso, com opções de ligar e desligar, foram implementadas*/
        LigarLuzesCommand ligarLuz = new LigarLuzesCommand(luz);
        DesligarLuzesCommand desligarLuz = new DesligarLuzesCommand(luz);

        /*Aqui o comando é passado para o invocador*/
        controle.setCommand(0, ligarLuz, desligarLuz);

        System.out.println(controle);
        controle.botaoLigarFoiPressionado(0);
        controle.botaoDesligarFoiPressionado(0);


    }
}
