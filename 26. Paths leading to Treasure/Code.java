import java.util.*;
public class Code {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		System.out.println(PathsLeadingToTreasure(x,y));
	}
	public static int PathsLeadingToTreasure(int M, int N) {
		int path=1;
        for(int i=N; i<(M+N-1); i++) {
            path*= i;
            path/=(i-N+1);
        }return path;
    }

}
