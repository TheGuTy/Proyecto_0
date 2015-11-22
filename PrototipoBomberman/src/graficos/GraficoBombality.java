package graficos;

import javax.swing.ImageIcon;

import gui.Const;

/**
 * Clase que modela la gr�fica de la bomba.
 * @author Asencio Victor, Gutierrez Gabriel, Iurchuk Joaqu�n
 */
public class GraficoBombality extends GraficoEstructuras {
	
	/**
	 * Constructor de clase.
	 * Crea la entidad gr�fica de la bomba con una posici�n en el tablero.
	 * @param x Posicion l�gica horizontal de la bomba.
	 * @param y Posicion l�gica vertical de la bomba.
	 */
	public GraficoBombality(int x, int y) {
		super(x, y);
		
		imagen = new ImageIcon(this.getClass().getResource("/Recursos/bombality.png"));	
		
	}	
}