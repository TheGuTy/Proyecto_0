package graficos;

import javax.swing.ImageIcon;

import gui.Const;

/**
 * Clase que modela la gr�fica del estado de la celda en el cual se coloc� una bomba.
 * @author Asencio Victor, Gutierrez Gabriel, Iurchuk Joaqu�n
 */
public class GraficoCeldaBomba extends GraficoEstructuras {
	
	/**
	 * Constructor de clase.
	 * Crea la entidad gr�fica de la celda en la cual 
	 * se coloc� una bomba con una posici�n en el tablero.
	 * @param x Posicion l�gica horizontal de la celda.
	 * @param y Posicion l�gica vertical de la celda.
	 */
	public GraficoCeldaBomba(int x, int y) {
		super(x, y);

		imagen = new ImageIcon(this.getClass().getResource("/Recursos/bomb.png"));	
	
	}
}