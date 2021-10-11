/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day;

import java.util.Scanner;

/**
 *
 * @author Sakib
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any integer");
        num = input.nextInt();
        if(num%2==0)
        { 
            System.out.println("It's Even Brother");
        }
        else {
            System.out.println("It's Odd Brother");
        }
      }
        
    }
    
    

