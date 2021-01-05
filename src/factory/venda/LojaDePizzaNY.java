package factory.venda;

import factory.factorys.SimplesPizzaFactory;
import factory.pizza.*;

public class LojaDePizzaNY extends LojaDePizza{

    @Override
    public Pizza criarPizza(String tipo) {
        Pizza pizza = null;

        if(tipo.equals("queijo")){
            pizza = new PizzaDeQueijoNY();
        }
        else if(tipo.equals("pepperoni")){
            pizza = new PizzaDePepperoniNY();
        }

        return pizza;
    }

}
