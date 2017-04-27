package pgn.poo.examenMarzo2017_JuanRuedaMorales;

import pgn.poo.utiles.Menu;
import pgn.poo.utiles.Teclado;

public class Test {

	static Figuritas figuras = new Figuritas();

	public static void main(String[] args) throws ListaVaciaException, IndiceNoValidoException {

		String[] opciones = { "Altas", "Bajas", "Listar"};
		Menu menuGeneral = new Menu("--Menu General--", opciones);
		int opcion;
		do {
			opcion = menuGeneral.gestionar();
			switch (opcion) {
			case 1:
				add();
				break;
			case 2:
				remove();
				break;
			case 3:
				mostrar();
				break;
			default:
				System.out.println("Saliendo...");
				System.exit(0);
			}
		} while (true);
	}

	private static void remove(){
		String[] opciones = { "Por Identificador", "Por indice en la lista"};
		Menu menuBorrar = new Menu("--Menu para borrar figuras--", opciones);
		int opcion = 0;
		do {
			opcion = menuBorrar.gestionar();
			
				
					switch (opcion) {
					case 1:
						try {
							figuras.removeID(Teclado.leerEntero("Introduce el identificador de la figura a borrar"));
						} catch (IdentificadorNoExisteException e1) {
							System.err.println(e1.getMessage());
						}					
					break;
					case 2:
						try {
						figuras.remove(Teclado.leerEntero("Introduce la posicion de la figura a borrar"));
						} catch (IndiceNoValidoException e) {
							e.getMessage();
						}
						break;
					default:
						System.out.println("Saliendo...");
						return;
					}
				
			
		} while (true);
		
	}

	private static void mostrar(){
		String[] opciones = { "Todas las figuras", "Triangulos", "Del Reves"};
		Menu menuMostrar = new Menu("--Menu para mostrar las figuras--", opciones);
		int opcion = 0;
		do {
			opcion = menuMostrar.gestionar();
			
			try {
				switch (opcion) {
				case 1:
					System.out.println(figuras.mostrarFiguras());
					break;
				case 2:
					System.out.println(figuras.mostrarTriangulos());
					break;
				case 3:
					System.out.println(figuras.mostrarDelReves());
					break;
				default:
					System.out.println("Saliendo...");
					return;
				}
			} catch (ListaVaciaException e) {
				System.err.println(e.getMessage());
			}
		} while (true);

	}
	
	
	
	
	

	private static void add() {
		String[] opciones = { "Altas Masivas", "Altas Selectivas"};
		Menu menuAltas = new Menu("--Menu para annadir figuras--", opciones);
		int opcion = 0;
		do {
			opcion = menuAltas.gestionar();
			switch (opcion) {
			case 1:
				figuras.altasMasivas();
				try {
					System.out.println(figuras.mostrarFiguras());
				} catch (ListaVaciaException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				altasSelectivas();
				break;
			default:
				System.out.println("Saliendo...");
				return;
			}

		} while (true);

	}
	
	
	private static void altasSelectivas() {
		String[] opciones = { "Annadir Circulo", "Annadir Rectangulo","Annadir Cuadrado","Annadir TrianguloRectangulo"};
		Menu menuCreacion = new Menu("--Menu para annadir figuras de forma selectiva--", opciones);
		int opcion = 0;
		do {
			opcion = menuCreacion.gestionar();
			try {
				switch (opcion) {
				case 1:
					figuras.add(new Circunferencia(Teclado.leerDecimal("Introduce el radio")));
					break;
				case 2:
					figuras.add(new Rectangulo(Teclado.leerDecimal("Introduce la base"),
							Teclado.leerDecimal("Introduce la altura")));
					break;
				case 3:
					figuras.add(new Cuadrado(Teclado.leerDecimal("Introduce el tama�o del lado")));
					break;
				case 4:
					figuras.add(new TrianguloRectangulo(Teclado.leerDecimal("Introduce la base"),
							Teclado.leerDecimal("Introduce la altura")));
					break;
				default:
					System.out.println("Saliendo...");
					return;
				}
			} catch (DimensionNoValidaException e) {
				System.err.println(e.getMessage());
			}

		} while (true);
		
	}

}
