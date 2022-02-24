import java.util.*;
public class Code {
	
	public static String vecStatus(int A[], int B[]) {
        int dot= A[0]*B[0] + A[1]*B[1] + A[2]*B[2];
		int cross= (A[1]*B[2]-A[2]*B[1])*(A[1]*B[2]-A[2]*B[1]) - (A[0]*B[2]-A[2]*B[0])*(A[0]*B[2]-A[2]*B[0]) + (A[0]*B[1]-A[1]*B[0])*(A[0]*B[1]-A[1]*B[0]);
		if(cross== 0)
			return "parallel";
		else if(dot == 0)
			return "perpendicular";
		return "none";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int A[]= new int[3];
		for(int i=0; i<3; i++) {
			A[i]= sc.nextInt();
		}
		int B[]= new int[3];
		for(int i=0; i<3; i++) {
			B[i]= sc.nextInt();
		}
		System.out.println(vecStatus(A,B));
	}

}
