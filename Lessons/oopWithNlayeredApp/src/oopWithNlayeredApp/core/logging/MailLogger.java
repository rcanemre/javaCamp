package oopWithNlayeredApp.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail Yoluyla loglandı : " + data);
		
	}

}
