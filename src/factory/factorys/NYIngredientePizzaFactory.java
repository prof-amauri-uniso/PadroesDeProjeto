package factory.factorys;

import factory.ingredientes.Massa;
import factory.ingredientes.MassaGrossa;
import factory.ingredientes.Molho;
import factory.ingredientes.MolhoMarinara;

public class NYIngredientePizzaFactory implements IngredientePizzaFactory{
    @Override
    public Massa criarMassa() {
        return new MassaGrossa();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoMarinara();
    }
}
