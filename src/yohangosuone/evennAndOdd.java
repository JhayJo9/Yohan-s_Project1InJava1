/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yohangosuone;

import static yohangosuone.calcu.tita;
import java.util.*;
/**
 *
 * @author JhayJ
 */
public class evennAndOdd 
{
   // static int w; // global variable
    static void print(String string)
    {
        System.out.print(string);
    }
     void EvennOdd(int w)
            { 
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter number : ");
                w = scan.nextInt();
                while(true){
                if(w % 2 == 0){
                    tita("Even number : " + w + "\n");
                    break;
                }
                else if(w % 1 == 0){
                     tita("Odd number : " + w + "\n");
                     break;
                }
                else {
                    tita("Invalid");
                    continue;
                }
                }
            }
    
}
