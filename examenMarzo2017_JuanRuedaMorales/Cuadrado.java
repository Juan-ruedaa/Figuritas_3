package pgn.poo.examenMarzo2017_JuanRuedaMorales;

/**
 * Examen Marzo 2017
 * @author Juan Rueda Morales
 */

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(double lado) throws DimensionNoValidaException {
		super(lado, lado);
	}

	@Override
	public String toString() {
	 return getClass().getSimpleName() + "     "  + " [Identificador=  " + getIdentificador() + ", Perimetro=" + calcularPerimetro() + ", Area()=" + calcularArea() + "]" + " [getLado()=" + getBase() + "]";
	}

}
