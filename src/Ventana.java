/**
 *
 * @author Jesus Ivan
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{
    private Container contenedor;
    private MiPanel miPanel;
    private JLabel informacion;
    private JLabel nombreFigura;
    private String teclaOprimida;
    
    public Ventana(){
        super("Viruz Blog: Dibujar con KeyEvent");
        contenedor = getContentPane();
        setSize(500, 500);
        setBackground(Color.YELLOW);
        
        addComponentes();
        addEventos();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
        public void addComponentes(){
        String info = new String("Círculo (c) - Óvalo (o) - " +
                "Rectángulo (r) - Línea (l)");
        
        informacion = new JLabel(info);
        nombreFigura = new JLabel("Figura predeterminada: Círculo");
        miPanel = new MiPanel();
        miPanel.setBackground(Color.WHITE);
        
        contenedor.add(miPanel, BorderLayout.CENTER);
        contenedor.add(informacion, BorderLayout.NORTH);
        contenedor.add(nombreFigura, BorderLayout.SOUTH);
    }
        public void addEventos(){
            addKeyListener(new KeyAdapter(){
           //keyPressed maneja el evento cuando se oprime el botón del teclado
            @Override
                public void keyPressed(KeyEvent e){
            //getKetText Regresa un String y getKeyCode Devuelve el entero 
            //clave de código.
               teclaOprimida = e.getKeyText(e.getKeyCode());
            
            if(teclaOprimida.equals("O")){
                miPanel.setFiguraDibujar(2);
                nombreFigura.setText("Óvalo");
                
            }else if(teclaOprimida.equals("R")){
                miPanel.setFiguraDibujar(3);
                nombreFigura.setText("Rectángulo");
                
            }else if(teclaOprimida.equals("L")){
                miPanel.setFiguraDibujar(4);
                nombreFigura.setText("Línea");
                
            }else{
                miPanel.setFiguraDibujar(1);
                nombreFigura.setText("Círculo");
                 }
                }
            });
            //Evento de Raton
            addMouseListener(new MouseAdapter(){
          //mousePressed maneja el evento cuando se oprime el botón del ratón.
            @Override
                public void mousePressed(MouseEvent e){
                 //Indica la posicion del Puntero a empezar a dibujar.
                  miPanel.setX1(e.getX() - 8);
                  miPanel.setY1(e.getY() - 45);
            
             if(teclaOprimida.equals("L")){
                 miPanel.setLargo(miPanel.getX1());
                 miPanel.setAncho(miPanel.getY1());
             }else{
                 miPanel.setLargo(e.getX() - miPanel.getX1() - 8);
                 miPanel.setAncho(e.getY() - miPanel.getY1() - 45);
             }
                  miPanel.dibujar();
           }
         });
      //mouseDragged maneja el evento cuando el usuario arrastra el ratón con el 
      //botón oprimido.
         addMouseMotionListener(new MouseMotionAdapter(){
            @Override
             public void mouseDragged(MouseEvent e){
            
             if(teclaOprimida.equals("L")){
                miPanel.setLargo(e.getX() - 8);
                miPanel.setAncho(e.getY() - 45);
            }else{
                miPanel.setLargo(e.getX() - miPanel.getX1() - 8);
                miPanel.setAncho(e.getY() - miPanel.getY1() - 45);
            }
                
            miPanel.dibujar();
        }
         });
     }
}