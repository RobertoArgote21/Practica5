import java.util.Scanner;

public class Prisma {
    Scanner sc = new Scanner(System.in);
    public float a;
    public float b;
    public float h;
    public float area;
    public float volumen;
    private Prisma(){
        System.out.println("Ingrese la medida de una arista de la base: ");
        a=sc.nextFloat();
        System.out.println("Ingrese la medida de la otra arista: ");
        b=sc.nextFloat();
        System.out.println("Ingrese la medida de la altura del prisma");
        h=sc.nextFloat();
        area=calcularArea(a, b, h);
        volumen = calcularVolumen(a, b, h);
        
    }
    private float calcularVolumen(float a, float b, float h){
        return a*b*h;
    }
    private float calcularArea(float a, float b, float h){
        return 2*(a*b)+2*(a*h)+2*(b*h);
    }
    public static void main(String[] args) {
        Prisma p = new Prisma();
        System.out.println("Area=" + p.area + "\nVolumen=" + p.volumen);
    }
    
}
