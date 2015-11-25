package handler;

import java.util.ArrayList;
import java.util.List;

public class GeneradorFrases {

	private List<String> frases;
	private int position;
	
	public GeneradorFrases() {
		
		position=0;
		frases=new ArrayList<String>();
		frases.add("<html>�Qu� sentido tiene salir afuera?<br>Si vamos a volver aqu� de todas maneras</html>");
		frases.add("<html>He aprendido que la vida<br>no es m�s que una devastadora <br> derrota tras otra,<br>hasta que simplemente deseas<br>que Flanders muera</html>");
		frases.add("<html>Durante toda mi vida<br>he tenido un solo sue�o:<br>alcanzar todas mis metas</html>");
		frases.add("<html>Chicos, lo intentaron<br>con la mejor de sus intenciones<br>y fracasaron.<br>La lecci�n es:<br>Nunca lo intenten</html>");
		frases.add("<html>No soy de los que rezan<br>oraciones regularmente,<br>pero si est�s ah�,<br>por favor ay�dame Superman</html>");
		frases.add("<html>Los hechos no significan nada.<br>Puedes usar los hechos<br>para probar cualquier<br>cosa que no sea<br>ni remotamente cierta</html>");
		frases.add("<html>�Oh dios m�o,<br>aliens del espacio!<br>Por favor no me coman,<br>tengo esposa e hijos.<br>�Comanlos a ellos!</html>");
		frases.add("<html>Lisa, si no te gusta<br>tu trabajo no haces huelga.<br>Simplemente vas cada d�a<br>y lo haces de muy mala gana.<br>As� se hace en Am�rica</html>");
		frases.add("<html>Hijo, si realmente<br>deseas algo en esta vida,<br>tienes que luchar por ello.<br>�Ahora silencio! Van a anunciar<br>los n�meros ganadores<br>de la loter�a</html>");
	}
	
	public String getFrase() {
		
		return frases.get((position++)%frases.size());
	}
}
