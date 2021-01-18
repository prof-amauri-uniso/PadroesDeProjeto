package command.fornecedores.luz;

public class Luz {

    boolean acesa = false;

    public void ligar(){
        this.acesa = true;
        System.out.println("Luz acessa: " + this.acesa);
    }

    public void desligar(){
        this.acesa = false;
        System.out.println("Luz acessa: " + this.acesa);
    }
}
