/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materialesBibliograficos;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public abstract class Materialbibliografico {
    protected int codigo; 
    protected String titulo; 
    protected String autor; 
    protected LocalDate añoPublicacion; 
    protected String categoria; 
    protected boolean estadoDisponibilidad;

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public Materialbibliografico (int codigo, String titulo, String autor, LocalDate añoPublicacion, String categoria, boolean estadoDisponibilidad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.categoria = categoria;
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    
}


