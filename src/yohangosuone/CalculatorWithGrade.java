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
public class CalculatorWithGrade {
    void calcuWithGrades(double itec96, double itec33, double itec30, double itec36, double fili3, double phed3){
        Scanner scan = new Scanner(System.in);
            tita("Enter ITEC96 : ");
            itec96 = scan.nextDouble();
            
            tita("Enter ITEC33 : ");
            itec33 = scan.nextDouble();
            
            tita("Enter ITEC30 : ");
            itec30 = scan.nextDouble();
            
            tita("Enter ITEC36 : ");
            itec36 = scan.nextDouble();
            
            tita("Enter fili3 : ");
            fili3 = scan.nextDouble();
            
            tita("Enter phed3 : ");
            phed3 = scan.nextDouble();
            
            double ave = (itec96 + itec33 + itec30 + itec36 + fili3 + phed3)/6;
            tita("Average : " + ave + "\n");
        }
}
