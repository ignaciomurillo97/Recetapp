
package SistemaRecetas;

public class Ingrediente {
    private String nombreIngrediente;
    private boolean enAlacena;
    private Etiqueta etiqueta;
    
    public Ingrediente(String nobreIngrediente, boolean enAlacena, Etiqueta etiqueta){
        this.nombreIngrediente = nombreIngrediente;
        this.enAlacena = enAlacena;
        this.etiqueta = etiqueta;
        
    }
}
