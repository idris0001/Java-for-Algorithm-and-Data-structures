/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;
import java.util.Scanner; 
/**
 *
 * @author Monet
 */
public class Recursion {
       
    public static long factorial(long n)
    { 
//        Scanner sc = new Scanner(System.in);
//         System.out.print("enter number");
//         number = sc.nextLong();
        if (n <= 1 )
            return 1; 
        else 
            return n*factorial(n-1);  
//        System.out.println("enter n");
    } //end method recursionFact 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //test factorial class
        // TODO code application logic here
        //main method
        //calling the recursive function 
        Scanner input = new Scanner (System.in); 
        System.out.print("enter n:");
       int n = input.nextInt();
        
       for (int c= 0; c<=21; c++)
            
//            System.out.Println('Answer = '+recursionFact(i)); 
          System.out.println(+c+"!" +" =" +"\t" +factorial(c)); 
        
    }//end main method
    
} //end class recursion