import java.util.Scanner;

public class Baekjoon19532 {
  public static void main(String[] args) {
    /*
     * ax + by = c
     * dx + ey = f
     * 
     * (a + d)x + (b + e)y = (c + f)
     * (a - d)x + (b - e)y = (c - f)
     * ax = c - by
     * dx = f - ey
     * 
     * x = (c - by)//a
     * x = (f - ey)//d
     * (c - by)//a = (f - ey)//d = x
     */

     // 입력
     Scanner scanner = new Scanner(System.in);
     double a, b, c, d, e, f; double x= 0; double y=0;
     a = scanner.nextInt();
     b = scanner.nextInt();
     c = scanner.nextInt();
     d = scanner.nextInt();
     e = scanner.nextInt();
     f = scanner.nextInt();
     // zero by - 나누는 수가 0인 경우
     // a와 b를 서로 곱해서 사용할 것이기 때문에,
     // 0이 들어있나 확인해야한다.
     if(d==0) {
      y = f / e;
      x = (c - b * y) / a;
      
     }else if (a==0){
      y = c/b;
      x = (f - e*y)/d;
     }
     else {
      // 최소공배수로 곱해서 
     double m2a = d; double m2d = a;
     a=a*m2a;b= b*m2a;c= c*m2a;
     d=d*m2d;e=e*m2d;f=f*m2d;

     // 빼줌
     if(( b - e )== 0) {
      
        y = (c + f)/(b + e);
        x = (c - b * y) / a;
      
     }else {
        y = (c - f)/(b - e);
        x = (c - b * y) / a;
      
     }
     
     // y 값 계산 후 , 
     // 대입하여 x 구함
  }
  System.out.println(Math.round(x) + " " + Math.round(y));


     }

     
  
}
