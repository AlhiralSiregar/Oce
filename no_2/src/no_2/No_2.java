/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no_2;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class No_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);   
    int oce1,oce2;
    int sum=0;
    System.out.println("Input");
    System.out.print("Awal    : ");
    oce1=in.nextInt();
    System.out.print("Akhir   : ");
    oce2=in.nextInt();
    System.out.println("Output");
    System.out.print("Deret bilangan prima antara "+oce1+" dan "+oce2+" adalah \n");
    int num=oce1;
    while (num <= oce2) {
        int tmp = 0;
        for (int i=2; i<num; i++) {
            if (num%i==0){
                tmp=1;
            }
        }
        if (tmp != 1){
            //System.out.print(num);
            sum+=num;
        }
        num++;
    }

} // TODO code application logic here
    }
    

