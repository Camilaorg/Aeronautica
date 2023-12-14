package c_aeronautica;
/**
  * @author Abril Camila Ortega García.
 */
public class avion {
    private String marca;
    private String modelo;
    private int año;
   
    public avion(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public String getMarca(){return marca;}
    public void setMarca(String marca){this.marca = marca;}
    public String getModelo(){return modelo;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public int getAño(){return año;}
    public void setAño(int año){this.año = año;}
    
    public void mostrarDatosAvion(){
        System.out.println("--Avion--");
        System.out.println("Marca: " + getMarca() + "\n" +
                            "Modelo: " + getModelo() + "\n" +
                            "Año: " + getAño());
    }
}
