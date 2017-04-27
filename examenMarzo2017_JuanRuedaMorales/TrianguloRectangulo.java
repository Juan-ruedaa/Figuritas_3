package pgn.poo.examenMarzo2017_JuanRuedaMorales;

/**
 * Examen Marzo 2017
 * @author Juan Rueda Morales
 */

public class TrianguloRectangulo extends Figura {
	private double base;
	private double altura;

	public TrianguloRectangulo(double base,double altura) throws DimensionNoValidaException {
		setBase(base);
		setAltura(altura);
	}

	@Override
	double calcularArea(){ 
		return (getBase()*getAltura())/2;
	}

	@Override
	double calcularPerimetro() {
		return getBase()+getAltura()+(Math.pow(getBase(), 2)+Math.pow(getAltura(), 2));
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) throws DimensionNoValidaException {
		if(dimensianValida(base))
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws DimensionNoValidaException {
		if(dimensianValida(altura))
		this.altura = altura;
	}

	@Override
	public String toString() {
		return super.toString() + ", Base=" + getBase() + ", Altura=" + getAltura() + "]";
	}
	
	

}
