import java.util.*;
class  BankCustomer{
	public static void main(String[] args) {
	BankInformation b1=new BankInformation();
	Scanner sc=new Scanner(System.in);
		System.out.println("\n*****Please Enter the 1st Holder BankInformation*****\n");
		System.out.println("Please Enter the Bank Name\t\t\t:");
		b1.BName=sc.nextLine();
		System.out.println("Please Enter the Branch Name\t\t\t:");
		b1.BranchName=sc.nextLine();
		System.out.println("Please Enter the Bank IFSC Code\t\t\t:");
		b1.IFSC=sc.nextLine();
		System.out.println("Please Enter the Bank Account Nmbr\t\t\t:");
		b1.AccountNmbr=sc.nextLong();
		System.out.println("Please Enter the Bank HolderName\t\t\t:");
		b1.Hname=sc.next();
		System.out.println("Please Enter the Bank Account Type (SAVINGS or CURRENT)\t:");
		b1.AcType=sc.next("int");
		System.out.println("Please Enter the Amount\t\t\t:");
		b1.Blns=sc.nextDouble();
		System.out.println("Insurence Available or not\t\t\t:");
		b1.insurenceAvbl=sc.next();
//=======================================================		
	    BankInformation b2=new BankInformation();
		//Scanner sc=new Scanner(System.in);
        System.out.println("\n*****Please Enter the 2nd Holder BankInformation*****\n");
		System.out.println("Please Enter the Bank Name\t\t\t:");
		b2.BName=sc.next();
		System.out.println("Please Enter the Branch Name\t\t\t:");
		b2.BranchName=sc.next();
		System.out.println("Please Enter the Bank IFSC Code\t\t\t:");
		b2.IFSC=sc.next();
		System.out.println("Please Enter the Bank Account Nmbr\t\t\t:");
		b2.AccountNmbr=sc.nextLong();
		System.out.println("Please Enter the Bank HolderName\t\t\t:");
		b2.Hname=sc.next();
		System.out.println("Please Enter the Bank Account Type (SAVINGS or CURRENT)\t:");
		b2.AcType=sc.next();
		System.out.println("Please Enter the Amount\t\t\t:");
		b2.Blns=sc.nextDouble();
		System.out.println("Insurence Available or not\t\t\t:");
		b2.insurenceAvbl=sc.next();
}
}
