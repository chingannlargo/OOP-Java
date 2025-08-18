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
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input First Number: ");
        int firstnum = sc.nextInt();
        
        System.out.print("Input Second Numbere: ");
        int secondnum =sc.nextInt();
        
        System.out.println("Expected Output: ");
        int sum = firstnum + secondnum;
        int diff = firstnum - secondnum;
        int prod = firstnum * secondnum;
        int quot = firstnum / secondnum;
        int mod = firstnum % secondnum;
        
        System.out.println(firstnum + " + " + secondnum + " = " + sum);
        System.out.println(firstnum + " - " + secondnum + " = " + diff);
        System.out.println(firstnum + " * " + secondnum + " = " + prod);
        System.out.println(firstnum + " / " + secondnum + " = " + quot);
        System.out.println(firstnum + " % " + secondnum + " = " + mod);
        
    }
}
