package graficos.personajes;

import javax.swing.ImageIcon;

import gui.Const;

/**
 * Clase que modela la gr�fica del enemigo Altair.
 * @author Asencio Victor, Gutierrez Gabriel, Iurchuk Joaqu�n
 */
public class GraficoSirius extends GraficoPersonaje {

	/**
	 * Constructor de clase.
	 * Crea la entidad gr�fica del enemigo con una posici�n en el tablero
	 * y una velocidad determinada.
	 * @param velocidad Velocidad del enemigo.
	 * @param x Posicion l�gica horizontal del enemigo.
	 * @param y Posicion l�gica vertical del enemigo.
	 */
	public GraficoSirius(int velocidad, int x, int y) {
		super(velocidad, x, y);
		
		getLabel().setBounds(x * Const.ANCHO_CELDA, y * Const.ALTO_CELDA+Const.ALTO_ENCABEZADO, Const.ANCHO_CELDA, Const.ALTO_CELDA);
		
		imagenes[Const.MOVIMIENTO_ARRIBA] = new ImageIcon(this.getClass().getResource("/Recursos/SupGif.gif"));		
		imagenes[Const.MOVIMIENTO_ABAJO] = new ImageIcon(this.getClass().getResource("/Recursos/SdownGif.gif"));
		imagenes[Const.MOVIMIENTO_IZQUIERDA] = new ImageIcon(this.getClass().getResource("/Recursos/SleftGif.gif"));
		imagenes[Const.MOVIMIENTO_DERECHA] = new ImageIcon(this.getClass().getResource("/Recursos/SrightGif.gif"));
		imagenes[4] = new ImageIcon(this.getClass().getResource("/Recursos/Sup.png"));		
		imagenes[5] = new ImageIcon(this.getClass().getResource("/Recursos/Sdown.png"));
		imagenes[6] = new ImageIcon(this.getClass().getResource("/Recursos/Sleft.png"));
		imagenes[7] = new ImageIcon(this.getClass().getResource("/Recursos/Sright.png"));
		grafico.setIcon(imagenes[7]);
	}	
}