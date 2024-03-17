public class Main {
public static void main(String[] args) {
EmailSender emailSender = new SimpleEmailSender();
emailSender.sendEmail("Привет, это тестовое сообщение!");

SlackNotifier slackNotifier = new SlackNotifier();
EmailSender slackAdapter = new SlackAdapter(slackNotifier);
slackAdapter.sendEmail("Привет, это сообщение отправлено в Slack!");
}
}