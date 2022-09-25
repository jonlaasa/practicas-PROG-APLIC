package clases;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabelCoche extends JLabel {
	
	public JLabelCoche() {
		
		   this.setSize(100,100);
		  ImageIcon image = new ImageIcon("Media/coche.png");
		  
		  //AQUI LO PONEMOS EN DIMESIONES 100 *100 BITS
		  
	       Image imagen = image.getImage().getScaledInstance(100, 100, image.getIconHeight());
	       Icon icon =new ImageIcon(imagen);  
		  this.setIcon(icon);
		
		
	}

        
		  
     
        
        
        
        

		

		
	}
	
	
	


	

