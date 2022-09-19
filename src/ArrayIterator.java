import preparacion.Hamburguesa;

public class ArrayIterator implements Iterator{

    Hamburguesa[] hamburguesas;
    int posicion = 0;

    /**
     * Constructor del iterador para arreglos
     * @param hamburguesas Arreglo de hamburguesas por iterar
     */
    public ArrayIterator(Hamburguesa[] hamburguesas){
        this.hamburguesas = hamburguesas;
    }

    @Override
    public Hamburguesa next() {
        Hamburguesa hamburguesa = hamburguesas[posicion];
        posicion +=1;
        return hamburguesa;
    }

    @Override
    public boolean hasNext(){
        if(posicion >= hamburguesas.length || hamburguesas[posicion] == null){
            return false;
        }else{
            return true;
        }
    }
}
