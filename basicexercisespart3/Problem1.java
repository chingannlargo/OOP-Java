/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble ();
        
        double celsius = (fahrenheit - 32)* 5/ 9;
        
        System.out.println( fahrenheit + "degrees fahrenheit is equal to" + celsius + "in celsius");
    }
    
}
