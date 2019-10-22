package ejemploordenador;

/**
 *
 * @author mmartinezcosta
 */
public class Raton {
    private String tipo;

public Raton () {
//constructor por defecto  
}

public Raton (String tipo){
    this.tipo=tipo;
}

// Métodos de acceso

public String getTipo(){
    return tipo;
}
public void setTipo(String tipo){
    this.tipo=tipo;
}



}