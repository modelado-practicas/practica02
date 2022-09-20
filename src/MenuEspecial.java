import java.util.Hashtable;

public class MenuEspecial implements Menu{
    private Hashtable<Integer,Hamburguesa> tabla;
    int posicion = 1;
    /**
     * Constructor del menu Especial
     */
    public MenuEspecial() {
        tabla = new Hashtable<Integer,Hamburguesa>();

        Hamburguesa hamburguesa1 = new CientoTreceDeluxe();
        this.agregarPlatillo(hamburguesa1);
        Hamburguesa hamburguesa2 = new DobleTripleEnBalsaDecordadoDeLujo();
        this.agregarPlatillo(hamburguesa2);
        Hamburguesa hamburguesa3 = new McPolloAsado();
        this.agregarPlatillo(hamburguesa3);
    }

    @Override
    public void agregarPlatillo(Hamburguesa platillo) {
        tabla.put(posicion, platillo);
    }

    @Override
    public Iterator createIterator() {
        return new HashtableIterator(tabla);
    }
}
