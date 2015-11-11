/*
 * Repaso1: Pinta un rect‡ngulo en la esquina superior izquierda
 * 
 */
//importamos la librer’a acm para los objetos gr‡ficos
import acm.graphics.*;

public class Repaso1 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rect‡ngulo
	GRect rectangulo;
	
	//recuerda que el init se ejecuta siempre antes que el run
	public void init(){
		setSize(800,600);
		//el primer par‡metro del rect‡ngulo es el ancho
		//y el segundo el alto
		rectangulo = new GRect(120,80);
		
	}
	
	public void run(){
		//a–ado el objeto GRect al lienzo para que se muestre
		//si no especifico la posici—n, aparece en (0,0)
		add(rectangulo);
	}
}