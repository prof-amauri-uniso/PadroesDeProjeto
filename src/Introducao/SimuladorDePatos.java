package introducao;

import introducao.pato.Pato;
import introducao.pato.PatoDeBoracha;
import introducao.pato.PatoMallard;
import introducao.pato.PatoModelo;
import introducao.voo.VooComFoguete;

public class SimuladorDePatos {

    public static void main(String[] args){
        Pato mallard = new PatoMallard();
        Pato borracha = new PatoDeBoracha();

        mallard.executarQuack();
        mallard.executarVoo();

        borracha.executarQuack();
        borracha.executarVoo();

        /*Como no construtor estabelecemos um tipo de voo, que no caso é NaoVoa, ele vai executar
        * isso na primeira interação. Na subsequente, após a alteração onde setamos um novo tipo
        * de comportamento de voo, a execução fica diferente*/
        Pato modelo = new PatoModelo();
        modelo.executarVoo();
        modelo.setComportamentoVoo(new VooComFoguete());
        modelo.executarVoo();
    }
}
