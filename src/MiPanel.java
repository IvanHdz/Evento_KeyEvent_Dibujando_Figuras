import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MiPanel extends JPanel {
    private int x1;
    private int y1;
    private int ancho;
    private int largo;
    private int figuraDibujar;
    private Dibujable figura;
    //private final son valores constantes.
    private final int CIRCULO = 1;
    private final int OVALO = 2;
    private final int RECTANGULO = 3;
    private final int LINEA = 4;
        
    public MiPanel(){
        x1 = 0;
        y1 = 0;
        ancho = 1;
        largo = 1;
        figuraDibujar = 1;
    }
    
    @Override
        public void paintComponent(Graphics g){
        //Esta sentencia te Permite Volver a pintar y utilizar Repaint()
       super.paintComponent(g);
        
        g.setColor(Color.BLUE);
        
        switch(getFiguraDibujar()){
            case CIRCULO: figura = new Circulo(getX1(),getY1(),getLargo());
                    break;
            case OVALO: figura = new Ovalo(getX1(), getY1(),getLargo(),getAncho());
                    break;
            case RECTANGULO: figura = new Rectangulo(getX1(), getY1(),getLargo(),getAncho());
                    break;
            case LINEA: figura = new Linea(getX1(), getY1(),getLargo(),getAncho());
                    break;
        }
        
        figura.dibujar(g);
    }
      public void dibujar(){
        repaint();
    }
      
    //*MÉTODOS set asginan Valores Y get Regresan Valores
      //Sirven para asignar nuevos valores cuando se dibujan varias veces.
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

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getFiguraDibujar() {
        return figuraDibujar;
    }

    public void setFiguraDibujar(int figuraDibujar) {
        this.figuraDibujar = figuraDibujar;
    }

}