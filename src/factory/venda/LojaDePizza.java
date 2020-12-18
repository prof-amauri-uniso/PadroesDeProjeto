package factory.venda;

import factory.factorys.SimplesPizzaFactory;
import factory.pizza.Pizza;

public class LojaDePizza {

    /*A classe cliente, que irá utilizar as instancias dos objetos, precisa que a factory seja disponibilizado por
    * composição*/
    SimplesPizzaFactory factory;

    // No construtor garantimos que teremos uma factory para instanciar as pizzas
    public LojaDePizza(SimplesPizzaFactory factory){
        this.factory = factory;
    }

    public Pizza pedirPizza(String tipo){
        Pizza pizza;
        pizza = factory.criarPizza(tipo);
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();

        return pizza;
    }
}
