package ejemploordenador;

/**
 *
 * @author mmartinezcosta
 */
public class Ordenador {
  
    private Raton raton;
    private Monitor monitor;
    private Cpu procesador;

public Ordenador(){
    //constructor por defecto
    raton=new Raton();
    monitor=new Monitor();
    procesador= new Cpu();
}

    //constructor con parametros

public Ordenador (String tipo, String marca, float pulgadas, int velocidad, int memoria){
    raton=new Raton(tipo);
    monitor=new Monitor(marca, pulgadas);
    procesador=new Cpu(velocidad, memoria);
}

//Métodos de acceso

public Raton getRaton(){
    return raton;
}
public void setRaton(Raton raton){
    this.raton=raton;
}

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

public void amosar(){
        System.out.println("El ordenador tiene un ratón de tipo: "+raton.getTipo()+"\n Un monitor de la marca: "+monitor.getMarca()+", y de: "+monitor.getPulgadas()+" pulgadas \n Y una CPU con velocidad: "+procesador.getVelocidad()+", y una memoria de: "+procesador.getMemoria());
    }

}
