package adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    private TwitterUser twUser;
    private MyTwitterUser twAdapted;
    private Date date;

    @BeforeEach
    void setUp() {
        date = new Date();
        twUser = new TwitterUser("karakum@gmail.com", "Timor-Leste", date);
        twAdapted = new MyTwitterUser(twUser);
    }

    @Test
    void getEmail() {
        assertEquals(twUser.getUserMail(), twAdapted.getEmail());
    }

    @Test
    void getDate() {
        assertEquals(twUser.getLastActiveTime(), twAdapted.getDate());
    }

    @Test
    void getCountry() {
        assertEquals(twUser.getCountry(), twAdapted.getCountry());
    }
}