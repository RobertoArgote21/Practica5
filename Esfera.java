import java.util.Scanner;
public class Esfera{
	Scanner read=new Scanner(System.in);
	private final float pi=3.1416f;
	public float Area;
	public float Volumen;
	private float radio;
	private Esfera(){	//Constructor
		System.out.print("Ingrese el radio de la esfera\t");
		radio=read.nextFloat();
		Volumen=CalcularVolumen(radio);
		Area=CalcularArea(radio);
	}
	public float CalcularVolumen(float r){
		Volumen=((float)4/3)*(pi)*((float)Math.pow(r,3));
		return Volumen;
	}
	public float CalcularArea(float r){
		Area=4*pi*((float)Math.pow(r,2));
		return Area;
	}
	public static void main(String[]args){
	    Esfera esfera1=new Esfera();
	    System.out.println("Area= " + esfera1.Area + "\nVolumen= " + esfera1.Volumen);
	}
}
