import java.awt.Graphics;

public class Linea implements Dibujable{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Linea(int x1, int y1, int x2, int y2){
        cambiarPosicion(x1, y1);
        cambiarTamaño(x2, y2);
    }
    
    public void cambiarPosicion(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void cambiarTamaño(int x2, int y2){
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void dibujar(Graphics g){
        g.drawLine(x1, y1, x2, y2);
    }
}