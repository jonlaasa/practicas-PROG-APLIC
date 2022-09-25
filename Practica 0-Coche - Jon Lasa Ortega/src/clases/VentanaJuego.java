package clases;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaJuego extends JFrame {
	
	public VentanaJuego () {
		inicializar();
	}

	private void inicializar() {
		// TODO Auto-generated method stub
		JFrame ventana =new JFrame ();
		ventana.setSize(400,400);
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventana.setLayout(new BorderLayout());
		
		JPanel panelCentral = new JPanel ();
		panelCentral.setBackground(Color.white);
		panelCentral.setLayout(new BorderLayout ());

		
		JLabelCoche labelCoche =new JLabelCoche();
	    CocheJuego coche =new CocheJuego (labelCoche);
	    panelCentral.add(coche.getCocheLabel());
	    
       
		

	
	    
	    JPanel panelBotones = new JPanel ();
		
	    //BOTONES
		
		JButton acelera = new JButton ("Acelera");
		JButton frena = new JButton ("Frena");
		JButton giroIzq = new JButton ("Giro Izq.");
		JButton giroDch = new JButton ("Giro Der.");
		
		
		
		//ESCUCHADORES
		
		acelera.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.acelera(5);
				System.out.println("Se acelera 5 px por segundo a , ACTUAL VELOCIDAD: " +coche.getMiVelocidad());
				coche.setPosX();
				coche.setPosY();
			}
		});
		
		
		
     frena.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.acelera(-5);
				coche.setPosX();
				coche.setPosY();
				
			}
		});
     
     giroIzq.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.gira(-10);
				System.out.println("Se gira 10 grados a la izquierda , ACTUAL DIRECCION: " +coche.getMiDireccionActual());
				coche.setPosX();
				coche.setPosY();
			}
		});
     
     giroDch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.gira(+10);
				System.out.println("Se gira 10 grados a la derecha , ACTUAL DIRECCION: " +coche.getMiDireccionActual());
				coche.setPosX();
				coche.setPosY();
			}
		});
  
     
     
		
		
		panelBotones.add(acelera);
		panelBotones.add(frena);
		panelBotones.add(giroIzq);
		panelBotones.add(giroDch);
		
		ventana.add(panelCentral,BorderLayout.CENTER);
		ventana.add(panelBotones,BorderLayout.SOUTH);

		
	ventana.setVisible(true);
		
		
	}
	
	
	static boolean valor=true;
	
	public static void main(String [] args ) {
		
		VentanaJuego ventana=new VentanaJuego();
		
		Thread MiHilo = new Thread () {
			
			
			public void run () {
				
				while (valor=true) {
					
				}
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		MiHilo.start();
		
		
		
	}

}
