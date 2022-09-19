import preparacion.Hamburguesa;

public class MenuGeneral implements Menu{
    private Hamburguesa[] platillos;
    private int items = 0;
    /**
     * 
     */
    public MenuGeneral() {
    platillos = new Hamburguesa[10];
    }

    @Override
    public void agregarHamburguesa(Hamburguesa hamburguesa) {
        platillos[items] = hamburguesa;
        items += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(platillos);
    }
    
}
