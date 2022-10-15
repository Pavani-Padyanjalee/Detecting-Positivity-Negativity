/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.positive_or_negative;

import java.util.Scanner;

/**
 *
 * @author deepika
 */
public class Positive_or_Negative {

    public static void main(String[] args) {
        
        Scanner xy = new Scanner(System.in);
        System.out.println("Enter the number = ");
        double c = xy.nextDouble();
        
       if(c>0)
        {System.out.println("This number is a Positive Number.");
        }
       else if(c<0)
        {System.out.println("This number is a Negative number.");
        }
       else
       {System.out.println("This number is neither postive nor negative.");
       }
        xy.close();
    }
}
