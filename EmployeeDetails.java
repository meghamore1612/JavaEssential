package com.assignement_day3;


	
		class EmployeeDetails
	    {
	       
	        String Name;
	        int birthdate;
	        int birthMonth;
	        int birthyear;
	        long Salary;

	       EmployeeDetails()           // Default Constructor
	        {
	            
	            Name = "Kumar";
	            birthdate=16;
		        birthMonth=12;
		         birthyear=1995;
	            Salary = 45000;
	        }

	        void PutData()
	        {
	            
	            System.out.print("\n\tEmployee Name   : "+Name);
	            System.out.print("\n\tEmployee Birthdate    : "+birthdate);
	            System.out.print("\n\tEmployee Birthmonth    : "+birthMonth);
	            System.out.print("\n\tEmployee Salary : "+Salary);
	        }

	        public static void main(String args[])
	        {

	        	EmployeeDetails E = new EmployeeDetails();// Creating Object

	            E.PutData();          // Calling PutData()

	        }
	    }

	
	
