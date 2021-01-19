package adapter.enumerationiterator;

import java.util.Enumeration;
import java.util.Iterator;

/*Com esse adaptador, sistemas que implementam com Enumaration poderão interagir com sistemas
* que requerem objetos iterator*/
public class EnumerationIteratorAdapter  implements Iterator {

    /*Compomos a classe com o objeto que será adaptado*/
    Enumeration enumerator;

    public EnumerationIteratorAdapter(Enumeration enumerator){
        this.enumerator = enumerator;
    }

    /*Implementamos os métodos não defult hasnext e next.
    *
    * OBS: métodos default são aqueles que não possuem implementação. A partir do Java 8 é possivel
    * colocar corpo em métodos de interfaces. Por motivo de compatibilidade, foi adicionado o modificador
    * default. Métodos com o modificador default não precisam ser implementados nas clases que implementarem a
    * interface*/
    @Override
    public boolean hasNext() {
        return enumerator.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumerator.nextElement();
    }

    /*Como o objeto adaptado não possui qualquer recurso que permita emular a remoção de um item da coleção, não podemos
    * tratar isso. Esse é um problema com adaptadores, mas esperado. Nesse caso, então lançamos uma exceção para que
    * ela possa ser tratada aonde o adaptador for utilizado.*/
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Não é possível remover de um Enumarator");
    }
}
