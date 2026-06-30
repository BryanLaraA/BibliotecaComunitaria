/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devoluciones;

import java.time.LocalDate;
import usuarios.Usuario;
import materialesBibliograficos.Materialbibliografico;

/**
 *
 * @author Lennox
 */
public class Devolucion {

    private LocalDate fechaDevolucion;
    private LocalDate fechaMaximadeDevo;
    private Usuario ususarios[];
    private Materialbibliografico material;

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaMaximadeDevo() {
        return fechaMaximadeDevo;
    }

    public void setFechaMaximadeDevo(LocalDate fechaMaximadeDevo) {
        this.fechaMaximadeDevo = fechaMaximadeDevo;
    }

    public Materialbibliografico getMaterial() {
        return material;
    }

    public void setMaterial(Materialbibliografico material) {
        this.material = material;
    }

    public Usuario[] getUsusarios() {
        return ususarios;
    }

    public void setUsusarios(Usuario[] ususarios) {
        this.ususarios = ususarios;
    }

    public Devolucion(LocalDate fechaDevolucion, LocalDate fechaMaximadeDevo, Usuario[] ususarios, Materialbibliografico material) {
        this.fechaDevolucion = fechaDevolucion;
        this.fechaMaximadeDevo = fechaMaximadeDevo;
        this.ususarios = ususarios;
        this.material = material;
    }
    
    

}
