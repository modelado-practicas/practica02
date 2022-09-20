import java.util.Hashtable;

public class HashtableIterator implements Iterator{
    Hashtable<Integer,Hamburguesa> hash = new Hashtable<Integer,Hamburguesa>();
    int posicion = 0;

    /**
     * Constructor del iterador de Hastable
     * @param hash el HashTable por Iterar
     */
    public HashtableIterator(Hashtable<Integer,Hamburguesa> hash) {
        this.hash = hash;
    }
    @Override
    public Hamburguesa next() {
        posicion +=1;
        return hash.get(posicion);
    }
    @Override
    public boolean hasNext() {
        if (posicion >= hash.size()) {
            return false;
        }else{
            return true;
        }
    }
    
}
