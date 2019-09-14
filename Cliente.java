import java.util.Scanner;
import CuerposCirculares.*;	//Importo el paquete donde se encuentra mi clase Esfera(en otro archivo)
public class Cliente {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		do{
			int opc,opcion;
			System.out.println("Ingrese de que figura quiere calcular el area superficial y su volumen");
			System.out.println(1 +"para prisma");
			System.out.println(2 + "para esfera");
			System.out.println(3 + "para cono");
			opc = sc.nextInt();
			switch(opc){
				case 1:

					break;
				case 2:
	    				Esfera esfera1=new Esfera();
	    				System.out.println("Area Esfera= " + esfera1.Area + "\nVolumen Esfera= " + esfera1.Volumen);
					break;
				case 3:

					break;

				default:

			}
			System.out.println("¿Quiere repetir el programa? Pulse 1");

		}while (opcion == 1);

	} 
}
