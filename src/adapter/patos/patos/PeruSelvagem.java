package adapter.patos.patos;

import adapter.patos.interfaces.Peru;

public class PeruSelvagem implements Peru {


    @Override
    public void goble() {
        System.out.println("Goble");
    }

    @Override
    public void voar() {
        System.out.println("Voando distancia curta");
    }
}
