package factory.pizza;

import factory.factorys.IngredientePizzaFactory;

public class PizzaDePepperoni extends Pizza{
    /*Agora precisamos de uma fabrica de ingredientes*/
    IngredientePizzaFactory ingredientePizzaFactory;

    public PizzaDePepperoni(IngredientePizzaFactory ingredientePizzaFactory){
        this.ingredientePizzaFactory = ingredientePizzaFactory;
        this.tipo = "Pepperoni";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza de peperoni");
        this.massa = ingredientePizzaFactory.criarMassa();
        this.molho = ingredientePizzaFactory.criarMolho();
    }
}
