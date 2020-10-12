package com.assignement_day3;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		 float eng, phy, chem, math, comp; 
	     double total, average, percentage;
	    Scanner op=new Scanner(System.in);
	    /* Input marks of all five subjects */
	    System.out.println("Enter marks of five subjects:");
	    System.out.print("Enter marks of English subjects:");
	    eng=op.nextFloat();
	    System.out.print("Enter marks of physics subjects:");
	    phy=op.nextFloat();
	    System.out.print("Enter marks of chemistry subjects:");
	    chem=op.nextFloat();
	    System.out.print("Enter marks of maths subjects:");
	    math=op.nextFloat();
	    System.out.print("Enter marks of computers subjects:");
	    comp=op.nextFloat();

	    /* Calculate total, average and percentage */
	    total = eng + phy + chem + math + comp;
	   
	    percentage = (total / 500.0) * 100;

	    
	    average = (total / 5.0);
	    System.out.println("\n");
	    System.out.print("The student Grade is: ");
        if(average>=80)
        {
            System.out.print("A");
        }
        else if(average>=60 && average<80)
        {
           System.out.print("B");
        } 
        else if(average>=40 && average<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
	    
	    
	    
	    /* Print all results */
	    
	    System.out.println("Percentage = "+percentage);

	}

}
