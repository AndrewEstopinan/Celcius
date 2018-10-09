/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celcius;

import java.util.Scanner;

/**
 *
 * @author 20119
 */
public class Celcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //two_two();
        two_three();
        
    }
    public static void two_two() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Print Your Celsius");
        double celsius = kb.nextDouble();
        double fahrenheit;
        fahrenheit = (9 / 5) * celsius + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
    public static void two_three(){
        Scanner cy = new Scanner(System.in);
        System.out.println("Print Your Radius");
        double radius = cy.nextDouble(); 
        System.out.println("Print your Length");
        double length = cy.nextDouble();
        double p = 3.14;
        double area = radius * radius * p;
        System.out.println("Area: "+area );
        double volume = area * length;
        System.out.println("Volume: "+volume);
        
    }
}
