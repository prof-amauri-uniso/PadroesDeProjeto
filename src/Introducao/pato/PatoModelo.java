package introducao.pato;

import introducao.quack.Quack;
import introducao.voo.NaoVoa;

public class PatoModelo extends Pato{

    public PatoModelo(){
        this.comportamentoQuack = new Quack();
        //Começamos sem voo
        this.comportamentoVoo = new NaoVoa();
    }
    @Override
    public void display() {
        System.out.println("Sou um modelo de Pato!!!");
    }
}
