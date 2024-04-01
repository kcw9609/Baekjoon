import java.util.Scanner;

public class Baekjoon10988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		char[] charArray=str.toCharArray();
		int len=str.length()/2;
		int i;
		for( i=0 ; i<len ; i++) {
			if(charArray[i]!=charArray[str.length()-i-1]) {
				System.out.print(0);break;
			}
				
		}
		if(i==len)System.out.print(1);
	}

}
