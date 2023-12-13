package examen;

import java.util.Scanner;

public class Main {
	
//	//VARIABLE CNSTANTE TIPO INT PARA EL TAMAÑO DEL TABLERO
//	final int TAMTABLERO=5;
//	
//	//coordenadas del tesoro
//	public static int xTesoro,yTesoro;
//	
//	//coordanadads donde se enccuentra el jugador
//	public int xJugador,yJugador;
//	
//	
	
	
	public static void main(String[] args) {
		
		

		//creación de scanner
		Scanner sc=new Scanner(System.in);

		Juego juego=new Juego();
		
		String opcion;
		
		
		System.out.println("BIENVENIDO AL JUEGO DEL TESORO");

		juego.generaPosicionTesoro();
		
		
		
		
		juego.pintaTablero();
		

		//siguwe jugando el juego mientras no aciertes
		do {

			System.out.println("OPCIONES PARA MOVERSE: IZQUIERDA, DERECHA, ARRIBA, ABAJO");
			System.out.println("SI QUIERES SALIR, ESCRIBE: SALIR");
			

			
			System.out.println(juego.xTesoro+" "+juego.yTesoro+ " ES EL TESORO");
			System.out.println(juego.xJugador+" "+juego.yJugador);
			
			opcion=sc.next();
			sc.nextLine();
			

			
			
			juego.mueveJugador(opcion);
			
			juego.pintaTablero();
			
			
		}while(!juego.buscaTesoro());
		
		//comprueba si el numero acierta con el tesoro
		if(juego.buscaTesoro()) {
			
			
			
		}
		
		//cerrar scanner
		sc.close();
		
		
	}
	
	
	
	
	

}
