import java.util.*;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String X= sc.nextLine();
		int lhs=0, rhs=0;
		int mid= (X.length()-1)/2, last= X.length();
        for(int i=0; i<mid; i++) {
            lhs+= Integer.valueOf(X.charAt(i));
        }
        for(int i=mid+1; i<last; i++) {
            rhs+= Integer.valueOf(X.charAt(i));
        }
        System.out.println(lhs==rhs);
	}

}
