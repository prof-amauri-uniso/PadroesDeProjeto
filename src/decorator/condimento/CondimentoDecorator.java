package decorator.condimento;

import decorator.bebida.Bebida;

/* Essa é a classe que irá decorar as bebidas. Ela é abstrata também, para podermos implementar quantas precisarmos
* e quisermos e ela extende Bebida, para que possamos usr a composição com polimorfismo*/
public abstract class CondimentoDecorator extends Bebida {

    /*Como a classe será a base para as classes que irão decorar as bebidas, ela precisa de uma variavel de
    * instancia para armazenar a mesma. Assim temos a composição.*/
    Bebida bebida;

    /*Usamos o construtor para obrigar passar uma bebida, pois como é uma classe decoradora, ela só fará sentido se
    * existir um elemento para decorar.*/
    public CondimentoDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    /*Como a descrição precisa ser composta pela da bebida base e mais os condimentos, precisamos obrigar que os
    * condimentos implementem suas próprias versões. Novamente, a herança funciona apenas para delegar, e não
    * para herdar comportamento*/
    public abstract String getDescricao();
}
