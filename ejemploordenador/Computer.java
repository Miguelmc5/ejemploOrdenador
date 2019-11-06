package ejemploordenador;

/**
 *
 * @author mmartinezcosta
 */
public class Computer {

    private Mouse mouse;
    private Screen screen;
    private Cpu processor;

    /**
     * is the default constructor
     */
    public Computer() {
        //default constructor
        mouse = new Mouse();
        screen = new Screen();
        processor = new Cpu();
    }

    //parameter constructor
    /**
     *
     * @param tipo returns the value of the type in this class
     * @param marca it gives me the value of the brand in this class
     * @param pulgadas it tells me the value of the inches in this class
     * @param velocidad it tells me the speed value in this class
     * @param memoria it returns the value of memory in this class
     */
    public Computer(String tipo, String marca, float pulgadas, int velocidad, int memoria) {
        mouse = new Mouse(tipo);
        screen = new Screen(marca, pulgadas);
        processor = new Cpu(velocidad, memoria);
    }

//Métodos de acceso
    /**
     *
     * @return the value of mouse
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     * returns the value of mouse in this class
     *
     * @param mouse kind of mouse
     */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     *
     * @return screen value
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     *
     * @param screen model and screen size
     */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    /**
     *
     * @return CPU value
     */
    public Cpu getCpu() {
        return processor;
    }

    /**
     *
     * @param procesador how much ram does it have, and the clock speed
     */
    public void setCpu(Cpu procesador) {
        this.processor = procesador;
    }

    /**
     * display the parameter values ​​with null value
     */
    public void show() {
        System.out.println("El ordenador tiene un ratón de tipo: " + mouse.getTipo() + "\n Un monitor de la marca: " + screen.getMarca() + ", y de: " + screen.getPulgadas() + " pulgadas \n Y una CPU con velocidad: " + processor.getVelocidad() + ", y una memoria de: " + processor.getMemoria());
    }

}
