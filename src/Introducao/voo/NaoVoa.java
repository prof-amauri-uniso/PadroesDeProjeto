package introducao.voo;

public class NaoVoa implements ComportamentoVoo{
    @Override
    public void voar() {
        System.out.println("Não posso voar!!!");
    }
}
