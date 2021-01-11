package singleton.FabricaChocolate;

public class CaldeiraDeChocolate {

    private boolean vazia;
    private boolean fervida;
    /*O problema de sincronização ocorre devido ao uso das memórias cache dos processadores. As variaveis cache são escritas e
    * lidas primeiro, portanto quando isso ocorre, o valor na memória principal pode já ter mudado. O atributo voltile
    * diz para a JVM que esse atributo deve ser salvo diretamente na memória principal, dessa forma garantindo que
    * quando o mpetodo estatico for ler a variavel, o valor sempre estará atualizado. Como existe um motivo para
    * o uso das memórias cache dos processadores, isso é custoso. Fazer o flush recorrente pode gerar bastante perda de
    * desempenho. Entretanto, como ocorrerá apenas uma vez a criação, é uma alternativa para dimnuir o overhead
    * permitindo sincronizar apenas na primeira criação do objeto, e as demais chamadas sem sincronização.*/
    private static volatile CaldeiraDeChocolate caldeiraUnica;

    /*Criamos um único construtor privado. Dessa forma nenhuma classe poderá instanciar essa classe e os acessos a
    * instancia da mesma são feitos pelos métodos disponibilizados.*/
    private CaldeiraDeChocolate(){
        vazia = true;
        fervida = true;
    }

    /* Agora com o atributo de classe sendo volatile, sincronizamos apenas a instanciação, reduzindo o overhead de
    * sincronização */
    public static CaldeiraDeChocolate getInstance(){

        /*Fazemos a verificação para saber se vai ser necessário sincronizar pois será necessário criar a nova
        * instancia*/
        if(caldeiraUnica == null){
            /*Como a verificação em si não está sincronizada, precisamos verificar novamente para garantir a integridade*/
            synchronized(CaldeiraDeChocolate.class){
                if(caldeiraUnica == null){
                    caldeiraUnica =  new CaldeiraDeChocolate();
                }
            }

            return caldeiraUnica;

        }
        return caldeiraUnica;

    }

    /*Métodos para enxer, ferver, esvaziar a caldeira*/
}
