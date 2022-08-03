import java.util.Scanner;
public class AreaofCircle{
	public static void main(String[] args){
		double r;
		double pi=3.14,area;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the radius");
		r=sc.nextDouble();
		area=pi*r*r;
		System.out.println(area);
	}
}