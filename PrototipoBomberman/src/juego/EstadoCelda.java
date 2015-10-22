package juego;

import graficos.GraficoEstructuras;
import personajes.Bomberman;
import personajes.Enemigo;

public abstract class EstadoCelda {

	protected GraficoEstructuras miGrafico;
	
	protected EstadoCelda(GraficoEstructuras miGrafico){
		this.miGrafico = miGrafico;
	}
	
	public abstract void destruir (Celda c);
	
	public abstract void avanzar (Bomberman bomberman, Celda c, int dir);
	
	public abstract void avanzar (Enemigo enemigo, Celda c, int dir);
}
