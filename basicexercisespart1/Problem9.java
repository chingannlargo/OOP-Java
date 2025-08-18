/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter first number: ");
        int firstnum = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int secondnum = sc.nextInt();
        
        System.out.println("Enter third number: ");
        int thirdnum = sc.nextInt();
        
        int average = ((firstnum + secondnum + thirdnum));
        System.out.println("average: ");
    }
    
}
