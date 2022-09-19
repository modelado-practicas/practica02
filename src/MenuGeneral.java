public class MenuGeneral implements Menu{
    private Platillo platillos[];
    private int items = 0;
    /**
     * 
     */
    public MenuGeneral() {
    platillos = new Platillo[3]; //Tamanio minimo 3, Cambiable!!
    }

    @Override
    public void agregarPlatillo(Platillo platillo) {
        platillos[items] = platillo;
        items += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(platillos);
    }
    
}
