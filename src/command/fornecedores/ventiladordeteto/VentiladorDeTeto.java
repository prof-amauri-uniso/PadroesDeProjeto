package command.fornecedores.ventiladordeteto;

public class VentiladorDeTeto {

    /*Constantes para padronizar as velocidades*/
    public static final int ALTA = 3;
    public static final int MEDIA = 2;
    public static final int BAIXA = 1;
    public static final int DESLIGADO = 0;
    String localizacao;
    int velocidade;

    public VentiladorDeTeto(String localizacao){
        this.localizacao = localizacao;
        this.velocidade = DESLIGADO;
    }

    /*Como temos variações de velocidade, quando formos executar desfazer, vamos precisar verificar a velocidade
    * anterior também*/
    public void alta(){
        this.velocidade = ALTA;
    }

    public void media(){
        this.velocidade = MEDIA;
    }

    public void baixa(){
        this.velocidade = BAIXA;
    }

    public void desligado(){
        this.velocidade = DESLIGADO;
    }

    public int getvelocidade(){
        return velocidade;
    }
}
