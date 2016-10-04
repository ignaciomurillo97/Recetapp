package SistemaRecetas;

import java.awt.FontFormatException;
import java.io.IOException;
import java.util.ArrayList;
import ArchivosRecetas.*;

public class SistemaRecetas {
    private static ArrayList<Receta> recetas; 
    private static ArrayList<Utensilio> utensilios;
    private static ArrayList<Ingrediente> ingredientes;
    private static ArrayList<Etiqueta> etiquetas;
    public static GUIControllerSingleton guiController;
    
    public static void main(String[] args) throws FontFormatException, IOException {
        
        recetas = new ArrayList<>();
        utensilios = new ArrayList<>();
        ingredientes = new ArrayList<>();
        etiquetas = new ArrayList<>();
        
        /*
            cargar las listas con JSON
        */
        
        guiController = GUIControllerSingleton.getInstance();                
        
        etiquetas.add(new Etiqueta("etiqueta1"));        
        utensilios.add(new Utensilio("utensilio1", false));
        ingredientes.add(new Ingrediente("ingrediente1", false, null));
        recetas.add(new Receta("receta1"));
        
        guiController.setEtiquetas(etiquetas);
        guiController.setUtensilios(utensilios);
        guiController.setIngredientes(ingredientes);
        guiController.setRecetas(recetas);
        
        guiController.mostrarVentanaPrincipal();
        
        etiquetas.add(new Etiqueta("etiqueta2"));
        guiController.setEtiquetas(etiquetas);
        guiController.actualizarEtiquetas();
        
                
        
    }
    
    public static void agregarReceta(Receta receta)
    {
        recetas.add(receta);
    }
    
    public static void eliminarReceta(Receta receta)
    {
        recetas.remove(receta);
    }        
}
