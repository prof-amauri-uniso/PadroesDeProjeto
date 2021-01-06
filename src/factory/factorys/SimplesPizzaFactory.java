package factory.factorys;

import factory.pizza.Pizza;
import factory.pizza.PizzaDePepperoni;
import factory.pizza.PizzaDeQueijo;


public class SimplesPizzaFactory {

    /*Toda a verificação sobre qual instancia concreta de pizza será utilizada fica a cargo do método na classe factory*/
    public Pizza criarPizza(String tipo){
        Pizza pizza = null;

        if(tipo.equals("queijo")){
            //pizza = new PizzaDeQueijo();
        }
        else if(tipo.equals("pepperoni")){
            //pizza = new PizzaDePepperoni();
        }

        return pizza;
    }
}
