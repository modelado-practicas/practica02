import preparacion.Hamburguesa;

import preparacion.Hamburguesa;

public interface Menu{
    /**
     * @param hamburguesa La hamburguesa a agregar al Menu
     */
    void agregarHamburguesa(Hamburguesa hamburguesa);
    /**
     * @return Iterator para poder recorrer el menu
     */
    Iterator createIterator();
}