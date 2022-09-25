package clases;

public class Coche {
	
	private double miVelocidad; //velocidad pixel/seg
	protected double miDireccionActual;  //Grados (0-360
	protected double posX;
	protected double posY;
	private String piloto;  //Nombre del pil
	public Coche(double miVelocidad, double miDireccionActual, double posX, double posY, String piloto) {
		super();
		this.miVelocidad = miVelocidad;
		this.miDireccionActual = miDireccionActual;
		this.posX = posX;
		this.posY = posY;
		this.piloto = piloto;
	}
	
	public Coche() {
		this.miVelocidad = 0;
		this.miDireccionActual =0;
		this.posX = 0;
		this.posY = 0;
		this.piloto = "";
	}

	public double getMiVelocidad() {
		return miVelocidad;
	}

	public void setMiVelocidad(double miVelocidad) {
		this.miVelocidad = miVelocidad;
	}

	public double getMiDireccionActual() {
		return miDireccionActual;
	}

	public void setMiDireccionActual(double miDireccionActual) {
		this.miDireccionActual = miDireccionActual;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	
	public String toString () {
		return "Piloto"+piloto + ", Posicion " + posX +  ","+ posY+", Velocidad: "+ miVelocidad+", "+
	", Direccion del coche "+ miDireccionActual;
	}
	
	
	public void acelera(double aceleracion) {
		if (aceleracion<0) {
			if (miVelocidad+aceleracion<0) {
				setMiVelocidad(0);
			}
			else {
				miVelocidad=miVelocidad+aceleracion;
			}
		}
		else {
			miVelocidad=miVelocidad+aceleracion;
		}
		
		
	}
	
	
	
	public void gira(double giro) {
		
		if (giro>=-180 && giro<=180) {
			miDireccionActual=miDireccionActual+giro;
		}
		
		
	}
	
	
	public void mueve(double tiempoDeMovimiento) {
		
		posX=posX+(miVelocidad*tiempoDeMovimiento*Math.cos(miDireccionActual));
		posY=posY+(miVelocidad*tiempoDeMovimiento*Math.sin(miDireccionActual));
		
		
		
	}
	
	

}
