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
public class Problem8 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input number of term: ");
        int count = sc.nextInt();
        
        for (int j = 0; j <= count; j++) {
            int cube = j * j * j;
            System.out.println("Number is : " + j + "and cube of" + j + " is :" + cube);
            
        }
    }
    
}
