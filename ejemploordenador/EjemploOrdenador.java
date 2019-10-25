package ejemploordenador;

import java.util.*;
/**
 *
 * @author mmartinezcosta
 */
public class EjemploOrdenador {

 
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ordena=new Scanner (System.in);
    
        Ordenador pc=new Ordenador();
    pc.amosar();
    
        System.out.println("Tipo de ratón: ");
    String tipo=ordena.next();
    
        System.out.println("Marca del monitor: ");
    String marca=ordena.next();
        System.out.println("Tamaño en pulgadas del monitor: ");
    float pulgadas=ordena.nextFloat();
    
        System.out.println("La velocidad del procesador es de: ");
    int velocidad=ordena.nextInt();
        System.out.println("La memoria del procesador es de:");
    int memoria=ordena.nextInt();
    
    
    
    Raton rato= new Raton(tipo);
    Monitor pt = new Monitor(marca,pulgadas);
    Cpu cpu= new Cpu(velocidad,memoria);
    Ordenador pc2=new Ordenador("cable", "asus", 21.5f, 3, 24);
        System.out.println("El raton es de tipo: "+pc2.getRaton());
    
    
    
    
    }
    
}
