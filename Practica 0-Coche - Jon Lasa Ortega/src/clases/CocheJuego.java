package clases;

public class CocheJuego extends Coche {
	
	private JLabelCoche cocheLabel;

	public CocheJuego(double miVelocidad, double miDireccionActual, double posX, double posY, String piloto,
			JLabelCoche coche) {
		super(miVelocidad, miDireccionActual, posX, posY, piloto);
		this.cocheLabel = cocheLabel;
	} 
	
	
	
	public CocheJuego(JLabelCoche cocheLabel) {
		super();
		this.cocheLabel = cocheLabel;
	}



	public JLabelCoche getCocheLabel() {
		return cocheLabel;
	}

	public void setCocheLabel(JLabelCoche cocheLabel) {
		this.cocheLabel = cocheLabel;
	}

	public void setPosX() {
		
		cocheLabel.setAlignmentX((float) posX);
		
	}
	
	
	public void setPosY() {
		cocheLabel.setAlignmentY((float) posY);
		
	}
	
	

}
