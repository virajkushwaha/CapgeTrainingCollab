import java.util.Scanner;
class Calculator{
	public static void main (String args[]){
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Enter the Operator");
		String op = sc.next();
		System.out.println(x+" "+op+" "+y);
	}
}