package introducao.pato;

import introducao.quack.Squeak;
import introducao.voo.NaoVoa;

public class PatoDeBoracha extends Pato{

    public PatoDeBoracha(){
        comportamentoQuack = new Squeak();
        comportamentoVoo = new NaoVoa();
    }
    @Override
    public void display() {
        System.out.println("Pato de borracha");
    }
}
