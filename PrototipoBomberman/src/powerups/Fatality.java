package powerups;

import personajes.Bomberman;

/**
 * Clase que modela un PowerUp efectivo y con un puntaje asignado
 * @author Asencio Victor, Gutierrez Gabriel, Iurchuk Joaqu�n
 *
 */
public class Fatality extends PowerUp {

	/**
	 * Constructor de la clase.
	 * Crea un PowerUp con un puntaje predefinido.
	 */
	public Fatality () {
		
		super (35);
	}

	@Override
	public void upgrade(Bomberman b) {
		
		
	}
}
