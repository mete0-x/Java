
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class fakt {
    public static void main(String[] args){
     
      Scanner scanner = new Scanner(System.in);
       
         int N = 0;
         double e = 1;
         double fakt = 1;
  
         System.out.println("N Giriniz  :");
         N = scanner.nextInt();

            for(int i=1; i <= N; i++){
      
                  for(int j=1;j <= i;j++){
          
                        fakt = fakt*j;
                     
       }              
         e = e + 1.0/fakt;
    }
        
        System.out.println("e  : "+e);
 
  }
}
