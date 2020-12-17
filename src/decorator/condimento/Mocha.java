package decorator.condimento;

import decorator.bebida.Bebida;

public class Mocha extends CondimentoDecorator{

    public Mocha(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Mocha";
    }

    @Override
    public double preco() {
        return 0.20 + this.bebida.preco();
    }
}
