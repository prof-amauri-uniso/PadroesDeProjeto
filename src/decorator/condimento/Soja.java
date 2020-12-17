package decorator.condimento;

import decorator.bebida.Bebida;

// Mesmos comentários de Mocha
public class Soja extends CondimentoDecorator{

    public Soja(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Leite de Soja";
    }

    @Override
    public double preco() {
        return 0.15 + this.bebida.preco();
    }
}
