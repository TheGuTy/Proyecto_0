package graficos;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

import gui.Const;

public abstract class GraficoEstructuras {
	protected JLabel grafico;
	protected Icon imagenes[];
	protected final int ancho = Const.ANCHO_PERSONAJE;
	protected final int alto = Const.ALTO_PERSONAJE;

	protected Point pos;

	protected GraficoEstructuras(int x, int y) {
		this.pos = new Point(x * this.ancho, y * this.alto);
		this.imagenes = new Icon[1];
	}

	public Point getPos() {
		return pos;
	}

	public void changeIcon(int dir) {
		this.grafico.setIcon(this.imagenes[dir]);
	}

	public JLabel getGrafico() {
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