import java.util.Scanner;
public class Baekjoon2941 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		char[] alpha=str.toCharArray();
		//구분
		//다음거가 특정문자면 크로아티아 문자로 간주
		//다음게 특정만자가 아니면 그냥 알파벳으로 간주
		//나머지
		int hap=0;
		for(int i=0 ; i<str.length() ; i++) {//01234
			
			if(i>=str.length()-1) {//01234
				hap+=1;break;
			}
			//char nextChar=alpha[i+1];
			
			switch(alpha[i]) {
			
			case 'c':if(alpha[i+1]=='=' || alpha[i+1]=='-')i+=1;break;
				
			case 'd':
				if(alpha[i+1]=='-') {i+=1;break;}
				else if(i+2<str.length()) {
				if(alpha[i+1]=='z')
					if(alpha[i+2]=='=')i+=2;			
			}break;
			case 'l':if(alpha[i+1]=='j')i+=1;break;
			case 'n':if(alpha[i+1]=='j')i+=1;break;
			case 's':if(alpha[i+1]=='=')i+=1;break;
			case 'z':if(alpha[i+1]=='=')i+=1;break;
			default:break;
			}
			
			hap+=1;
			
		}
		System.out.print(hap);
	}

}
