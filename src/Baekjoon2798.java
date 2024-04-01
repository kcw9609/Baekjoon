import java.util.Scanner;

public class Baekjoon2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력받기
		//
		
		//이전보다 크고 && M보다 작으면 저장후 다음 진행
		//이전보다 작거나 M보다 크면 continue
		
		Scanner scanner =new Scanner(System.in);
		int N=scanner.nextInt();//수
		int M=scanner.nextInt();//크기
		
		int[] array=new int[N];
		for(int i=0 ; i<N ; i++) {
			array[i]=scanner.nextInt();
		}
		
		
		int hap=0, temp=0;
		for(int i=0 ; i<N ; i++) {//0~9
			for(int j=i+1 ; j<N ; j++) {//
				
				for(int k=j+1 ; k<N ; k++) {//
					//이전보다 크고 && M보다 작으면 저장후 다음 진행
					//이전보다 작거나 M보다 크면 continue
					temp=array[i]+array[j]+array[k];
					if(temp<=M && temp>hap)hap=temp;
					else continue;
				}
			}
		}
		System.out.print(hap);
	}

}
