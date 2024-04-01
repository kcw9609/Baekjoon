import java.util.Scanner;

public class Baekjoon7568 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int[][] kgcm=new int[n][2];
		for(int i=0 ; i<n ; i++) {
			kgcm[i][0]=scanner.nextInt();
			kgcm[i][1]=scanner.nextInt();
		}
		
		for(int i=0 ; i<n ; i++) {
			int rank=1;
			for(int j=0 ; j<n ; j++) {
				if(kgcm[i][0]==kgcm[j][0] && kgcm[i][1]==kgcm[j][1])
					continue;
				if(kgcm[i][0]<kgcm[j][0] && kgcm[i][1]<kgcm[j][1])
					rank+=1;
			}
			System.out.print(rank+" ");
			//같거나 자기자신이면 넘어감
			//크면 1증가
			//작으면 넘어감
			
		}

	}

}
