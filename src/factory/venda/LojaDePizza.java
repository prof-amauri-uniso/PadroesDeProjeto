package factory.venda;

import factory.factorys.SimplesPizzaFactory;
import factory.pizza.Pizza;
import factory.pizza.PizzaDePepperoni;
import factory.pizza.PizzaDeQueijo;

// Tornamos a classe de Loja abstrata, pois vamos querrer criar lojas com diferenças regionais.
public abstract class LojaDePizza {


    public Pizza pedirPizza(String tipo){
        Pizza pizza;
        // Aqui não temos mais a classe de factory, mas sim um método abstrato
        pizza = criarPizza(tipo);
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();

        return pizza;
    }

    /*O método de criação de pizza retorna para a loja, mas abstrato, assim cada pizarria reginal poderá decidir as
    * instancias de pizzas que serão criadas*/
    public abstract Pizza criarPizza(String tipo);
}
