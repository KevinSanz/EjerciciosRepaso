/*
 * Repaso2: Pinta un rect‡ngulo en la esquina superior izquierda
 * 
 */
//importamos la librer’a acm para los objetos gr‡ficos
import acm.graphics.*;

public class Repaso2 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rect‡ngulo
	//como es de intancia se desde el init y desde el run
	GRect rectangulo;

	//declaro una variable de instancia que guardara el punto X de las 
	//pantalla en que empezara a pintarse el rectangulo
	int distanciaX;


	//recuerda que el init se ejecuta siempre antes que el run
	public void init(){
		//tama–o de la pantalla 
		setSize(800,600);
		//el primer par‡metro del rect‡ngulo es el ancho
		//y el segundo el alto
		rectangulo = new GRect(120,80);
		add(rectangulo);

	}

	public void run(){
		//divido el ancho de la pantalla entre dos para saber donde 
		//esta la mitad exancta de la pantalla
		distanciaX = getWidth()/2;

		//a–ado el objeto GRect al lienzo para que se muestre
		//si no especifico la posici—n, aparece en (0,0)
		rectangulo.setLocation(distanciaX-60, 0);
	}

}