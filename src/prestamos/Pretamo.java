/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamos;
import 
/**
 *
 * @author Student
 */
public class Pretamo {
    String usuario;
    String fechaPrestamo;
    String prestamoAtrasado;
    String calcularAtraso;

    public Pretamo(String usuario, String fechaPrestamo, String prestamoAtrasado, String calcularAtraso) {
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.prestamoAtrasado = prestamoAtrasado;
        this.calcularAtraso = calcularAtraso;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getPrestamoAtrasado() {
        return prestamoAtrasado;
    }

    public String getCalcularAtraso() {
        return calcularAtraso;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setPrestamoAtrasado(String prestamoAtrasado) {
        this.prestamoAtrasado = prestamoAtrasado;
    }

    public void setCalcularAtraso(String calcularAtraso) {
        this.calcularAtraso = calcularAtraso;
    }
    
    
    
    
}
