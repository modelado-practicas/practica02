public interface Menu{
    /**
     * @param Platillo el Platillo a agregar al Menu
     */
    void agregarPlatillo(Platillo platillo);
    /**
     * @return Iterator para poder recorrer el menu
     */
    Iterator createIterator();
}