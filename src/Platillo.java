package preparacion;

public class Platillo {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private boolean queso;
    private boolean vegetariano;
    
    /**
     * Constructor del Platillo
     * @param id id del platillo
     * @param nombre nombre del platillo
     * @param descripcion descripcion del platillo
     * @param precio precio del platillo
     * @param queso booleano, True si el platillo lleva queso
     * @param vegetariano booleano, True si el platillo es vegetariano
     */
    public Platillo(int id, String nombre, String descripcion, float precio, boolean queso, boolean vegetariano) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.queso = queso;
        this.vegetariano = vegetariano;
    }

    /**
     * @return el id del platillo
     */
    public int getId() {
        return id;
    }

    /**
     * @return el nombre del platillo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return la descripcion del platillo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return el precio del platillo
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @return True si contiene queso
     */
    public boolean isQueso() {
        return queso;
    }

    /**
     * @return True si es Vegetariano
     */
    public boolean isVegetariano() {
        return vegetariano;
    }

    
}
