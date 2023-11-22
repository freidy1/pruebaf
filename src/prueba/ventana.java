package prueba;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventana {
	JFrame ventana;
	JLabel label,label1,label2,label3;
	JPanel panel1,panel2;
	JButton boton,boton1;
	
	void crearventana() {
		ventana=new JFrame();
		ventana.setTitle("ejemplo");
		ventana.setSize(600, 700);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	    ventana.setLocationRelativeTo(null);
	    
	    ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.X_AXIS));
	    
	    label=new JLabel("hola ");
	    label1=new JLabel("como ");
	    
	    ventana.add(label);
	    ventana.add(label1);
	    ventana.add(panel1);
	    
		
	}
	
	
	void crearpanel1() {
		 label2=new JLabel("hola1 ");
		    label3=new JLabel();
		    label3.setText("como1 ");
		    panel1=new JPanel();
		    //panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
		    panel1.setLayout(null);
		   
		    label2.setBounds(60, 0, 40, 40);
		    label3.setBounds(60, 20, 60, 40);
		    panel1.add(label2);
		    panel1.add(label3);
		    panel1.setBackground(Color.CYAN);
		    
		
		    boton=new JButton("enviar");
		    boton1=new JButton("cancelar");
		    panel2=new JPanel();
		    panel2.setBounds(60, 50, 200, 150);
		    panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
		    panel1.setBackground(Color.yellow);
		    panel2.add(boton);
		    panel2.add(boton1);
		    panel1.add(panel2);
		    
	}
	
	
	
	
	ventana(){
		crearpanel1();
		crearventana();
		
	}

}
