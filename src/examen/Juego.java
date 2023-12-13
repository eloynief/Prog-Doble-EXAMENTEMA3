package examen;

public class Juego {

	//VARIABLE CNSTANTE TIPO INT PARA EL TAMAÑO DEL TABLERO
	final static int TAM_TABLERO=5;
	
	//coordenadas del tesoro
	public static int xTesoro,yTesoro;
	
	//coordanadads donde se enccuentra el jugador
	public int xJugador=1,yJugador=1;
	
	//
	public static void generaPosicionTesoro(){
//		//random
//		int x,y;
//		//
//		x= (int) Math.random()*5-1;
//		y= (int) Math.random()*5-1;
//		
		//
		xTesoro=(int) (Math.random()*TAM_TABLERO+1);
		yTesoro=(int) (Math.random()*TAM_TABLERO+1);
	}
	
	
	public void pintaTablero() {
		

		for(int i=1;i<=TAM_TABLERO;i++) {
			System.out.print("	"+i);
		}

		System.out.println();
		
		for(int j=1;j<=TAM_TABLERO;j++) {
			
			System.out.print(j);
			
			for(int k=1;k<=TAM_TABLERO;k++) {
				
				if(j==xJugador&&k==yJugador) {
					System.out.print("	J");
				}
				else {
					System.out.print("	");
				}
				
			}
			System.out.println();
//			System.out.println();
//			System.out.println();
		}
	}//fin pintaTablero
	
	//
	public int mueveJugador(String direccion) {
		
		int numero=0;
		
		switch(direccion) {
		
			case "ARRIBA": 
				if(xJugador-1<1){
					numero=-1;
				}
				else {
					xJugador-=1;
				}
			break;
			
			case "ABAJO": 
				if(xJugador+1>TAM_TABLERO){
					numero=-1;
				}
				else {
					xJugador+=1;
				}
			break;
			
			case "DERECHA": 
				if(yJugador+1>TAM_TABLERO){
					numero=-1;
				}
				else {
					yJugador+=1;
				}
			break;
			
			case "IZQUIERDA": 
				if(yJugador-1<1){
					numero=-1;
				}
				else {
					yJugador-=1;
				}
			break;
//			
//			default:{
//				System.out.println("Lo siento pero no entiendo ese movimiento");
//			}
		
		}
		
		return numero;
		
	}//fin mueve jugador
	
	/* Comprueba si el jugador se encuentra en la misma posición que el tesoro. 
	 * En caso afirmativo devolverá true y en caso contrario devolverá false.
	 */
	public boolean buscaTesoro() {
		boolean esAcertado=false;
		if (xJugador==xTesoro&&yJugador==yTesoro){
			esAcertado=true;
		}
		else {
			esAcertado=false;
		}
		return esAcertado;
		
	}
	
	
}
