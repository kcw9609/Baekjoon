import java.util.Scanner;

public class Baekjoon2738{

  public static void  main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[][] arrA = new int[N][M];
    int[][] arrB = new int[N][M];

    //입력 받기
    for(int i= 0 ; i < N ; i++){
      for(int j=0 ; j< M ; j++){
        arrA[i][j]=scanner.nextInt();
      }
    }
    for(int i= 0 ; i < N ; i++){
      for(int j=0 ; j< M ; j++){
        arrB[i][j]=scanner.nextInt();
      }
    }
    for(int i= 0 ; i < N ; i++){
      for(int j=0 ; j< M ; j++){
        System.out.print(arrA[i][j]+arrB[i][j]);System.out.print(" ");
      }
      System.out.println();
    }

  }
}