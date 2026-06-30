
package materialesBibliograficos;
import java.time.LocalDate;
import materialesBibliograficos.Materialbibliografico;
public class RecursoDigital extends Materialbibliografico{
    
    private String formato;
    private String tamaño;
    private int enlaceacceso;

    public String getFormato() {
        return formato;
    }

    public String getTamaño() {
        return tamaño;
    }

    public int getEnlaceacceso() {
        return enlaceacceso;
    }
    
    public double getVerificarAccesoDisponible(){
        return verificarAccesoDisponible();
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setEnlaceacceso(int enlaceacceso) {
        this.enlaceacceso = enlaceacceso;
    }
    
    
    
    public double verificarAccesoDisponible(){
        if (enlaceacceso == -1){
            System.out.println("No hay enlace disponible");
        }
       return  
    }
    

    
    public RecursoDigital(int codigo, String titulo, String autor, LocalDate añoPublicacion, String categoria, boolean estadoDisponibilidad) {
        super(codigo, titulo, autor, añoPublicacion, categoria, estadoDisponibilidad);
    }
    
    
    
}
