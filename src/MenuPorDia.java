import java.util.ArrayList;

public class MenuPorDia implements Menu{
    
    private ArrayList<Hamburguesa> lista;
    /**
     * 
     */
    public MenuPorDia() {
        lista = new ArrayList<Hamburguesa>();

        Hamburguesa hamburguesa1 = new QuesoHamburguesa();
        this.agregarPlatillo(hamburguesa1);
        Hamburguesa hamburguesa2 = new CientoTreceGramos();
        this.agregarPlatillo(hamburguesa2);
        Hamburguesa hamburguesa3 = new HamburguesaDeAvena();
        this.agregarPlatillo(hamburguesa3);
    }

    @Override
    public void agregarPlatillo(Hamburguesa platillo) {
        lista.add(platillo);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(lista);
    }
}
