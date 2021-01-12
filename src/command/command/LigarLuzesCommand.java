package command.command;

import command.fornecedores.luz.Luz;

/*Essa é uma implementação concreta de Command. Ela irá atuar com as luzes inteligentes*/
public class LigarLuzesCommand implements Command{

    /*Armazenmos uma referencia sobre qual objeto efetivamnete efetuará as operações que serão executadas no método
    * execute()*/
    Luz luz;

    /*No construtor passamos em qual luz as operações serão executadas, por exemplo, a luz da sala de estar*/
    public LigarLuzesCommand(Luz luz){
        this.luz = luz;
    }

    /*Aqui efetivamente listamos o que deve ser feito, sendo chamado o objeto associado.*/
    @Override
    public void executar() {

        luz.ligar();

    }
}
