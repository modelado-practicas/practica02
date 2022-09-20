package preparacion;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator{
    ArrayList<Platillo> lista;
    int posicion = 0;

    /**
     * Constructor del ArrayListIterator
     * @param lista ArrayList  por iterar
     */
    public ArrayListIterator(ArrayList<Platillo> lista){
        this.lista = lista;
    }

    @Override
    public Platillo next() {
        Platillo platillo = lista.get(posicion);
        posicion +=1;
        return platillo;
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
