package adapter.patos.adaptadores;

import adapter.patos.interfaces.Pato;
import adapter.patos.interfaces.Peru;

/*Nosso adaptador precisa implementar a interface alvo. Nos métodos da interface alvo é que ocorrem
* as chamadas aos métodos da interface adaptada*/
public class PeruAdapter implements Pato {

    /*Usamos a composição para associarmos o adaptador com o objeto sendo adaptado. Como usamos a interface,
    * qualquer tipo de peru que implemente a interface Peru pode ser utilizado com o adaptador*/
    Peru peru;

    /*No construtor recebemos o objeto sendo adaptado*/
    public PeruAdapter(Peru peru){
        this.peru = peru;
    }

    /*A conversão de quack é trivial, chamamos o método "equivalente" do peru, que é o goble*/
    @Override
    public void quack() {

        peru.goble();

    }

    /*A implementação de voar requer implementação "elaborada". Perus voam apenas uma pequena distancia, então para
    * adapta-lo para um pato, fazemos com que ele vooe 5 vezes*/
    @Override
    public void voar() {

        for (int i = 0; i < 5; i++){
            peru.voar();
        }

    }
}
