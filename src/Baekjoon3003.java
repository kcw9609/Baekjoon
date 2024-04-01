import java.util.Scanner;

public class Baekjoon3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			int[] chess= {1, 1, 2, 2, 2, 8};
			int[] myChess= {0,0, 0, 0, 0, 0};
			for(int i=0 ; i<6 ; i++) {
				myChess[i]=scanner.nextInt();
			}
			for(int i=0 ; i<6 ; i++) {
				System.out.print(chess[i]-myChess[i]+" ");
				
			}
	}

}
