package SistemaRecetas;
public class Utensilio {    
    private String nombre;
    private boolean enCocina;
    
    public Utensilio (String nombre, boolean enCocina)
    {
        this.nombre = nombre;
        this.enCocina = enCocina;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the enCocina
     */
    public boolean isEnCocina() {
        return enCocina;
    }

    /**
     * @param enCocina the enCocina to set
     */
    public void setEnCocina(boolean enCocina) {
        this.enCocina = enCocina;
    }
}
