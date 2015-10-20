package Graficos;

import java.awt.Color;

import javax.swing.ImageIcon;

public class GraficoBomberman extends GraficoPersonaje {

	public GraficoBomberman(int velocidad, int x, int y) {
		super(velocidad, x, y);
		
		getGrafico().setBackground(Color.BLUE);
		getGrafico().setBounds(x*32, y*32, 32, 32);
		
		imagenes[0] = new ImageIcon(this.getClass().getResource("/Recursos/arr.png"));		
		imagenes[1] = new ImageIcon(this.getClass().getResource("/Recursos/aba.png"));
		imagenes[2] = new ImageIcon(this.getClass().getResource("/Recursos/izq.png"));
		imagenes[3] = new ImageIcon(this.getClass().getResource("/Recursos/der.png"));
		grafico.setIcon(imagenes[3]);
	}

	
}
