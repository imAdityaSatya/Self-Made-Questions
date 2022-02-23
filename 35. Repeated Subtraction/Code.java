import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt();
		int cnt=0;
        while(A!=0 && B!=0){
            if(A>B){
                A=A-B;
            }else{
                B=B-A;
            }
            cnt++;
        }System.out.println(cnt);
	}

}
