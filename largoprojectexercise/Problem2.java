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
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        
        System.out.println("Input number: ");
        System.out.println(num);
        System.out.println("Expected Output: ");
        
        if (num % 3 == 0)   {
            System.out.println(num + " is divisible by 3 ");
        }
        else
            System.out.println(num + " is not divisible by 3 ");
    }
    
}
