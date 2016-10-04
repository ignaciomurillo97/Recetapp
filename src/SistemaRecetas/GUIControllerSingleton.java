package SistemaRecetas;

import SistemaRecetas.Ventanas.*;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.ArrayList;

public class GUIControllerSingleton {
    
    private static GUIControllerSingleton controller;
    
    private Home home; 
    private EditarReceta editarRecetas;
    
    // listas
    private ArrayList<Etiqueta> etiquetas; 
    private ArrayList<Utensilio> utensilios; 
    private ArrayList<Ingrediente> ingredientes; 
    private ArrayList<Receta> recetas;

    /**
     * @return the etiquetas
     */
    public ArrayList<Etiqueta> getEtiquetas() {        
        return etiquetas;
    }

    /**
     * @param aEtiquetas the etiquetas to set
     */
    public void setEtiquetas(ArrayList<Etiqueta> aEtiquetas) {        
        etiquetas = aEtiquetas;        
    }

    /**
     * @return the utensilios
     */
    public ArrayList<Utensilio> getUtensilios() {
        return utensilios;
    }

    /**
     * @param aUtensilios the utensilios to set
     */
    public void setUtensilios(ArrayList<Utensilio> aUtensilios) {
        utensilios = aUtensilios;        
    }

    /**
     * @return the ingredientes
     */
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param aIngredientes the ingredientes to set
     */
    public void setIngredientes(ArrayList<Ingrediente> aIngredientes) {
        ingredientes = aIngredientes;        
    }

    /**
     * @return the recetas
     */
    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    /**
     * @param aRecetas the recetas to set
     */
    public void setRecetas(ArrayList<Receta> aRecetas) {
        recetas = aRecetas;        
    }
    
    
    private GUIControllerSingleton ()
    {
        home = null;
        editarRecetas = null;
    }
    
    public static GUIControllerSingleton getInstance() 
    {
        if (controller == null)      
            controller = new GUIControllerSingleton();
        
        return controller;
    }
    
    public void mostrarVentanaEditarReceta() 
    {
        if (editarRecetas == null) editarRecetas = new EditarReceta();
        editarRecetas.show();
    }
    
    public void mostrarVentanaPrincipal () throws FontFormatException, IOException
    {
        if(home == null) home = new Home();
        home.show();
    }
    
    public void mostrarVentanaRecetas ()
    {
        if (editarRecetas == null) editarRecetas = new EditarReceta();
        editarRecetas.show();
    }
    
    public Home getHome() throws FontFormatException, IOException
    {
        if (home == null) home = new Home();
        return home;
    }
    
    public void actualizarEtiquetas()
    {
        home.actualizarEtiquetas();
    }
    
    public EditarReceta getVentanaRecetas ()
    {
        if (editarRecetas == null) editarRecetas = new EditarReceta();
        return editarRecetas;
    }
}
