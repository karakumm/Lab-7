package adapter;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender sender;
    FacebookUser fbUser;
    MyFacebookUser fbAdapted;
    Date date;

    @BeforeEach
    void setUp() {
        fbUser = new FacebookUser("oleno4ka@gmail.com", "Honduras", date);
        fbAdapted = new MyFacebookUser(fbUser);
        sender = new MessageSender();
    }

    @Test
    void send() {
        assertEquals(sender.send("hello", fbAdapted, "Honduras"), true);
    }
}