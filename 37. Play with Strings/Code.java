import java.util.*;
public class Code {
	
	public static int appearCnt(String W, char L, int m, int n) {
		int cnt=0, size=W.length();
        for(int i=0; i<size; i++){
            if(W.charAt(i)==L){
                cnt++;
            }
        }
        cnt*= (n/size);
        for(int i=0; i<n%size; i++){
            if(W.charAt(i)==L){
                cnt++;
            }
        }return cnt;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String W= sc.nextLine();
		char L= sc.next().charAt(0);
		int m= sc.nextInt();
		int n= sc.nextInt();
		System.out.println(appearCnt(W,L,m,n));
	}

}
