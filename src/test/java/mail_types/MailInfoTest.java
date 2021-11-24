package mail_types;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {

    Client client;
    MailInfo info;
    @BeforeEach
    void setUp() {
        client = new Client("Ostap", 18, Gender.MALE);
        info = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
    }

    @Test
    void getMailText() {
        assertEquals("Happy birthday Ostap!", info.getMailText());
    }
}