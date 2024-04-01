import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon11718 {
  static void expr() { // 계산 
    /* expr -> bexp { '&' bexp | '|' bexp } | !expr | true | false */
        Object i = true;
        if((boolean)i == true){
            System.out.println("true");
        }
  
    }
    public static void main(String[] args) throws IOException{
        // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // String input = "" ;

        // while((input = bf.readLine())!= null) {
        //   bw.write(input + "\n");
        //   // System.out.println(input);
        // }
        // bw.flush();
        // bf.close();
        // bw.close();
        expr();
    
}

}

