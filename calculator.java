import java.util.Scanner;
class Calculator{
	int add(int x,int y){
		return x+y;
	}

	int multi(int x,int y){
		return x*y;
	}
		

	int sub(int x,int y){
		return x-y;
	}

	public static void main (String args[]){
		
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Enter the Operator");
		String op = sc.next();
		
		if(op.equals("+")){
			System.out.println("Addition: "+add(x,y));
		}
		else if (op.equals("-")){
			System.out.println("Subtraction: "+ sub(x,y));
		}

		
		else if(op.equals("*")){
			System.out.println(multi(x,y));
		}


		
	}