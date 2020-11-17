package introducao.voo;

import introducao.voo.ComportamentoVoo;

public class VooComAsas implements ComportamentoVoo {
    @Override
    public void voar() {
        System.out.println("Estou voando");
    }
}
