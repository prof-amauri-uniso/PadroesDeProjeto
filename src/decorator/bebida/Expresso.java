package decorator.bebida;

public class Expresso extends Bebida{

    /*Como as bebidas são base, serão decoradas, elas apenas precissam atribuir a sua descrição, e não se importar
    * com a composição da descrição com os demais elementos*/
    public Expresso(){
        this.descricao = "Expresso";
    }

    /*Apenas precisa retornar o seu valor, que inclusive poderia ser um atributo que poderia ser modificado em tempo
    * de execução.*/
    @Override
    public double preco() {
        return 1.99;
    }
}
