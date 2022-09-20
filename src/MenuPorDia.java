package preparacion;

import java.util.ArrayList;

public class MenuPorDia implements Menu{
    
    private ArrayList<Platillo> lista;
    /**
     * 
     */
    public MenuPorDia() {
    lista = new ArrayList<Platillo>();
    }

    @Override
    public void agregarPlatillo(Platillo platillo) {
        lista.add(platillo);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(lista);
    }
}
