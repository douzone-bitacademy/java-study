package prob5;

public class Account {
	private String accountNo;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		
		System.out.println(this.accountNo + " 계좌가 개설되었습니다.");
	}
}