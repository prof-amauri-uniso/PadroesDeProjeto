package introducao;

import introducao.pato.Pato;
import introducao.pato.PatoDeBoracha;
import introducao.pato.PatoMallard;

public class SimuladorDePatos {

    public static void main(String[] args){
        Pato mallard = new PatoMallard();
        Pato borracha = new PatoDeBoracha();

        mallard.executarQuack();
        mallard.executarVoo();

        borracha.executarQuack();
        borracha.executarVoo();
    }
}
