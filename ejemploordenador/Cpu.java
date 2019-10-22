package ejemploordenador;

/**
 *
 * @author mmartinezcosta
 */
public class Cpu {
    
    private int velocidad;
    private int memoria;
    
    public Cpu(){
        //constructor por defecto
    }
    
    public Cpu (int velocidad, int memoria){
        this.velocidad=velocidad;
        this.memoria=memoria;
    }
    
    // Métodos de acceso
    
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }
    
    public int getMemoria(){
        return memoria;
    }
    public void setMemoria(int memoria){
        this.memoria=memoria;
    }
        
}
