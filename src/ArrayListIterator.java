import java.util.ArrayList;

public class ArrayListIterator implements Iterator{
    ArrayList<Hamburguesa> lista;
    int posicion = 0;

    /**
     * Constructor del ArrayListIterator
     * @param lista ArrayList  por iterar
     */
    public ArrayListIterator(ArrayList<Hamburguesa> lista){
        this.lista = lista;
    }

    @Override
    public Hamburguesa next() {
        Hamburguesa hamburguesa = lista.get(posicion);
        posicion +=1;
        return hamburguesa;
    }

    @Override
    public boolean hasNext(){
        if(posicion >= lista.size()){
            return false;
        }else{
            return true;
        }
    }
}
