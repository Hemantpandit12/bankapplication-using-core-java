package raj.kaj.saj;

public class bankapplication {
	
			private String Number;
			private double Balance;
			private String Name;
			private String Email;
			private String PhoneNumber;

	public bankapplication(String Number,double Balance,String Name,String Email,String PhoneNumber) {
		// TODO Auto-generated constructor stub
				this.Number=Number;
				this.Balance=Balance;
				this.Name=Name;
				this.Email=Email;
				this.PhoneNumber=PhoneNumber;
		
	}
	
		public void depositMoney(double depositMoney) {
			this.Balance+=depositMoney;
			System.out.println("deposit is successful, new Balance is" +this.Balance);
		}
		
		public void withdrawMoney(double withdrawalMoney) {
			
			if(this.Balance - withdrawalMoney < 0) {
				System.out.println("withdraw Unsuccessful only" +this.Balance+" is left");
			}else {
				this.Balance-=withdrawalMoney;
				System.out.println("withdraw successful, Current Balance is "+this.Balance);
			}
		}

		
		
		
	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

						

}
