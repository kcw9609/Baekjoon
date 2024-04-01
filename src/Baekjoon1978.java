import java.util.Scanner;

public class Baekjoon1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			int N=scanner.nextInt();
			int[] num=new int[N];
			for(int i=0 ; i<N ; i++) {
				num[i]=scanner.nextInt();
			}
			int hap=0;
			for(int i=0 ; i<num.length ; i++) {
				if(num[i]==2)hap+=1;
				for(int j=2 ; j<=num[i]-1 ; j++) {
					
					if(num[i]%j==0)break;
					if(j==num[i]-1)hap+=1;
				}
			}
			System.out.print(hap);
			
	}

}
