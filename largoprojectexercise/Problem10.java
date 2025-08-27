/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package largoprojectexercise;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Input the number: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
            for (int space = 0; space < 10; space++) {
                System.out.println(" ");
                
                
            }
            for (int star = 0; star < 10; star++) {
                System.out.println("*");
                
            }
            System.out.println();
        }
        
    }
    
}
