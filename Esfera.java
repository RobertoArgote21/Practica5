import java.util.Scanner;
public class Esfera{
	Scanner read=new Scanner(System.in);
	private float pi=3.1416;
	public float Area;
	public float Volumen;
	public float radio;
	private Esfera(){	//Constructor
		Area=0;
		Volumen=0;
		System.out.print('Ingrese el radio de la esfera');
		radio=read.nextFloat();
	}
	public float CalcularArea(float r){
		Area=4*pi*Math.pow(r,2);
		return Area;
	}
	public float CalcularPerimetro(float r){
		Volumen=(4/3)*pi*Math.pow(r,3);
		return Volumen;
	}
}
