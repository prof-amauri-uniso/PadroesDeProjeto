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

    /*Caso múltiplos segmentos (Threads) façam uso da instancia, podemos ter um problema de quando a instancia é criada
    * ocasionando mais instancias. Se a verificação de null for feita em um momento em que outro segmento estiver
    * chamando a mesma verificação, os dois segmentos podem chegar no ponto de criar uma nova instancia, gerando
    * assim duas instancias. Esse problema é muito díficil de depurar quando ocorre. Para evitar esse acesso concorrente
    * desordenado, usamos a palavra reservada syncronyzed, que informa para a JVM que o método só pode ser acessado
    * por um segmento por vez e quando o feito, ele deve ser executado até o fim antes que outro segmento
    * possa executar. Dessa forma, resolvemos o problema. Métodos sincornizados são caros do ponto de vista computacional
    * pois afetam desempenho. Se o método ser sincronizado não causar um impacto muito grande, apenas a sincronização
    * já é uma boa sulução para evitar problemas de aceso de multiplos segmentos.*/
    public static synchronized CaldeiraDeChocolate getInstance(){
        if (caldeiraUnica == null){
            caldeiraUnica = new CaldeiraDeChocolate();
        }

        return caldeiraUnica;

    }

    /*Métodos para enxer, ferver, esvaziar a caldeira*/
}
