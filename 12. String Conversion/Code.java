import java.util.*;
public class Code {

	public static int conversionCount(String A, String B) {
        int m= A.length(), n= B.length();
        int ar[][]= new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            ar[i][0]=i;
        }
        for(int j=0; j<=n; j++){
            ar[0][j]=j;
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    ar[i][j]=ar[i-1][j-1];
                }else{
                    ar[i][j]= 1+Math.min(ar[i-1][j-1], Math.min(ar[i-1][j], ar[i][j-1]));
                }
            }
        }return ar[m][n];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String A= sc.nextLine();
		String B= sc.nextLine();
		System.out.println(conversionCount(A, B));
	}

}
