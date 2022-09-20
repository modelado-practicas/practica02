package preparacion;

import java.util.Hashtable;

public class MenuEspecial implements Menu{
    private Hashtable<Integer,Platillo> tabla;
    int posicion = 1;
    /**
     * Constructor del menu Especial
     */
    public MenuEspecial() {
        tabla = new Hashtable<Integer,Platillo>();
    }

    @Override
    public void agregarPlatillo(Platillo platillo) {
        tabla.put(posicion, platillo);
    }

    @Override
    public Iterator createIterator() {
        return new HashtableIterator(tabla);
    }
}
