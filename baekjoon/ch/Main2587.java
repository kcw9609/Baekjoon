package ch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
public class Main2587 {
  public static void main(String[] args) {
    // 5개의 자연수가 주어질때 평균과 중앙값을 출력(100보다 작은 10의 배수)
    //입력
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[5];
    int sum=0;
    for(int i=0 ; i< 5 ; i++) {
      int number = scanner.nextInt();
      arr[i]=number;
      sum +=number;
    }

    //평균
    //중앙값
    for(int i=0 ; i<5 ; i++) {
      for(int j=0 ; j<i ; j++) {
        if(arr[i] < arr[j]) {
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    int mid = arr[2];
    //출력
    System.out.println(sum/5);
    System.out.println(mid);
  }
  
}
