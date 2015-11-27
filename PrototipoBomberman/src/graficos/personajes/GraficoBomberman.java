package graficos.personajes;

import javax.swing.ImageIcon;

import gui.Const;

/**
 * Clase que modela la gr�fica del Bomberman.
 * @author Asencio Victor, Gutierrez Gabriel, Iurchuk Joaqu�n
 */
public class GraficoBomberman extends GraficoPersonaje {

	/**
	 * Constructor de clase.
	 * Crea la entidad gr�fica de Bomberman con una posici�n en el tablero.
	 * @param velocidad Velocidad de Bomberman.
	 * @param x Posicion l�gica horizontal del Bomberman.
	 * @param y Posicion l�gica vertical del Bomberman.
	 */
	public GraficoBomberman(int velocidad, int x, int y) {
		super(velocidad, x, y);
		
		getLabel().setBounds(x * Const.ANCHO_CELDA, (y * Const.ALTO_CELDA)+Const.ALTO_ENCABEZADO, Const.ANCHO_CELDA, Const.ALTO_CELDA);
		
		imagenes[Const.MOVIMIENTO_ARRIBA] = new ImageIcon(this.getClass().getResource("/Recursos/BupGif.gif"));		
		imagenes[Const.MOVIMIENTO_ABAJO] = new ImageIcon(this.getClass().getResource("/Recursos/BdownGif.gif"));
		imagenes[Const.MOVIMIENTO_IZQUIERDA] = new ImageIcon(this.getClass().getResource("/Recursos/BleftGif.gif"));
		imagenes[Const.MOVIMIENTO_DERECHA] = new ImageIcon(this.getClass().getResource("/Recursos/BrightGif.gif"));
		imagenes[4] = new ImageIcon(this.getClass().getResource("/Recursos/Bup.png"));		
		imagenes[5] = new ImageIcon(this.getClass().getResource("/Recursos/Bdown.png"));
		imagenes[6] = new ImageIcon(this.getClass().getResource("/Recursos/Bleft.png"));
		imagenes[7] = new ImageIcon(this.getClass().getResource("/Recursos/Bright.png"));
		grafico.setIcon(imagenes[7]);
	}	
}