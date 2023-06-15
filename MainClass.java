package AtmMachineProject;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		AtmOperationInterfa op=new AtmOperationImpl();
		int atmnumber=12345;
		int atmpin=123;
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !!!");
		System.out.print("Entre Atm Number: ");
		int atmNumber=in.nextInt();
		System.out.print("Entre Atm Pin: ");
		int atmPin=in.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==atmPin))
		{
			while(true) {
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.View MiniStatment\n5.Exit");
			    System.out.println("Entre choice : ");
			    int ch=in.nextInt();
			    if(ch==1) 
			    {
			    	op.viewBalance();
			    	
			    }
			    else if(ch==2) 
			    {
			       System.out.println("Entre aount to withdeaw");
			       double withdrawAmount=in.nextDouble();
			       op.withdrawAmount(withdrawAmount);
			    }
			    else if(ch==3) 
			    {
			      System.out.println("Entre Amount to Deposite :");	
			      double depositAmount=in.nextDouble();
			      op.depositAmount(depositAmount);
			    }
			    else if(ch==4) 
			    {
			      op.viewMiniStatement();	
			    }
			    else if(ch==5) 
			    {
			    	System.out.println("Collect your Atm Card\nThank you for using Atm Machine ");
			        System.exit(0);
			    }
			    else {
			    	System.out.println("Please enter correct choice");
			    }
			}
		}
		else 
		{
			System.out.println("Incorrect Atm Number or pin");
			System.exit(0);
		}

	}

}
