public class MenuGeneral implements Menu{
    private Hamburguesa platillos[];
    private int items = 0;
    /**
     * 
     */
    public MenuGeneral() {
        platillos = new Hamburguesa[3];

        Hamburguesa hamburguesa1 = new HamburguesaClasica();
        this.agregarPlatillo(hamburguesa1);
        Hamburguesa hamburguesa2 = new MacGrande();
        this.agregarPlatillo(hamburguesa2);
        Hamburguesa hamburguesa3 = new HamburguesaDeSoya();
        this.agregarPlatillo(hamburguesa3);
    }

    @Override
    public void agregarPlatillo(Hamburguesa platillo) {
        platillos[items] = platillo;
        items += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(platillos);
    }
    
}
