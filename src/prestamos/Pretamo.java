/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamos;
import java.time.LocalDate;
import java.util.Arrays;
import usuarios.Usuario;
import materialesBibliograficos.Materialbibliografico;
/**
 *
 * @author Lennox
 */
public class Pretamo {
    private LocalDate fechaPrestamo;
    private LocalDate prestamoAtrasado;
    private LocalDate calcularAtraso;
    private Usuario ususarios [];
    private Materialbibliografico material;
    

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getPrestamoAtrasado() {
        return prestamoAtrasado;
    }

    public LocalDate getCalcularAtraso() {
        return calcularAtraso;
    }

    public Usuario[] getUsusarios() {
        return ususarios;
    }

    public Materialbibliografico getMaterial() {
        return material;
    }
    

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setPrestamoAtrasado(LocalDate prestamoAtrasado) {
        this.prestamoAtrasado = prestamoAtrasado;
    }

    public void setCalcularAtraso(LocalDate calcularAtraso) {
        this.calcularAtraso = calcularAtraso;
    }

    public void setUsusarios(Usuario[] ususarios) {
        this.ususarios = ususarios;
    }

    public void setMaterial(Materialbibliografico material) {
        this.material = material;
    }
    

    public Pretamo(LocalDate fechaPrestamo, LocalDate prestamoAtrasado, LocalDate calcularAtraso, Usuario[] ususarios, Materialbibliografico material) {
        this.fechaPrestamo = fechaPrestamo;
        this.prestamoAtrasado = prestamoAtrasado;
        this.calcularAtraso = calcularAtraso;
        this.ususarios = ususarios;
        this.material = material;
    }

    
    public void ResultadosPrestamo(){
        System.out.println("El material prestado: "+ material);
        System.out.println("Fecha del Prestamo: " + fechaPrestamo);
        System.out.println("Usuario que pidio el material: " + Arrays.toString(ususarios));
        
    }
    
}
