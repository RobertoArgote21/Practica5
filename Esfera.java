import java.util.Scanner;
public class Esfera{
	Scanner read=new Scanner(System.in);
	public float pi=3.1416f;
	public float Area;
	public float Volumen;
	public float radio;
	private Esfera(){	//Constructor
		System.out.print("Ingrese el radio de la esfera\t");
		radio=read.nextFloat();
		Area=CalcularArea(radio);
		Volumen=CalcularVolumen(radio);
	}
	public float CalcularArea(float r){
		Area=4*pi*((float)Math.pow(r,2));
		return Area;
	}
	public float CalcularVolumen(float r){
		Volumen=(4/3)*pi*((float)Math.pow(r,3));
		return Volumen;
	}
	public static void main(String[]args){
	    Esfera esfera1=new Esfera();
	    System.out.println("Area=" + esfera1.Area + "Volumen=" + esfera1.Volumen);
	}
}
