package command.controleremoto;

import command.command.Command;

/*Classe que irá representar o controle remoto, inicialmente com a possibilidade de customizar apenas uma função*/
public class ControleRemotoSimples {

    /*Aqui temos a referencia para o objeto de comando. Como usamos a interface para a referencia, podemos usar
    * qualquer comando que utilize quaisquer que sejam as classes ou recursos necessários nas implementações
    * concretas de Command*/
    Command espacoParaControle;

    public ControleRemotoSimples(){}

    /*Aqui associamos o Command com o espaço no controle remoto customizavel */
    public void setCommand(Command command){
        this.espacoParaControle = command;
    }

    /*Quando botão é pressionaldo invoca esse método.*/
    public void botaoFoiPressionado(){
        espacoParaControle.executar();
    }
}
