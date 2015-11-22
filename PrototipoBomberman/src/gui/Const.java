package gui;
/**
 * Clase pensada para administrar las constantes que se van a utilizar en todo el juego.  
 * @author Asencio Victor, Gutierrez Gabriel, Iurchuk Joaqu�n
 */
public class Const {

	public static final int MOVIMIENTO_ARRIBA    = 0;
	public static final int MOVIMIENTO_ABAJO     = 1;
	public static final int MOVIMIENTO_IZQUIERDA = 2;
	public static final int MOVIMIENTO_DERECHA   = 3;
	
	public static final int EMPTY_BORDER = 5;
	
	public static final int CANT_CELDAS_ANCHO = 31;
	public static final int CANT_CELDAS_ALTO = 14;	
	
	public static final int ANCHO_CELDA = 32;
	public static final int ALTO_CELDA = 32;
	
	public static final int ANCHO_GUI = ANCHO_CELDA * CANT_CELDAS_ANCHO;
	public static final int ALTO_GUI = ALTO_CELDA * CANT_CELDAS_ALTO;
	
	public static final double PORCENTAJE_DESTRUIBLES = 0.2;
	public static final int TIEMPO_DETONACION = 2500;
	
	public static final int VELOCIDAD_INICIAL_BMAN = 1;
}