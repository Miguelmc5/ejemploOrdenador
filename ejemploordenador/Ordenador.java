package ejemploordenador;

/**
 *
 * @author mmartinezcosta
 */
public class Ordenador {
  
    private Raton raton;
    private Monitor monitor;
    private Cpu procesador;
/**
 * es el constructor por defecto
 */
public Ordenador(){
    //constructor por defecto
    raton=new Raton();
    monitor=new Monitor();
    procesador= new Cpu();
}

    //constructor con parametros
/**
 * 
 * @param tipo me devuelve el valor del tipo en esta clase 
 * @param marca me duelve el valor de la marca en esta clase
 * @param pulgadas me duelve el valor de la pulgadas en esta clase
 * @param velocidad me duelve al valor de la velocidad en esta clase
 * @param memoria me devuelve el valor de la memoria en esta clase
 */
public Ordenador (String tipo, String marca, float pulgadas, int velocidad, int memoria){
    raton=new Raton(tipo);
    monitor=new Monitor(marca, pulgadas);
    procesador=new Cpu(velocidad, memoria);
}

//Métodos de acceso

/**
 * 
 * @return el valor de raton
 */
public Raton getRaton(){
    return raton;
}
/**
 * 
 * @param raton me devuelve el valor de raton en esta clase
 */
public void setRaton(Raton raton){
    this.raton=raton;
}
/**
 * 
 * @return 
 */
public Monitor getMonitor(){
    return monitor;
}
public void setMonitor(Monitor monitor){
    this.monitor=monitor;
}

public Cpu getCpu(){
    return procesador;
}
public void setCpu(Cpu procesador){
    this.procesador=procesador;
}
/**
 * visualiza con valor nulo los valores de los parámetros
 */
public void amosar(){
        System.out.println("El ordenador tiene un ratón de tipo: "+raton.getTipo()+"\n Un monitor de la marca: "+monitor.getMarca()+", y de: "+monitor.getPulgadas()+" pulgadas \n Y una CPU con velocidad: "+procesador.getVelocidad()+", y una memoria de: "+procesador.getMemoria());
    }

}
