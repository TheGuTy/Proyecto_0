package graficos;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.Const;

/**
 * Clase abstracta que encapsula los atributos y operaciones de las gr�ficas
 * que tienen en com�n todas las estructuras.
 * @author Asencio Victor, Gutierrez Gabriel, Iurchuk Joaqu�n
 */

public abstract class GraficoEstructuras {
	protected Icon imagen;
	protected final int ancho = Const.ANCHO_CELDA;
	protected final int alto = Const.ALTO_CELDA;
	protected Point pos;

	/**
	 * Constructor de clase abstracta.
	 * Inicializa los atributos en com�n de todas las entidades gr�ficas 
	 * pertenecientes a las estructuras.
	 * @param x Posici�n l�gica horizontal de la celda.
	 * @param y Posici�n l�gica vertical de la celda.
	 */
	protected GraficoEstructuras(int x, int y) {
		this.pos = new Point(x * this.ancho, y * this.alto);
		this.imagen = new ImageIcon();
		
	}

	/**
	 * Getter para la posici�n de la estructura en el panel.
	 * @return Posici�n en el panel.
	 */
	public Point getPos() {
		return pos;
	}	
	
	/**
	 * Getter para el label de la estructura.
	 * @return JLabel asociado a la estructura.
	 */
	public Icon getIcon() {
		
		return this.imagen;
	}	
}