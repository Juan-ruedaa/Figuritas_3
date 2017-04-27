package pgn.poo.examenMarzo2017_JuanRuedaMorales;

/**
 * Examen Marzo 2017
 * @author Juan Rueda Morales
 */

public class Rectangulo extends Figura {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) throws DimensionNoValidaException {
		setAltura(altura);
		setBase(base);
	}

	@Override
	double calcularArea() {
		return getBase()*getAltura();
	}

	@Override
	double calcularPerimetro() {
		return (2*getBase())+(2*getAltura());
	}

	
	public double getAltura() {
		return altura;
	}
	private void setAltura(double altura) throws DimensionNoValidaException {
		if(dimensianValida(altura))
			this.altura = altura;
	}
	
	public double getBase(){
		return base;
	}
	
	private void setBase(double base) throws DimensionNoValidaException {
		if(dimensianValida(base))
		this.base = base;
	}

	@Override
	public String toString() {
		return super.toString() + " [getAltura()=" + getAltura() + ", getBase()=" + getBase() + "]";
	}
	
	

}
