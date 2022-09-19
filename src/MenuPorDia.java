import java.util.ArrayList;

import preparacion.Hamburguesa;

public class MenuPorDia implements Menu{
    
    private ArrayList<Hamburguesa> lista;
    /**
     * 
     */
    public MenuPorDia() {
    lista = new ArrayList<Hamburguesa>();
    }

    @Override
    public void agregarHamburguesa(Hamburguesa hamburguesa) {
        lista.add(hamburguesa);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(lista);
    }
}
