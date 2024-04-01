package ch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main1181 {
  // 길이가 짧은 순서
  // 사전순
  // 중복제거
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<>();

    int count = scanner.nextInt();
    scanner.nextLine();
    for(int i=0 ; i < count ; i++) {
      String str = scanner.nextLine();
      
      if(!arr.contains(str)){arr.add(str);}
      
    }
    //arr.sort(Comparator.naturalOrder());
    Comparator<String> c = new Comparator<>() {
      public int compare(String a, String b) {
        if(a.length() > b.length()) return 1;

        else if(a.length() == b.length() ) {
          if(a.compareTo(b) > 0 ){return 1;}
          else {return -1;}
        }

        else {return -1;}
      }
    };
    arr.sort(c);
    for(String s: arr ){
      System.out.println(s);
    }



  }
  
}
