package adapter.enumerationiterator;

import java.util.Enumeration;
import java.util.Iterator;

/*Com esse adaptador, sistemas que implementam com Iterator poderão interagir com sistemas
 * que requerem objetos Enumeration*/
public class IteratorEnumerationAdapter implements Enumeration {

    Iterator it;

    public IteratorEnumerationAdapter(Iterator it){
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }
}
