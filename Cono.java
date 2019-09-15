public class Cono{
	private int high, radio;

	public Cono(int radio, int high){
		this.high = high;
		this.radio = radio;
	}

	private float areaSup(int radio, float high){
		float area = (float) ((Math.PI*radio*radio)+(Math.sqrt(radio*radio+high*high)*radio*Math.PI));
		return area;
	}

	private float volumenCono(int radio, float high){
		float volumen = (float) (Math.PI*Math.pow(radio, 2)*high)/3;
		return volumen;
	}

	void mostrarInfo(){
		System.out.println("\nEl area superficial del cono es: "+areaSup(radio, high));
		System.out.println("El volumen del cono es: "+volumenCono(radio, high));
	}

}