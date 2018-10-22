/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 1795037
 */
import java.util.Scanner;
import java.util.Random;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int elmnt, rnmnum;
        int obj;
        int search;
        int psfnd = 0;
        Scanner keyboard = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("how many elements ? ");
        elmnt = keyboard.nextInt();
        int array[] = new int[elmnt];
        for (int i = 0; i < elmnt; i++) {
            array[i] = ran.nextInt(999);
            System.out.println((i + 1) + " : " + array[i]);
        }
        System.out.println(" ");
        System.out.println("which number to search ? ");
        search = keyboard.nextInt();
        for (int i = 0; i < elmnt; i++) {
            if (search == array[i]) {
                psfnd = i + 1;
            }

        }
        if (psfnd == 0) {
            
             System.out.println(" "); 
             
            System.out.println("nhi labha ");

        } else {
             System.out.println(" ");
             
            System.out.println("element found at index : " + psfnd);
        }
         System.out.println(" ");
          System.out.println(" End of this assignment");
    }
    
}
