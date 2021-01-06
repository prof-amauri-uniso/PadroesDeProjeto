package factory.pizza;

import factory.ingredientes.Massa;
import factory.ingredientes.Molho;

/*Agora nossas pizzas serão definidas pelos seus ingredientes, então não teremos mais as implementações regionais
* para nova york ou outras que poderiam ser criadas. Agora uma única classe de cada tipo poderá atender
* diferentes localidades e jeitos de fazer cada tipo de pizza*/
public abstract class Pizza {

    protected String tipo;
    protected Massa massa;
    protected Molho molho;

    /*Agora precisamos de um método que irá compor a pizza com os ingredientes, utilizando as implementações das
    * fabricas. Esse método será abstrato, pois cada tipo de pizza terá sua composição de ingredientes especifica
    * (nem todas vão queijo)especifica, embora os ingredientes variem.*/
    public abstract void preparar();

    public void assar(){
        System.out.println("Assando pizza: " + this.tipo);
    }

    public void cortar(){
        System.out.println("Cortando pizza: " + this.tipo);
    }

    public void embalar(){
        System.out.println("Embalando pizza: " + this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
