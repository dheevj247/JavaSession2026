package complietimepolymorphsimvariableshadowing;



public class Driver {
   public static void main(String[] args) 
   {
	   //1.	Reference type, not based on the type of object created.
	SBI b2 = new SBI();
	System.out.println(b2.home_loan_interest); // 0.0  If the child variable is not initialized, 
	                                            //Java gives it the default value (0.0 for double)
	ICICI_Bank b1 = new ICICI_Bank();
	System.out.println(b1.home_loan_interest); //6.2 we have initi in Bank class
   }
}


