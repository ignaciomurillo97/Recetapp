package SistemaRecetas;

public class CantidadIngrediente {
    private String cantidad;
    private Ingrediente ingrediente;
 
    public CantidadIngrediente(String cantidad, Ingrediente ingrediente){
        this.cantidad = cantidad;
        this.ingrediente = ingrediente;       
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @return the ingrediente
     */
    public Ingrediente getIngrediente() {
        return ingrediente;
    }
    
    
}
