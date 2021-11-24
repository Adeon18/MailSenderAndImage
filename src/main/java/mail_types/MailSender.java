package mail_types;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        System.out.println(mailInfo.getMailText());
    }
}
