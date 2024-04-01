

import java.util.Scanner;

public class Baekjoon1157 {
  

  public static void main(String[] args) {
    //a 97 A 65
    //z 122
    Scanner scanner = new Scanner(System.in);
    int alpha[]=new int[26];
    for(int i=0 ; i<26 ; i++){
      alpha[i]=0;
    }
    
    //입력받기
    String str=scanner.nextLine();
    char[] arr = str.toCharArray();

    for(int i=0 ; i<str.length() ; i++){
      //대문자 소문자 구별안함
      //배열에 숫자 증가
      if(arr[i]>=97) 
        alpha[(int)arr[i]-65-32]+=1;
      else
        alpha[(int)arr[i]-65]+=1;
      
    }
    
    //가장 많이 쓰인 알파벳 찾기
      //알파벳 배열에 숫자 증가시키기
      int tmp=-1;
      int max=-1;
      int tmp2=-1;
      int i;
    for(i=0 ; i < 26 ; i++){
      
      if(alpha[i] >= tmp){
        if(alpha[i]==tmp)tmp2=tmp;
        tmp = alpha[i];
        max = i;
      }

    }
    if(tmp == tmp2)System.out.println("?");
    else{
      max+=65;
      //출ㄹ력
      System.out.println((char)max);
    }
   
  }
}
