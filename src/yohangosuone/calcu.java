/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yohangosuone;
import java.util.*;
/**
 *
 * @author JhayJ
 */
public class calcu {
    static void tita(String string){
        System.out.print(string);
    }
     double x, y, selectUser, h, itec96, itec30, itec36, itec33, fili3, phed3; // global variable
    Scanner scan = new Scanner(System.in);
            // calculator
            void Calculator (double x, double y){
             String[] Options = {"1. Plus","2. Divide", "3. Minus", "4.Multiply"};
            System.out.print("Enter first number : ");
            x = scan.nextDouble();
            
            System.out.print("Enter second number : ");
            y = scan.nextDouble();
            while(true){
            System.out.println("Select from 1 to 4  " + Arrays.toString(Options)); // show all the elements of the array
            System.out.print(": ");
            selectUser = scan.nextInt();
            if(selectUser == 1){
                sumM(x,y);
                break;
            }
             if(selectUser == 2){
                divideM(x,y);
                break;
            }
              if(selectUser == 3){
                minusM(x,y);
                break;
            }
               if(selectUser == 4){
                multiplyM(x,y);
                break;
            }
               else {
                   System.out.println("Invalid !!");
                   continue;
               } 
            }   
           
            }
           
         static double sumM (double x, double y){
            double sum = x + y;
            System.out.println(x + "+ "+ y + " = " + sum);
            return sum;
        }
         static double divideM (double x, double y){
            double dv = x / y;
            System.out.println(x + "+ "+ y + " = " + dv);
            return dv;
        }
          static double minusM (double x, double y){
            double mn = x - y;
            System.out.println(x + "+ "+ y + " = " + mn);
            return mn;
        }
           static double multiplyM (double x, double y){
            double ml = x * y;
            System.out.println(x + "+ "+ y + " = " + ml);
            return ml;
        }
            // even and odd
           
        
}
