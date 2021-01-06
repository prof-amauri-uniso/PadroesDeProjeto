package factory.pizza;

/*Essa classe deixa de ser usada pois o que vai definir a pizza como de nova york serão os ingredientes. Será mantida
 * para evitar problemas com referencia*/
public class PizzaDeQueijoNY extends Pizza{

    public PizzaDeQueijoNY(){
        this.tipo = "Queijo de nova york";
    }

    /*Por ficar nos vemos obrigados a implementar o método abstrato que definimos na classe pai*/
    @Override
    public void preparar() {

    }
}
