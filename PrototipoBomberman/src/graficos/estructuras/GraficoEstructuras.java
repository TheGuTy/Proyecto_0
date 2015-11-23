package graficos.estructuras;

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

	
	/**
	 * Getter para el label de la estructura.
	 * @return JLabel asociado a la estructura.
	 */
	public Icon getIcon() {
		
		return this.imagen;
	}	
}