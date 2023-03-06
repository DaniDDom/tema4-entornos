
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoDDD2223 miVehiculoDDD2223;
        int stockActual;
        
        miVehiculoDDD2223 = new VehiculoDDD2223("Seat",18000,100);
        operativaVehiculosDDD2223(miVehiculoDDD2223, 50); 
    }

    public static void operativaVehiculosDDD2223(VehiculoDDD2223 miVehiculoDDD2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoDDD2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoDDD2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoDDD2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

}
    
