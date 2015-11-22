package graficos;

import javax.swing.ImageIcon;

import gui.Const;

/**
* Clase que modela la gr�fica de la pared no destruible.
* @author Asencio Victor, Gutierrez Gabriel, Iurchuk Joaqu�n
*/

public class GraficoParedNoDestruible extends GraficoEstructuras {

	/**
	 * Constructor de clase.
	 * Crea la entidad gr�fica de una pared no destruible en una posici�n en el tablero.
	 * @param x Posicion l�gica horizontal de la pared.
	 * @param y Posicion l�gica vertical de la pared.
	 */
	public GraficoParedNoDestruible(int x, int y) {
		super(x, y);
		
		imagen = new ImageIcon(this.getClass().getResource("/Recursos/muroindestructible2.png"));			
	}	
}