public class SlackAdapter implements EmailSender {
private SlackNotifier slackNotifier;

public SlackAdapter(SlackNotifier slackNotifier) {
this.slackNotifier = slackNotifier;
}

@Override
public void sendEmail(String message) {
slackNotifier.sendMessageToSlackChannel(message);
}
}