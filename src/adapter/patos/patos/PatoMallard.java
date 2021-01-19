package adapter.patos.patos;

import adapter.patos.interfaces.Pato;

/*Implementação concreta da interface Pato*/
public class PatoMallard implements Pato {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }
}
