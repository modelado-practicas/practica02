import preparacion.Hamburguesa;

public interface Iterator{
    /**
     * @return La siguente Hamburguesa
     */
    Hamburguesa next();
    /**
     * @return True si Hay un sigueinte elemento
     */
    boolean hasNext();
}
