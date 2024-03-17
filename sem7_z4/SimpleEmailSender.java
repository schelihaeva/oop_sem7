public class SimpleEmailSender implements EmailSender {
@Override
public void sendEmail(String message) {
System.out.println("Sending email: " + message);
}
}