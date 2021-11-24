package mail_types;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;


    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        String readMsg = "";
        // Create a file obj to read
        File file = new File(filename);
        // Read the file till the end
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                readMsg = readMsg.concat(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readMsg;
    }

    public static void main(String[] args) {

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current absolute path is: " + s);
        Client client = new Client("OSTAP", 18, Gender.MALE);
        MailInfo info = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
        String text = info.getMailText();

        System.out.println(text);
    }
}
