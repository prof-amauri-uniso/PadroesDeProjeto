package factory.pizza;

import factory.factorys.IngredientePizzaFactory;

public class PizzaDeQueijo  extends Pizza{
    /*Agora precisamos de uma fabrica de ingredientes*/
    IngredientePizzaFactory ingredientePizzaFactory;

    public PizzaDeQueijo(IngredientePizzaFactory ingredientePizzaFactory){
        this.ingredientePizzaFactory = ingredientePizzaFactory;
        this.tipo = "Queijo";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza de queijo");
        this.massa = ingredientePizzaFactory.criarMassa();
        this.molho = ingredientePizzaFactory.criarMolho();
    }
}
