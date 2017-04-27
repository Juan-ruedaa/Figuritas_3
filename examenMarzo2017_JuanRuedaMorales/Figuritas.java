package pgn.poo.examenMarzo2017_JuanRuedaMorales;

import java.util.ArrayList;
import java.util.ListIterator;

public class Figuritas {

	private ArrayList<Figura> figuras = new ArrayList<Figura>();

	void add(Figura figura) {
		figuras.add(figura);
	}

	void remove(int index) throws IndiceNoValidoException {
		try {
			figuras.remove(index);
		} catch (IndexOutOfBoundsException e) {
			throw new IndiceNoValidoException("Indice no valido");
		}
	}
	
	void removeID(int identificador) throws IdentificadorNoExisteException {
		if (!figuras.remove(new Circunferencia(identificador))) {
			throw new IdentificadorNoExisteException("No existe este identificador");
		}
	}

	StringBuilder mostrarFiguras() throws ListaVaciaException {
		if (figuras.isEmpty()) {
			throw new ListaVaciaException("La lista esta vacia");
		}
		StringBuilder figurasMostrar = new StringBuilder();
		for (Figura figura : figuras) {
			figurasMostrar.append("\n"+figura);
		}
		return figurasMostrar;
	}

	StringBuilder mostrarTriangulos() throws ListaVaciaException {
		if (figuras.isEmpty()) {
			throw new ListaVaciaException("La lista esta vacia");
		}
		StringBuilder triangulosMostrar = new StringBuilder();
		for (Figura figura : figuras) {
			if (figura instanceof TrianguloRectangulo)
				triangulosMostrar.append("\n"+figura);
		}
		return triangulosMostrar;
	}

	StringBuilder mostrarDelReves() throws ListaVaciaException {
		if (figuras.isEmpty()) {
			throw new ListaVaciaException("La lista esta vacia");
		}
		ListIterator<Figura> figurasDelReves = figuras.listIterator(figuras.size());
		StringBuilder figurasAlReves = new StringBuilder();
		while (figurasDelReves.hasPrevious()) {
			figurasAlReves.append("\n"+figurasDelReves.previous());
		}
		return figurasAlReves;
	}

	void altasMasivas() {
		for (int i = 0; i < 3; i++) {
			addCircunferencia();
			addCuadrado();
			addTrianguloRectangulo();
			addRectangulo();
		}
	}

	private void addRectangulo() {
		try {
			figuras.add(new Rectangulo(Math.random(), Math.random()));
		} catch (DimensionNoValidaException e) {
			System.err.println(e.getMessage());
		}
	}

	private void addTrianguloRectangulo() {
		try {
			figuras.add(new TrianguloRectangulo(Math.random(), Math.random()));
		} catch (DimensionNoValidaException e) {
			System.err.println(e.getMessage());
		}
	}

	private void addCuadrado() {
		try {
			figuras.add(new Cuadrado(Math.random()));
		} catch (DimensionNoValidaException e) {
			System.err.println(e.getMessage());
		}
	}

	private void addCircunferencia() {
		try {
			figuras.add(new Circunferencia(Math.random()));
		} catch (DimensionNoValidaException e) {
			System.err.println(e.getMessage());
		}
	}

}
