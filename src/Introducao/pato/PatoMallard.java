package introducao.pato;

import introducao.quack.Quack;
import introducao.voo.VooComAsas;

public class PatoMallard extends Pato{

    public PatoMallard(){
        comportamentoQuack = new Quack();
        comportamentoVoo = new VooComAsas();
    }


    @Override
    public void display() {
        System.out.println("Sou um pato mallard!!!");
    }
}
