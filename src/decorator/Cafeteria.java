package decorator;

import decorator.bebida.Bebida;
import decorator.bebida.Expresso;
import decorator.bebida.MisturaDaCasa;
import decorator.condimento.LeiteComEspuma;
import decorator.condimento.Mocha;

public class Cafeteria {

    public static void main(String args[]){

        Bebida bebida1 = new Expresso();
        System.out.println(bebida1.getDescricao() + " $" + bebida1.preco());

        Bebida bebida2 = new MisturaDaCasa();
        bebida2 = new Mocha(bebida2);
        bebida2 = new Mocha(bebida2);
        bebida2 = new LeiteComEspuma(bebida2);
        System.out.println(bebida2.getDescricao() + " $" + bebida2.preco());
    }
}
