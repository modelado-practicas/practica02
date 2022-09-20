public class ArrayIterator implements Iterator{

    Platillo platillos[];
    int posicion = 0;

    /**
     * Constructor del iterador para arreglos
     * @param platillos Arreglo de platillos por iterar
     */
    public ArrayIterator(Platillo platillos[]){
        this.platillos = platillos;
    }

    @Override
    public Platillo next() {
        Platillo platillo = platillos[posicion];
        posicion +=1;
        return platillo;
    }

    @Override
    public boolean hasNext(){
        if(posicion >= platillos.length || platillos[posicion] == null){
            return false;
        }else{
            return true;
        }
    }
}
