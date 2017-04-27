package pgn.poo.examenMarzo2017_JuanRuedaMorales;

/**
 * Examen Marzo 2017
 * @author Juan Rueda Morales
 */


public class Circunferencia extends Figura {
	private double radio;
	
	public Circunferencia(double radio) throws DimensionNoValidaException {
		setRadio(radio);
	}
	
	public Circunferencia(int identificador){
		super(identificador);
	}
	

	@Override
	double calcularArea() {
		return Math.PI*Math.pow(getRadio(), 2);
	}

	@Override
	double calcularPerimetro() {
		return 2*Math.PI*getRadio();
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) throws DimensionNoValidaException {
		if(dimensianValida(radio))
		this.radio = radio;
	}

	@Override
	public String toString() {
		return  super.toString() + " [Radio=" + getRadio() + "]";
	}
	
	

}
