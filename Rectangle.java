import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		int s1, s2, P, A;
		Scanner keyboard1 = new Scanner (System.in);
		Scanner keyboard2 = new Scanner (System.in);
		System.out.println("Enter width ");
		s1 = keyboard1.nextInt();
		System.out.println("Enter hight ");
		s2 = keyboard2.nextInt();
		P = 2*(s1 + s2);
		A = s1*s2;
		System.out.println("Perimeter " + P + "\nArea " + A);

	}

}
