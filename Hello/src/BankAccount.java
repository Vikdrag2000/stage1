
public class BankAccount {
	static String bankName ="SBI"; //Static Variable
	String accountHolderName;     //Instance Variable
	float balance;                //Instance Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        float interestRate = 2.5f;
        
        BankAccount obj = new BankAccount();
        System.out.println(obj.balance);
        System.out.println(interestRate);
        System.out.println(bankName);
	}

}
