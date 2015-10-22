package graficos;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

import gui.Const;

public abstract class GraficoPersonaje {
	protected JLabel grafico;
	protected Icon imagenes[];
	protected final int ancho = Const.ANCHO_CELDA;
	protected final int alto = Const.ALTO_CELDA;

	protected int velocidad;

	protected Point pos;

	protected GraficoPersonaje(int velocidad, int x, int y) {
		this.pos = new Point(x * this.ancho, y * this.alto);
		this.velocidad = velocidad;
		this.imagenes = new Icon[4];
	}

	public int getVelocidad() {
		return velocidad;
	}

	public Point getPos() {
		return pos;
	}

	public void changeIcon(int dir) {
		this.grafico.setIcon(this.imagenes[dir]);
	}

	public JLabel getLabel() {
		if (this.grafico == null) {
			this.grafico = new JLabel(imagenes[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, ancho, alto);
		}
		return this.grafico;
	}
	
	public int getAlto() {
		return alto;
	}
	
	public int getAncho() {
		return ancho;
	}
}