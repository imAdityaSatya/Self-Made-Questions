import java.util.*;
public class Code {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		System.out.println(Sum(x,y));
	}
	public static int Sum(int x, int y) {
		if(y==0){
            return x;
        }
        return Sum(x^y, (x&y)<<1);
	}

}
