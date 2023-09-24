/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yohangosuone;
import java.util.*;
import java.text.*;
/**
 *
 * @author JhayJ
 */
public class YohanGosuOne {
    // global varialbe
    public static String fullName;
    static long age, contactNumber, calOpen;
    static double x,y,itec96, itec33, itec30, itec36, fili3, phed3;
    static int w;
    static String user1;
    static void tito(String string){
        System.out.print(string);
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        // calling a method calcu.java
        Date date = new Date(); // call Date() method
        calcu cl = new calcu(); // class calcu.java
        evennAndOdd ed = new evennAndOdd(); // class evennAndOdd;
        CalculatorWithGrade clg = new CalculatorWithGrade(); // 
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#.##");
       
        tito("Date : " + date.toString() + "\n");
        while(true){
        tito("Enter first name : ");
        fullName = scan.nextLine();
        
        if(fullName.length() >= 10)
        {
            tito("Please enter less than 10 character !!" + "\n");
            continue;
        }
        else if(fullName.isBlank())
        {
            tito("please enter value !!" + "\n");
            continue;
        }
        else if (fullName.startsWith("J", w))
        {
            tito("Welcome " + fullName + "\n");
            break;
        }
        else
        {
            break;
        }
       
        }
        while(true)
        {
        tito("Enter age : ");
        age = scan.nextLong();
         if(age < 18){
            tito("Minor age is not allowed" + "\n");
            continue;
        }
         else
         {
             break;
        }
        }
        
        tito("Enter contact No. : ");
        contactNumber = scan.nextLong();
        
        String[] selectAPP = {"1. Calculator","2. Even and Odd (update)","3. Calculator for Grade (update)","4. Coming soon","5. Coming soon"};
        tito("\nSelect from 1 to 5 ");
        tito(Arrays.toString(selectAPP) + "\n");
        
        while(true){
        tito("Enter: ");
        long calOpen = scan.nextLong();
      
        if(calOpen == 1){
            // call method
            cl.Calculator(x,y);
            break;
        }
        if(calOpen == 1){
           ed.EvennOdd(w);
           break;
        }
        if(calOpen == 3){
            clg.calcuWithGrades(itec96,itec33, itec30,  itec36, fili3,  phed3);
            break;
        }
        else{
            continue;
        }
        }
        
    }         
}
