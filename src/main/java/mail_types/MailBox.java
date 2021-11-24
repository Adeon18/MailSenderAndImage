package mail_types;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo info) {
        infos.add(info);
        System.out.println("New info added.");
    }

    public void sendAll() {
        MailSender sender = new MailSender();
        for (int i = 0; i < infos.size(); i++) {
            sender.sendMail(infos.get(i));
        }
    }
}
