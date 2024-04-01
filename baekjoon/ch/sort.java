package ch;

import java.util.Scanner;
public class sort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int count = scanner.nextInt();
        arr = new int[count];
        for(int i=0 ; i<count ;  i++){
            arr[i]= scanner.nextInt();

            }
                    
            for(int j=0 ; j< count ; j++){
                for(int i=0 ; i<j ; i++){
                    if(arr[j] < arr[i]) {
                        int temp=arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        
                }
                }
                
        }
        for(int s: arr){
            System.out.println(s);
        }
        
        
    }
    
}