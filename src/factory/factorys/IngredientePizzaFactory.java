package factory.factorys;

import factory.ingredientes.Massa;
import factory.ingredientes.Molho;

/*Agora queremos garantir a composição dos ingredientes de forma que não se fique dependente das implementações
* das pizzas. O que irá definir os tipos de pizzas serão seus ingredientes, assim garantimos que todas as pizzas
* terão os mesmos tipos de ingredientes, mas os mesmos podem variar regionalmente*/
public interface IngredientePizzaFactory {

    /*A titulo de exemplo vamos criar apenas dois tipos de ingredientes: massa e molho. Então nossa fábrica deverá
     retornar apenas esses ingredientes abstratos

     Criamos as classes abstratas para assim nas implementações da fábrica não dependermos das implementações
     dos ingredientes, podendo cada implementação da fábrica podem utilizar sua própria gama de ingredientes*/
    public Massa criarMassa();
    public Molho criarMolho();
}
