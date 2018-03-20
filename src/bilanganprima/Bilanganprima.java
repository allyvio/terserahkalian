/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bilanganprima;
import java.util.Scanner;
/**
 *
 * @author Allyvio
 */
public class Bilanganprima {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input;
        Scanner vio = new Scanner(System.in);
        System.out.print("Masukan batas :");
        input=vio.nextInt();
        for (int i=2; i<input; i++){
            boolean Prima = true;
             
            for (int j=2; j<i; j++){
                if(i%j==0){
                    Prima= false;
                    break;
                }
            }
            if(Prima==true)
                System.out.print(i+" ");
            
            
            
        }
    }
    
}
