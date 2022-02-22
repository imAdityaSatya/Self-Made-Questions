import java.util.*;
public class Code {

	public static boolean isPangram(String s) {
        int n= s.length();
        if(n<26){
            return false;
        }
        s= s.toLowerCase();
        for(int i='a'; i<='z'; i++){
           if(s.indexOf(i)<0){
               return false;
           }
       }return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		if(isPangram(s)) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not pangram");
		}
	}

}

