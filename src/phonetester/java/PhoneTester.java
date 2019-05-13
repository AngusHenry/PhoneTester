/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonetester.java;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class PhoneTester {
  public static void main(String [] args){
      String car, ty;
      double spe,mem;
      int numA;
    CellPhone p1 = new CellPhone();
    p1.setCarrier("Rogers");
    p1.setType("IPhone");
    p1.setSpeed (1.2);
    p1.setMemory(64.0); 
    p1.setnumApps(10);

    System.out.println("Carrier = " + p1.getCarrier());
    System.out.println("Type of phone = " + p1.getType());
    System.out.println("Speed of phone = " + p1.getSpeed()+"Ghz");
    System.out.println("Memory = "+p1.getMemory()+"Gb");
    System.out.println("Number of Apps = "+p1.getnumApps());
    CellPhone p2 = new CellPhone();
    Scanner input = new Scanner(System.in);
    System.out.println ("What is your phone carrier?");
    car = input.next();
    System.out.println ("What type of phone do you have?");
    ty = input.next();
  System.out.println ("How fast is your phone in Ghz?");
  spe = input.nextDouble();
  System.out.println ("How much memory do you have on your phone in Gb");
  mem = input.nextDouble();
  System.out.println ("How many apps do you have on you phone?");
  numA = input.nextInt();
    p2.setCarrier(car);
    p2.setType(ty);
    p2.setSpeed (spe);
    p2.setMemory(mem); 
    p2.setnumApps(numA);
    System.out.println("Carrier = " + p2.getCarrier());
    System.out.println("Type of phone = " + p2.getType());
    System.out.println("Speed of phone = " + p2.getSpeed()+"Ghz");
    System.out.println("Memory = "+p2.getMemory()+"Gb");
    System.out.println("Number of Apps = "+p2.getnumApps());
  }
}
          
