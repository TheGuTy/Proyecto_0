package personajes;

import graficos.GraficoBomberman;
import gui.Const;
import juego.Celda;
import juego.Tablero;

public class Bomberman extends Personaje {

	protected int bombasDisponibles;
	protected int miAlcanceBomba;

	public Bomberman(Celda c, Tablero tablero) {

		super(false, 2, c, tablero);
		this.miGrafico = new GraficoBomberman(2, 1, 1);
	}

	@Override
	public void matar() {
		this.miGrafico.getGrafico().setIcon(null);
	}

	public void setModoDios(boolean b) {
		modoDios = b;
	}

	public void colocarBomba() {
		miTablero.colocarBomba(miCelda.getX(), miCelda.getY(), miAlcanceBomba);
	}

	public void mover(int dir) {

		calcularCeldaSiguiente(dir).avanzar(this, dir);
		
		System.out.println("Soy " + this.getClass().getName() + ". Mi posicion nueva es x: " + getCelda().getX() + " - y: " + getCelda().getY());
	}
	
	public void duplicarVelocidad() {

		velocidad *= 2;
	}

	public void aumentarBombasDisponibles() {

		bombasDisponibles++;
	}

	public void duplicarAlcance() {

		miAlcanceBomba *= 2;
	}
}
