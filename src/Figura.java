/**
 *
 * @author Jesus Ivan
 */
public abstract class Figura implements Dibujable{
    private int x1;
    private int y1;
    private int largo;
    private int ancho;
    
    public Figura(int x1, int y1, int largo, int ancho){
        cambiarPosicion(x1, y1);
        cambiarTamaño(largo, ancho);
    }
    
    public void cambiarPosicion(int x1, int y1){
        this.setX1(x1);
        this.setY1(y1);
    }
    
    public void cambiarTamaño(int largo, int ancho){
        this.setLargo(largo);
        this.setAncho(ancho);
    }

    
    //**MÉTODOS set Y get
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}