package com.narayantutorial.creational.abstractfactorymethod;

public class LoanFactory extends AbstractFactory{  

	@Override
	public Loan getLoan(String loan){  
	      if(loan == null){  
	         return null;  
	      }  
	      if(loan.equalsIgnoreCase("Home")){  
	         return new HomeLoan();  
	      } else if(loan.equalsIgnoreCase("Business")){  
	         return new BussinessLoan();  
	      } else if(loan.equalsIgnoreCase("Education")){  
	         return new EducationLoan();  
	      }  
	      return null;  
	   }

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}  
}
