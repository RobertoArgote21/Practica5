import java.util.Scanner;
//import CuerposCirculares.*;	//Importo el paquete donde se encuentra mi clase Esfera(en otro archivo)
//Dejo comentada la linea anterior porque solo hace falta que todos los codigos esten en la misma carpeta para que funcionen
public class Cliente {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int opc,opcion;//Cambio de lugar las variables para que se pueda ejecutar correctamente el programa
		do{	
			System.out.println("\nIngrese de que figura quiere calcular el area superficial y su volumen");
			System.out.println(1 +") para prisma");
			System.out.println(2 + ") para esfera");
			System.out.println(3 + ") para cono");
			opc = sc.nextInt(); 
			switch(opc){
				case 1:
					Prisma prisma = new Prisma();
					break;
				case 2:
	    			Esfera esfera1=new Esfera();
	    			System.out.println("\nArea Esfera= " + esfera1.Area + "\nVolumen Esfera= " + esfera1.Volumen);
					break;
				case 3:
					System.out.println("\nIngresa el radio de tu cono:");
					int r = sc.nextInt();
					System.out.println("Ahora ingresa la altura del cono:");
					int h = sc.nextInt();
					Cono cono = new Cono(r, h);
					cono.mostrarInfo();
					break;
				default:
					System.out.println("\nIngresa un numero valido.");
			}
			System.out.println("\nQuiere repetir el programa? Pulse 1. En caso contrario, pulse otro numero.");
			opcion = sc.nextInt(); //Agregando instruccion para repetir el programa
		}while (opcion == 1);

	} 
}