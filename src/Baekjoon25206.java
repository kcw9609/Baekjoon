import java.util.Scanner;

public class Baekjoon25206 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//20개 입력받기
		//P이면 패스
		//P아니면 수강학점과 등급을 곱함?
		//3.0 A 2.0 B=12+6=18=3.6
		Scanner scanner=new Scanner(System.in);
		String[] subject=new String[20];
		double[] time=new double[20];
		String[] grade=new String[20];
		
		double hap=0;double totalTime=0;
		for(int i=0 ; i<20 ; i++) {
			subject[i]=new String(scanner.next());
			time[i]=scanner.nextDouble();
			grade[i]=scanner.next();//???
			
			switch(grade[i]) {
			case "A+":hap+=time[i]*(4.5);break;
			case "A0":hap+=time[i]*4;break;
			case "B+":hap+=time[i]*(3.5);break;
			case "B0":hap+=time[i]*3;break;
			case "C+":hap+=time[i]*(2.5);break;
			case "C0":hap+=time[i]*2;break;
			case "D+":hap+=time[i]*(1.5);break;
			case "D0":hap+=time[i]*1;break;
			case "F":hap+=0;break;
			default:break;
			}
			if(grade[i].equals("P")) {continue;}
			totalTime+=time[i];
		}
		String result=String.format("%6f", hap/totalTime);
		System.out.println(result);
	}

}
