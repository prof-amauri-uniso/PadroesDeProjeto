package adapter.patos;

import adapter.patos.adaptadores.PeruAdapter;
import adapter.patos.interfaces.Pato;
import adapter.patos.interfaces.Peru;
import adapter.patos.patos.PatoMallard;
import adapter.patos.patos.PeruSelvagem;

public class TestePatos {

    public static void main(String args[]){

        Pato pato = new PatoMallard();

        Peru peru = new PeruSelvagem();
        Pato peruAdapter = new PeruAdapter(peru);

        System.out.println("O peru diz....");
        peru.goble();
        peru.voar();

        System.out.println("O pato diz...");
        pato.quack();
        pato.voar();

        System.out.println("O adaptador do peru diz....");
        peruAdapter.quack();
        peruAdapter.voar();

    }




}
