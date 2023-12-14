package c_aeronautica;
/**
 * @author Abril Camila Ortega García.
 */
public class main {
   public static void main(String[] args) {
       militar miMilitar = new militar("Lucas Lee", 10, true);
       miMilitar.mostrarDatos();
       
       avion miAvion = new avion("Avion de Lucas", "Modelo nuevo", 2020);
       miAvion.mostrarDatosAvion();
   }
}
