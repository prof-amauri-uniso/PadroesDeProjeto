package decorator.condimento;

import decorator.bebida.Bebida;

// Mesmos comentários de Mocha
public class LeiteComEspuma extends CondimentoDecorator{

    public LeiteComEspuma(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Leite com Espuma";
    }

    @Override
    public double preco() {
        return 0.1 + this.bebida.preco();
    }
}
