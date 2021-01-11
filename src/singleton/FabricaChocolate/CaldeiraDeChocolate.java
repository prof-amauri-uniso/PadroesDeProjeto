package singleton.FabricaChocolate;

public class CaldeiraDeChocolate {

    private boolean vazia;
    private boolean fervida;
    /*Caso a criação de um objeto singleton não seja muito custosa, uma alternativa para otimizar a questão da criação
    * do objeto de forma a garantir que não teremos mais de uma instancia em multiplos segmentos, podemos criar a
    * instancia no inicio. Assim ao iniciar a aplicação, já teremos uma instancia e não teremos o problema verificando
    * se está null ou não, que era o que poderia gerar o problema de multiplas instancias*/
    private static CaldeiraDeChocolate caldeiraUnica = new CaldeiraDeChocolate();

    /*Criamos um único construtor privado. Dessa forma nenhuma classe poderá instanciar essa classe e os acessos a
    * instancia da mesma são feitos pelos métodos disponibilizados.*/
    private CaldeiraDeChocolate(){
        vazia = true;
        fervida = true;
    }

    /*Como a instanciação é feita acima, sempre teremos uma instancia na varaivel estatica. Assim só precisamos retornar*/
    public static CaldeiraDeChocolate getInstance(){

        return caldeiraUnica;

    }

    /*Métodos para enxer, ferver, esvaziar a caldeira*/
}
