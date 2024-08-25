import java.util.*;
public class B3009 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] p = new int[2][3];

    // 입력
    for(int i =0 ; i<3 ; i++) {
      p[0][i] = s.nextInt();
      p[1][i] = s.nextInt();
    }
     
    // x가 같은지 y가 같은지 확인
    int tempx=0;
    int tempy=0;

    // 10 20 10
    // t=10, 20
    // 20 10 10
    // t=20, t=
    // 20 20 10
    // t=20, 10
    for(int i =0 ; i< 2 ; i++) {
      if (p[0][i] != p[0][i+1] &&  p[0][i] != tempx ) {
        tempx = p[0][i];        
      } else if (p[0][i] == p[0][i+1] && tempx ==0) {
        tempx = p[0][i]; 
      } else if(p[0][i] != p[0][i+1] &&  p[0][i] == tempx){
        tempx =p[0][i+1];
      }
      if (p[1][i] != p[1][i+1] &&  p[1][i] != tempy ) {
        tempy = p[1][i];        
      }  else if (p[1][i] == p[1][i+1] && tempy ==0) {
        tempy = p[1][i]; 
      } else if(p[1][i] != p[1][i+1] &&  p[1][i] == tempy){
        tempy =p[1][i+1];
      }
    }
    System.out.println(tempx + " " + tempy);
    
  }
  
}

