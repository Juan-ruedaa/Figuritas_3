package pgn.poo.examenMarzo2017_JuanRuedaMorales;

/**
 * Examen Marzo 2017
 * @author Juan Rueda Morales
 */

public abstract class Figura {
	private int identificador;
	private static int contador=1;
		
	public Figura() {
		this.identificador=contador++;
	}
	
	public Figura(int identificador) {
		this.identificador=identificador;
	}

	abstract double calcularArea();
	
	abstract double calcularPerimetro();
	
	
	protected int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	protected boolean dimensianValida(double dimension) throws DimensionNoValidaException{
		if(dimension<=0.5)
			throw new DimensionNoValidaException("La dimension no es valida");
		return true;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "     "  + " [Identificador=  " + getIdentificador() + ", Perimetro=" + calcularPerimetro() + ", Area()=" + calcularArea() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identificador;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Figura other = (Figura) obj;
		if (identificador != other.identificador)
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
