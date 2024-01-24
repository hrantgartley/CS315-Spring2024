import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your radius: ");
		double rad = sc.nextDouble();
		double area = rad * rad * 3.14159;
		System.out.println("Area is " + area);
	}
}

