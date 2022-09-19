public interface Iterator{
    /**
     * metodo para regresar el siguiente elemento
     * @return La siguente Hamburguesa
     */
    Platillo next();
    /**
     * metodo para saber si existe un siguiente elemento
     * @return True si Hay un sigueinte elemento
     */
    boolean hasNext();
}
