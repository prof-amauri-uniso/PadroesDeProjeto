package factory.venda;

import factory.factorys.IngredientePizzaFactory;
import factory.factorys.NYIngredientePizzaFactory;
import factory.factorys.SimplesPizzaFactory;
import factory.pizza.*;

/*Agora nossos tipos de pizza são definidos por seus componentes de ingredientes. Temos uma fábrica que fábrica vários
* tipos de elementos, e implementações diferentes dessa fábrica dão resultados diferentes para esses elementos, mas
* ainda são elemntos dos mesmos tipos (ingredientes)*/
public class LojaDePizzaNY extends LojaDePizza{

    @Override
    public Pizza criarPizza(String tipo) {
        Pizza pizza = null;
        IngredientePizzaFactory ingredientePizzaFactory = new NYIngredientePizzaFactory();

        if(tipo.equals("queijo")){
            pizza = new PizzaDeQueijo(ingredientePizzaFactory);
        }
        else if(tipo.equals("pepperoni")){
            pizza = new PizzaDePepperoni(ingredientePizzaFactory);
        }

        return pizza;
    }

}
