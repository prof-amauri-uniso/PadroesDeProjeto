package decorator.bebida;

/*Essa é a classe componenten do padrão, a que servirá de base para as demais. Ela é abstrata, pois mesmo usando herança
* não temos o objetivo de herdar comportamento, apenas garantir o mesmo tipo para que possamos usar a composição
* nas classes decoradoras
*
* As classes base, que são as bebidas, são as classes que serão decoradas. As classes de condimentos são as classes
* decoradoras. */
public abstract class Bebida {

    String descricao = "Bebida desconhecida";

    public String getDescricao(){
        return this.descricao;
    }

    public abstract double preco();


}
