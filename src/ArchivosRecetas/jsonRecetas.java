package ArchivosRecetas;

import SistemaRecetas.*;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class jsonRecetas {
    /**
     Metodo que escribe una receta a un archivo de texto.
     * Entrada:
     *  Receta - La receta que sera serializada a json.
     */
    public static void guardarNuevaReceta(Receta receta)
    {
        Gson gson = new Gson();
        String json = gson.toJson(receta);
        
        try 
        {
            FileWriter writer = new FileWriter("./Recetas/" + receta.getNombre() + ".txt");  
            writer.write(json);  
            writer.close();  

        } 
        catch (IOException e) 
        {  
            e.printStackTrace();  
        }  
        
        System.out.println(json);  
    }
    /**
     * Funcion que genera una lista de recetas a partir de los archivos en la carpeta "./Recetas/" y devuelve un ArrayList de recetas.
     * No tiene entradas.
     * Salidas:
     *  ArrayList de Recetas.
    */
    public static ArrayList<Receta> cargarRecetas() 
    {
        ArrayList<Receta> archivosRecetas = new ArrayList<>();
        File[] folder = new File("./Recetas").listFiles();
        Gson gson = new Gson();
        
        for (File archivoReceta : folder)
        {
            try 
            {
                archivosRecetas.add(gson.fromJson(new FileReader(archivoReceta.getAbsolutePath()), Receta.class));
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        
        return archivosRecetas;
    }
    
    /**
     Funcion que carga una receta a partir de la direccion del archivo.
     * Entrada:
     *  String - Direccion del archivo
     * Salida:
     *  Receta - Receta que se almacena en el archivo (null si no puede cargar el archivo).
     */
    public static Receta cargarReceta(String archivo)
    {
        Gson gson = new Gson();
        Receta receta = null;
        try
        {
            gson.fromJson(new FileReader(archivo), Receta.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return receta;        
    }
}
