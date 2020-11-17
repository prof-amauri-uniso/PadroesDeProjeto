package introducao.pato;

import introducao.quack.ComportamentoQuack;
import introducao.voo.ComportamentoVoo;

public abstract class Pato {
    ComportamentoVoo comportamentoVoo;
    ComportamentoQuack comportamentoQuack;

    public Pato(){

    }

    public abstract void display();

    public void executarVoo(){
        comportamentoVoo.voar();
    }

    public void executarQuack(){
        comportamentoQuack.quack();
    }

    public void nadar(){
        System.out.println("Todos patos boiam, inclusive de madeira!");
    }
}
