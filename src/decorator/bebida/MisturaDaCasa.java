package decorator.bebida;

public class MisturaDaCasa extends Bebida{

    public MisturaDaCasa(){
        this.descricao = "Cafe Mistura da Casa";
    }

    @Override
    public double preco() {
        return 0.89;
    }
}
