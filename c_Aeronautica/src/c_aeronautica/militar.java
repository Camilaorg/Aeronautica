package c_aeronautica;
/**
  * @author Abril Camila Ortega García.
 */
public class militar {
    private String nombre;
    private int rango;
    private boolean pilotea;
    
    public militar(String nombre, int rango, boolean pilotea){
        this.nombre = nombre;
        this.rango = rango;
        this.pilotea = pilotea;
    }
    
    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){this.nombre = nombre;}
    public int getRango(){return rango;}
    public void setRango(int edad){this.rango = rango;}
    public boolean getPilotea(){return pilotea;}
    public void setGenero(boolean pilotea){this.pilotea = pilotea;}
    
    public void mostrarDatos(){
        System.out.println("--Militar--");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Rango: " + getRango());
        System.out.println("Puede pilotear: " + (getPilotea() ? "SI" : "NO"));
    
    }
}
