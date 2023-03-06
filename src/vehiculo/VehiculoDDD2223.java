
package vehiculo;

/**
 *
 * @author 
 */
public class VehiculoDDD2223 {

    /**
     * @return Nos devuelve una cadena con lo indicado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Indicamos el nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return nos devuelve el precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio indicamos el precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return devuelve el IVA del precio.
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA indicamos el IVA del precio.
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return devuelve el inventario.
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock indicamos el inventario.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor sin argumentos 
     */
    public VehiculoDDD2223 ()
    {
    }
    
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     */ 
    public VehiculoDDD2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   /**
    * metodo para asignar el nombre pasandolo como parametro.
    * @param nom el nombre a asignar
    */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
       /**
     * @return Nos devuelve el nombre.
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Metodo que nos devuelve el stock
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

   /**
    * Metodo que compra la cantidad indicada de vehiculos
    * @param cantidad nº de vehiculos a comprar
    * @throws Exception 
    */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
/**
 * Metodo que vende la cantidad indicada de vehiculos.
 * @param cantidad nº de vehiculos a vender.
 * @throws Exception 
 */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

