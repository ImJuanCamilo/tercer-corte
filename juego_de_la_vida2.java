//codigo del profesor documentado y estudiado //
package codigos;                 // paquete donde se encuentran las clases y los codigos //

import java.awt.*;               /*     librerias
import java.awt.event.*;            para la ejecucion de
import java.awt.geom.*;             interfaces graficas */
import javax.swing.*;


public class GUI_Matrix extends JApplet {       // nombre de la clase y extencion necesariapara interfaz grafica //
	
private static final long serialVersionUID = 1L;  // (serialVersionUID) previene errores en la deserialización 
	
	
	private int ca_lenght = 60;    //se define el tamaño de las celulas //
	private int screen_size = 600; //tamaño del cuadro de pantalla //
	private int delay_time = 280;  //tiempo de esera para cambio de pantalla (for)// 
	
	
	/*
	  este metodo es la configuracion de la extencion applet
	 */
	public void init()    // se declara un metodo init (inicial) para la interfaz //
    {
        setSize(screen_size, screen_size);   //Define el tamaño de la pantalla //
		setBackground(Color.white);              //Define el color del applet inicial //
    }
 	
	
	/**
	 * aqui se muestra la manera en que se pintan las celulas 
	 */
    public void paint(Graphics g)  // metodo para pintar definido como graficas g //
    {
    	Graphics2D g2 = (Graphics2D) g;  // se crea un objeto que dibura todas las casillas //
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);   // define la consecucion para graficar con la libreria awt //
 
        //coordenadas de el cuadro inicial del juego de la vida //
        int x = 0;
        int y = 0;
        
        //formula para el tamaño de cada cuadro //
        int square_size = screen_size / ca_lenght;
 
        //se crea el objeto para generar la matriz //
        MatrixGenerator cellular_automata = new MatrixGenerator();
        
        //mientras la aplicacion esta abierta
        while(true) // es verdadero //
        {
        	int[][] matrix = cellular_automata.generate(ca_lenght); //genera la matriz
        	
        	y = 0; //inicia en //
        	
        	//ciclo for para moverse por toda la matriz //
        	for(int i = 0; i < ca_lenght; i++)
        	{
        		//inicia en la posicion izquierda //
        		x = 0;
        		for(int j = 0; j < ca_lenght; j++)
        		{
        			//si la posicion en la matriz en cero, pinte el cuadro de color negro //
	    		   if(matrix[i][j] == 0)
	    		   {
	    			   g2.setPaint(Color.BLACK); 
	    		   }
	    		   else  //si la posicion en la matriz en uno, pinte el cuadro de color blanco //
	    		   {
	    			   g2.setPaint(Color.WHITE);
	    		   }
    		   
	    		   //pinte el cuadro en la posicion y coordenada ..//
	    		   g2.fill(new Rectangle2D.Double(x, y, square_size, square_size));
	    		   
	    		   x += square_size; //mover a la siguiente coordenada en sentido horizontal //
	    		}
        		
        		y += square_size; //mover a la siguiente coordenada en sentido vertical //
        	}
       
        	//Delay tiempo para redibujar la matriz 
        	try 
        	{
        		Thread.sleep( delay_time );
        	} 
        	catch (InterruptedException e) 
        	{
        		e.printStackTrace();
        	}
       
       }
    }
 
    
    /**
     * aqui inicia la aplicacion y se encuantra el metodo principal
     */
    public static void main(String args[])
    {
        //crea una ventana de simulacion  //
    	JFrame frame = new JFrame("CellularAutomata");

    	//Añade una lista determinada //
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        
        //Crea el applet para la simulacion de la matriz //
        JApplet applet = new GUI_Matrix();
        
        //añade el applet a la ventana //
        frame.getContentPane().add("Center", applet);
        
        //Inicia el applet y la simulacion del juego de la vida //
        applet.init();
        
        //Añadde las propiedades de la ventana //
        frame.pack();
        frame.setSize(new Dimension(800,800));
        frame.setVisible(true);
    }
}
