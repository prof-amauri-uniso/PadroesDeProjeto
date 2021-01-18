package command.command;

import command.fornecedores.luz.Luz;

public class DesligarLuzesCommand implements Command{
    /*Armazenmos uma referencia sobre qual objeto efetivamnete efetuará as operações que serão executadas no método
     * execute()*/
    Luz luz;

    /*No construtor passamos em qual luz as operações serão executadas, por exemplo, a luz da sala de estar*/
    public DesligarLuzesCommand(Luz luz){
        this.luz = luz;
    }

    /*Aqui efetivamente listamos o que deve ser feito, sendo chamado o objeto associado.*/
    @Override
    public void executar() {

        luz.desligar();

    }
}
