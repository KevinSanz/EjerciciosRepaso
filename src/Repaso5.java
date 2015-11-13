/*
 * Repaso 5 a–ade soporte al programa para poder escuchar los clik del raton 
 * Lo que hara el programa es cambiar el color aletoriamente de relleno de un rectangulo cada
 * vez que se pulse clik
 * 
 */
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso5 extends acm.program.GraphicsProgram {

	//Declaro un variable de instancia para guardar el rectangulo 
	GRect rectangulo; 
	//declaro una variable de tipo aleatorio
	RandomGenerator aletorio = new RandomGenerator();
	
	public void init (){
		setSize(800,600);
		rectangulo=new GRect(120,80);
		//inserto el "escuchador" del raton
		addMouseListeners();




	}
	public void run (){
		//A–adido el rectangulo en el centro exacto de la pantalla
		add(    rectangulo,
				getWidth()/2-rectangulo.getWidth()/2,
				getHeight()/2-rectangulo.getHeight()/2
				);


	}
	//Se escribe el nombre de metodo que queremos ecuchar
	public void mouseClicked (MouseEvent evento){
		if(evento.getButton()== MouseEvent.BUTTON1){
		
		rectangulo.setFilled(true);
		
	    rectangulo.setFillColor(aletorio.nextColor());
		}
		
	}




}
