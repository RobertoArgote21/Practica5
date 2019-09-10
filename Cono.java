public class Cono{
	private int high, radio;
	private float area, volumen;

	public Cono(int high, int radio, float area, float volumen){
		this.high = high;
		this.radio = radio;
		this.area = area;
		this.volumen = volumen;
	}

	public float areaSup(int radio, float high){
		float area = (float) Math.PI*2*radio*high;
		return area;
	}

	public float volumenCono(int radio, float high){
		float volumen = (float) (Math.PI*Math.pow(radio, 2)*high)/3;
		return volumen;
	}

}