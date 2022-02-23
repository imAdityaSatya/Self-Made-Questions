import java.util.*;
public class Code {
	public static ArrayList<Integer> triangleSum(int mat[][], int n) {
        ArrayList<Integer>a = new ArrayList<Integer>();
        int upper=0;   // upper triangular sum
        int lower=0;   // lower triangular sum
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                upper+= mat[i][j];
                lower+=mat[j][i];
            }
        }
        a.add(upper);
        a.add(lower);
        return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int [][]mat= new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		System.out.println(triangleSum(mat,n));
	}

}
