package factory.pizza;

/*Essa classe deixa de ser usada pois o que vai definir a pizza como de nova york serão os ingredientes. Será mantida
* para evitar problemas com referencia*/
public class PizzaDePepperoniNY extends Pizza{

    public PizzaDePepperoniNY(){
        this.tipo = "Pepperoni de NY";
    }

    /*Por ficar nos vemos obrigados a implementar o método abstrato que definimos na classe pai*/
    @Override
    public void preparar() {

    }
}
