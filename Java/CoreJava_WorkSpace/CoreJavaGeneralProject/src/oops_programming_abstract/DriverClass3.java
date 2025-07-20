package oops_programming_abstract;

abstract class ComposeMail {
	public void message() {
		System.out.println("mail content here !!");
	}
	abstract public void recipient();
}

class SendMail extends ComposeMail {

	@Override
	public void recipient() {
		System.out.println("Recipient Name here !!");
	}
	
}

public class DriverClass3 {
	public static void main(String[] args) {
		SendMail sendMail = new SendMail();
		sendMail.message();
		sendMail.recipient();
	}
}
