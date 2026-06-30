
package usuarios;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
    
    private double identificacion;
    private String nombrecompleto;
    private LocalDate fechadenacimiento;
    private double telefono;
    private String correoelectronico;
    private String direccion;
    private LocalDate edad;

    public double getIdentificacion() {
        return identificacion;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }
    
    public Period getEdad(){
        return Period.between(fechadenacimiento,LocalDate.now());
    }

    public double getTelefono() {
        return telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario(double identificacion, String nombrecompleto, LocalDate fechadenacimiento, double telefono, String correoelectronico, String direccion) {
        this.identificacion = identificacion;
        this.nombrecompleto = nombrecompleto;
        this.fechadenacimiento = fechadenacimiento;
        this.telefono = telefono;
        this.correoelectronico = correoelectronico;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "identificacion="
                + identificacion + ", nombrecompleto="
                + nombrecompleto + ", fechadenacimiento=" 
                + fechadenacimiento + ", telefono=" 
                + telefono + ", correoelectronico=" 
                + correoelectronico + ", direccion=" 
                + direccion + ", edad="
                + edad + '}';
    }
    
    
    
    
    
}
