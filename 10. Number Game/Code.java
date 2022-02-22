import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int cnt=0;
        for(int i=N; i>0; i--){
            cnt++;
        }
        if(cnt%2==0){
            System.out.println("YOU WON");
        }else {
        	System.out.println("COMPUTER WON");
        }
	}

}
