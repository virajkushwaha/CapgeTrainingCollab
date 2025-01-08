import java.util.Scanner;
class Calculator{
	int add(int x,int y){
		return x+y;
	}
	public static void main (String args[]){
<<<<<<< HEAD
		int sub(int a , int b ){
			return a-b;
		}
=======
		
>>>>>>> 34ef0a12cd59519f357b89b7eb1e39460390291b
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Enter the Operator");
		String op = sc.next();
		
<<<<<<< HEAD
=======
		if(op.equals("+")){
			System.out.println("Addition: "+add(x,y));
		}
		else if (op.equals("-")){
			System.out.println("Subtraction: "+sub(x,y));
		}
		
		
>>>>>>> 34ef0a12cd59519f357b89b7eb1e39460390291b
	}
}