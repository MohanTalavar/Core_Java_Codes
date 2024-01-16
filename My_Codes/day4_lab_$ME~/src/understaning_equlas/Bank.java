package understaning_equlas;

public class Bank {
	
	private int acctNo;
	private String name, type;
	private double balance;
		
	public Bank(int acctNo, String name, String type, double balance) {
		super();
		this.acctNo = acctNo;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("In acc equals");
		if(obj instanceof Bank)
			return this.acctNo==((Bank)obj).acctNo; //  also check aact type
		
		return false;
	}
		
	@Override
	public String toString() {
		return "Bank [acctNo=" + acctNo + ", name=" + name + ", type=" + type + ", balance=" + balance + "]";
	}

}
