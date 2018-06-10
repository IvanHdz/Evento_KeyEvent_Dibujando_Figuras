/**
 *
 * @author Jesus Ivan
 */
import java.awt.Graphics;

public class Ovalo extends Figura{
    public Ovalo(int x1, int y1, int largo, int ancho){
        super(x1, y1, largo, ancho);
    }
    
    public void dibujar(Graphics g){
        g.drawOval(getX1(), getY1(), getLargo(), getAncho());
    }
}