package SistemaRecetas;

import java.util.ArrayList;

public class Receta {
    private enum Dificultad {
        Facil, Medio, Dificil
    }
    
    private String nombre;
    private String preparacion;      
    
    private Dificultad dificultadReceta;
    
    private double duracionAproximada;
    private String porciones;
    private ArrayList<String> Fotos;
    
    private ArrayList<CantidadIngrediente> cantidadesIngredientes;
    private ArrayList<Etiqueta> etiquetas;
    private ArrayList<Utensilio> utensiliosRequeridos;
    
    public Receta(String nombre)
    {
        this.nombre = nombre;
        preparacion = "";
        
        dificultadReceta = Dificultad.Facil;
        
        duracionAproximada = 0;
        porciones = "";
        Fotos = new ArrayList<>();
        cantidadesIngredientes = new ArrayList<>();
        etiquetas = new ArrayList<>();
        utensiliosRequeridos = new ArrayList<>();
    }
    
    public String getNombre () 
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public double getDuracionAproximada() {
        return duracionAproximada;
    }

    public void setDuracionAproximada(double duracionAproximada) {
        this.duracionAproximada = duracionAproximada;
    }

    public String getPorciones() {
        return porciones;
    }

    public void setPorciones(String porciones) {
        this.porciones = porciones;
    }

    public ArrayList<String> getFotos() {
        return Fotos;
    }

    public void setFotos(ArrayList<String> Fotos) {
        this.Fotos = Fotos;
    }

    public ArrayList<CantidadIngrediente> getCantidadesIngredientes() {
        return cantidadesIngredientes;
    }

    public void setCantidadesIngredientes(ArrayList<CantidadIngrediente> cantidadesIngredientes) {
        this.cantidadesIngredientes = cantidadesIngredientes;
    }

    public ArrayList<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public ArrayList<Utensilio> getUtensiliosRequeridos() {
        return utensiliosRequeridos;
    }

    public void setUtensiliosRequeridos(ArrayList<Utensilio> utensiliosRequeridos) {
        this.utensiliosRequeridos = utensiliosRequeridos;
    }        
}


