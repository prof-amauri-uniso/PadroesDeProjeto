package singleton.FabricaChocolate;

public class CaldeiraDeChocolate {

    private boolean vazia;
    private boolean fervida;
    /*Usamos uma instancia unica na própria classe para poder cotrolar a instanciação e o acesso.
    * Ela precisa ser statica para garantir que será única, além de poder ser acessada pelo método estático
    * que cuida da criação e recuperação da instancia*/
    private static CaldeiraDeChocolate caldeiraUnica;

    /*Criamos um único construtor privado. Dessa forma nenhuma classe poderá instanciar essa classe e os acessos a
    * instancia da mesma são feitos pelos métodos disponibilizados.*/
    private CaldeiraDeChocolate(){
        vazia = true;
        fervida = true;
    }

    /*Aqui temos o método estático que irá retornar a instancia. Como ele é estatico, é um método de classe, pode
    * ser chamado mesmo que a mesma ainda não tenha uma instancia.*/
    public static CaldeiraDeChocolate getInstance(){
        if (caldeiraUnica == null){
            caldeiraUnica = new CaldeiraDeChocolate();
        }

        return caldeiraUnica;

    }

    /*Métodos para enxer, ferver, esvaziar a caldeira*/
}
