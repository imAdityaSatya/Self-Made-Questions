import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		char ch= sc.next().charAt(0);
		switch(ch) {
        case '+':
        System.out.println(a+b);		// Add
        break;
        case '-':
        System.out.println(a-b);		// Subtract
        break;
        case '*':
        System.out.println(a*b);		// Multiply
        break;
        case '/':						// Divide
        	if(b!=0) {
        		if(a%b==0) {
        			System.out.println(a/b);
        		}else {
        			System.out.println((double)a/(double)b);
        		}
        	}else {
        		System.out.println("Invalid Input");
        	}
        break;
        default:
        System.out.println("Invalid Input");
		}
	}

}
