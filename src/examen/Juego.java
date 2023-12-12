package examen;

public class Juego {

	//VARIABLE CNSTANTE TIPO INT PARA EL TAMAÑO DEL TABLERO
	final static int TAMTABLERO=5;
	
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
		xTesoro=(int) Math.random()*TAMTABLERO-1;
		yTesoro=(int) Math.random()*TAMTABLERO-1;
	}
	
	
	public void pintaTablero() {
		

		for(int i=1;i<=TAMTABLERO;i++) {
			System.out.print("	"+i);
		}

		System.out.println();
		
		for(int j=1;j<=TAMTABLERO;j++) {
			
			System.out.print(j);
			
			for(int k=1;k<=TAMTABLERO;k++) {
				
				if(j==xJugador&&k==yJugador) {
					System.out.print("	J");
				}
				else {
					System.out.print("	");
				}
				
			}
			System.out.println();
		}
	}//fin pintaTablero
	
	
	public int mueveJugador(String direccion) {
		
		int numero=0;
		
		switch(direccion) {
		
			case "ARRIBA":{
				yJugador-=1;
			}
			
			case "ABAJO":{
				yJugador+=1;
			}
			
			case "DERECHA":{
				xJugador+=1;
			
			}
			
			case "IZQUIERDA":{
				xJugador-=1;
			}
			
			default:{
				System.out.println("Lo siento pero no entiendo ese movimiento");
			}
		
		}
		
		return numero;
		
	}
	
	
}
