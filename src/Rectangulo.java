
/**
 *
 * @author Jesus Ivan
 */
import java.awt.Graphics;

public class Rectangulo extends Figura{
    public Rectangulo(int x1, int y1, int largo, int ancho){
        super(x1, y1, largo, ancho);
    }
    
    public void dibujar(Graphics g){
        g.drawRect(getX1(), getY1(), getLargo(), getAncho());
    }
}